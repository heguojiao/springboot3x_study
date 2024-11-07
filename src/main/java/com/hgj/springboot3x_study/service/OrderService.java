package com.hgj.springboot3x_study.service;

import com.hgj.springboot3x_study.configuration.ConditionalOnReadWriteMode;
import org.springframework.stereotype.Component;

@ConditionalOnReadWriteMode
@Component
public class OrderService {
}
