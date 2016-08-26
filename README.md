# nutaxi-vault

Spring Boot application for testing the connection to the nutaxi Vault server

## Vault

Vault secures, stores, and tightly controls access to tokens, passwords, certificates, API keys, and other secrets in modern computing. Vault handles leasing, key revocation, key rolling, and auditing. Through a unified API, users can access an encrypted Key/Value store and network encryption-as-a-service, or generate AWS IAM/STS credentials, SQL/NoSQL databases, X.509 certificates, SSH credentials, and more.

### Local Vault Setup

*Prerequisites*

* Install [Docker](https://docs.docker.com/engine/installation/)

*Steps*

* Start Vault instance

```
docker run -p 8200:8200 -d --name=nutaxi-vault-dev vault
```

* Check that the instance has been started

```
docker ps
```

* Execute the following commands with

```
docker exec -it nutaxi-vault-dev /bin/sh
```

* Then type these

```
export VAULT_ADDR=http://127.0.0.1:8200
```

* Create a new token

```
vault token-create
```

* Copy the token, set to `VAULT_TOKEN` and update the `spring.cloud.vault.token` property in the `bootstrap.properties`

```
export VAULT_TOKEN={token}
```
* Save a secret

```
vault write secret/nutaxi-vault password=H@rdT0Gu3ss
```

*  Start the application
