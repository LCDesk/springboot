package com.lc95.starter.lc95springbootstarterautoconfigurer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloServiceProperties.class)
public class HelloServiceAutoConfiguration {
    @Autowired
    HelloServiceProperties helloServiceProperties;

    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setHelloServiceProperties(helloServiceProperties);
        return helloService;
    }

}
