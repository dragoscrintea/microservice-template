package uk.co.fastforwardlabs.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Dragos-Liviu Crintea on 19/02/2017.
 */

@SpringBootApplication
public class ServiceStartBootstrap {

    public static void main(String[] args) {

        // service bootstrapper
        SpringApplication.run(ServiceStartBootstrap.class, args);

    }

}
