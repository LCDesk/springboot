package com.lc95.springboot06datajpa;

import com.lc95.springboot06datajpa.entity.User;
import com.lc95.springboot06datajpa.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot06DataJpaApplicationTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void contextLoads() {
        System.out.println(userRepository.findById(1).get());

    }

}
