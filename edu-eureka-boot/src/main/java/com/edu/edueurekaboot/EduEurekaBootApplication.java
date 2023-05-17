package com.edu.edueurekaboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EduEurekaBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduEurekaBootApplication.class, args);
    }

}
