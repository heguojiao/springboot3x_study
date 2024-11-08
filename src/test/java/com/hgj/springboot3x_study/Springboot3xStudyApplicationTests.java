package com.hgj.springboot3x_study;

import com.hgj.springboot3x_study.pojo.Administrator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot3xStudyApplicationTests {

    @Autowired
    private Administrator administrator;

    @Test
    void contextLoads() {
        System.out.println(administrator.toString());
    }

}
