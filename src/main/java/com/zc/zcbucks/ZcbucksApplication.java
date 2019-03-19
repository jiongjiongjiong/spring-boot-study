package com.zc.zcbucks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ZcbucksApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZcbucksApplication.class, args);
    }

}
