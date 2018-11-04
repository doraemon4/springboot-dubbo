package com.stephen.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Auther: jack
 * @Date: 2018/11/3 11:46
 * @Description:
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo-provider.xml"})
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
