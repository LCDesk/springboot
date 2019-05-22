package com.lc95.springboot02config.config;

import com.lc95.springboot02config.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 指明当前类是一个配置类
 */
@Configuration
public class MyAppConfig {
    /**
     * 将方法的返回值添加到容器中，默认id就是方法名
     *
     * @return
     */
    @Bean
    public HelloService helloService() {
        System.out.println("给容器中添加组件了");
        return new HelloService();
    }

}
