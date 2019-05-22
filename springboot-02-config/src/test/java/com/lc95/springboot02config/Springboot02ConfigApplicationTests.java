package com.lc95.springboot02config;

import com.lc95.springboot02config.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext aop;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
