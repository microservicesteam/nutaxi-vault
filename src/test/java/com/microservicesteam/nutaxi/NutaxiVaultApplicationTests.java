package com.microservicesteam.nutaxi;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NutaxiVaultApplicationTests {

    @Autowired
    NutaxiVaultService service;

    @Test
    public void shoudlVaultLookupWork() {
        assertThat(service.password).isEqualTo("H@rdT0Gu3ss");
    }

}
