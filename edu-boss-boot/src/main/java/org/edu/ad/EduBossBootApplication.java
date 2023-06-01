package org.edu.ad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
// 扫描远程调用包
@EnableFeignClients("org.edu")
public class EduBossBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduBossBootApplication.class, args);
    }
}
