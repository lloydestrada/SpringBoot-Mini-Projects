package com.lloyd.springboot.thymeleafdemo.controller;


import com.lloyd.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {


    //inject countries from properties
    @Value("${countries}")
    private List<String> countries;


    //show form
    @GetMapping("/showStudentForm")
    public String showForm(Model theModel){

        //create new student object
        Student theStudent = new Student();

        //add student object as a model attribute
        theModel.addAttribute("student", theStudent);


        //add list of countries to the model
        theModel.addAttribute("countries", countries);

        return "student-form";
    }

    //create /processStudentForm
    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){

        //log the input data
        System.out.println("The Student: " + theStudent.getFirstName() + theStudent.getLastName());

        return "student-confirmation";
    }
}
