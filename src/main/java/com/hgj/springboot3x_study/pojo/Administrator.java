package com.hgj.springboot3x_study.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

//@Component
@Configuration
@Data
@ConfigurationProperties(prefix = "admin")
public class Administrator {
    private String username;
    private String password;
    private Integer age;
    private Map<String,String> relatedPerson;
    private List<String> roles;

    @Override
    public String toString() {
        return "Administrator{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", relatedPerson=" + relatedPerson +
                ", roles=" + roles +
                '}';
    }
}
