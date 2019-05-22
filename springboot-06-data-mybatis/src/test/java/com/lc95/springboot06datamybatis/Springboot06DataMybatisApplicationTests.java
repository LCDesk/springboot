package com.lc95.springboot06datamybatis;

import com.lc95.springboot06datamybatis.bean.Employee;
import com.lc95.springboot06datamybatis.mapper.DepartmentMapper;
import com.lc95.springboot06datamybatis.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot06DataMybatisApplicationTests {
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    public void contextLoads() {
        Employee e = new Employee();
        e.setLastName("cheng");
        e.setGender(1);
        e.setEmail("704041774@qq.com");
        e.setDId(2);
        System.out.println(employeeMapper.getEmpById(1));
    }

}
