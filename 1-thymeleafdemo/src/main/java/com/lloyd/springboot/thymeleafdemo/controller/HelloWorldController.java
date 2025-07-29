package com.lloyd.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //new controller method to show form (HTML)
    @RequestMapping("/Form")
    public String showForm(){

        return "helloworld-form";
    }
    //need controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm(Model theModel){
        theModel.addAttribute("theDate",java.time.LocalDateTime.now());
        return "helloworld";
    }

    //controller method to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String upperName(HttpServletRequest request, Model theModel){

        //read the request parameter from html request
        String theName = request.getParameter("username");

        //convert data to uppercase
        theName = theName.toUpperCase();

        //create a message
        String result = "Hey " + theName + "!" + " What's Up!";

        //add message to the model
        theModel.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String versionThree(@RequestParam("username") String theName, Model theModel){

        //convert data to uppercase
        theName = theName.toUpperCase();

        //create a message
        String result = "Hello " + theName + "!" + " this is from version Three, how are you?";

        //add message to the model
        theModel.addAttribute("message", result);

        return "helloworld";
    }
}
