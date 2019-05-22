package com.lc95.springboot06datamybatis.mapper;

import com.lc95.springboot06datamybatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);

}
