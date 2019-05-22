package com.lc95;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringApplication标注这个是一个SPringBoot项目
 */


@SpringBootApplication
public class HelloWorldMain {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMain.class, args);
    }

}
