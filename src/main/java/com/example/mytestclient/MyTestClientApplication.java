package com.example.mytestclient;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class MyTestClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyTestClientApplication.class, args);
    }

}
