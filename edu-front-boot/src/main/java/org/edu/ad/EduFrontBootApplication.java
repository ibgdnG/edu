package org.edu.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("org.edu")
public class EduFrontBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduFrontBootApplication.class, args);
    }

}
