package com.microservicesteam.nutaxi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class NutaxiVaultService {

    @Value("${password}")
    String password;

}
