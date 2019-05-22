package com.lc95.springboot02config.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Data
/**
 *将本类属性和配置文件对应,必须是容器中的组件
 */
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = "classpath:person.properties")
@Component
//@Validated
public class Person {

    //@Value("${person.name}")
//    @Email
    private String name;
    //@Value("${person.age}")
    private int age;
    //@Value("${person.boss}")
    private Boolean boss;
    //@Value("${person.birth}")
    private Date birth;
    //@Value("${person.maps}")
    private Map<String, Object> maps;
    //    @Value("${person.list}")
    private List<Object> list;
    //    @Value("${person.dog}")
    private Dog dog;

}
