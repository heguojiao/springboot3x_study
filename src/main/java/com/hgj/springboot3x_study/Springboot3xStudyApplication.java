package com.hgj.springboot3x_study;

import com.hgj.springboot3x_study.service.AppConfig;
import com.hgj.springboot3x_study.service.OrderService;
import com.hgj.springboot3x_study.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot3xStudyApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Springboot3xStudyApplication.class, args);
        System.out.println(configurableApplicationContext.getBean(AppConfig.class));

    }

}

