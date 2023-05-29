package ru.micro.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = ReactiveUserDetailsServiceAutoConfiguration.class)
public class BackendGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendGatewayApplication.class, args);
    }

}
