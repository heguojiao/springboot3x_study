package com.hgj.springboot3x_study.service;

import com.hgj.springboot3x_study.config.ConditionalOnReadWriteMode;
import org.springframework.stereotype.Component;

@ConditionalOnReadWriteMode
@Component
public class OrderService {
    public OrderService() {
        System.out.println("加载OrderService");

    }
}
