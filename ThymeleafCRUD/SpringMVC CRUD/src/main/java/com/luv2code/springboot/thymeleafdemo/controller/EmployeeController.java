package com.luv2code.springboot.thymeleafdemo.controller;


import com.luv2code.springboot.thymeleafdemo.entity.Employee;
import com.luv2code.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {


    private EmployeeService employeeService;

    //since it is only one constructor I will not put @autowired, hence it is optional
    public EmployeeController(EmployeeService theEmployeeService){

        employeeService = theEmployeeService;
    }

    //add a mapping for listing the employees
    @GetMapping("/list")
    public String listEmployees(Model theModel){

        //get employees from database
        List<Employee> theEmployees = employeeService.findAll();

        //add the spring model
        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    //add mapping for an adding a form
    @GetMapping("/showAddForm")
    public String showAddForm(Model theModel){

        //create new model to bind form data
        Employee theEmployee = new Employee();

        theModel.addAttribute("employee", theEmployee);

        return "employees/employee-form";
    }

}
