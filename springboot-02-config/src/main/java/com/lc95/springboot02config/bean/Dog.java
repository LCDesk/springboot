package com.lc95.springboot02config.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Dog {
    private String name;
    private int age;
}
