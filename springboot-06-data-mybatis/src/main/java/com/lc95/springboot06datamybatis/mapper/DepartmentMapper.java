package com.lc95.springboot06datamybatis.mapper;

import com.lc95.springboot06datamybatis.bean.Department;
import org.apache.ibatis.annotations.*;

//指定这是一个操作数据库的mapper

//@Mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public void deleteDeptById(Integer id);

    @Insert("insert into department(dept_name) values(#{deptName})")
    public int insertDept(Department department);

    @Update("update department set dept_name=#{deptName} where id=#{id}")
    public int updateDept(Department department);
}
