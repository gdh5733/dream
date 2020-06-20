package com.dream.starting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})

public class StartingApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartingApplication.class, args);
    }

}
