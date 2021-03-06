package com.own.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by yyh on 2018/9/4.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {


    public static void main(String args[]){
        SpringApplication.run( EurekaServerApplication.class, args );
    }

}
