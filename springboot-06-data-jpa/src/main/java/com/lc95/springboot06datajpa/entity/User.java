package com.lc95.springboot06datajpa.entity;

import lombok.Data;

import javax.persistence.*;

//配置映射关系
@Entity
@Table(name = "tbl_user")//如果省略默认表名师类名
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增策略
    private Integer id;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
}
