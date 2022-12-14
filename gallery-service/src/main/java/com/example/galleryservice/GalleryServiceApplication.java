package com.example.galleryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEurekaClient
@PropertySource({ "classpath:application.yml" })
public class GalleryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GalleryServiceApplication.class, args);
    }

}
