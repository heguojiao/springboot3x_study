package com.hgj.springboot3x_study.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.Retention;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@ConditionalOnProperty(name = "spring.application.read-only-mode", havingValue = "false", matchIfMissing = true)
public @interface ConditionalOnReadWriteMode {
}
