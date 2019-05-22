package com.lc95.springboot4restfulcurd.controller;

import com.lc95.springboot4restfulcurd.dao.DepartmentDao;
import com.lc95.springboot4restfulcurd.dao.EmployeeDao;
import com.lc95.springboot4restfulcurd.entities.Department;
import com.lc95.springboot4restfulcurd.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    //获取所有员工
    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> emps = employeeDao.getAll();
        model.addAttribute("emps", emps);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddpage(Model model) {
        //跳转到添加页面
        //查出所有的部门
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("deps", departments);
        return "emp/add";
    }

    //SporingMVC自动请求参数和入参对象的属性进行一一绑定
    @PostMapping("/emp")
    public String addEmp(Employee employee) {
        employeeDao.save(employee);
        /**
         * redirect 是重定向
         * forward 是请求转发
         * 不加前缀是跳转到模板引擎
         */
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.getEmpById(id);
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("emp", employee);
        model.addAttribute("deps", departments);
        return "emp/add";
    }

    @PutMapping("/emp")
    public String updateEmployee(Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String delete(@PathVariable("id") Integer id) {
        employeeDao.deleteEmpById(id);
        return "redirect:/emps";
    }


}
