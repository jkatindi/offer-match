package com.katindi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;


@SpringBootApplication
@EnableKafka
public class DispatcherJobMicroserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(com.katindi.DispatcherJobMicroserviceApplication.class, args);
    }

}
