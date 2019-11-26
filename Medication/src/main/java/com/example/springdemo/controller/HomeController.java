package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping("/pacient")
    public String posts() {
        return "pacient";
    }
    @RequestMapping("/pacientdelete")
    public String postss() {
        return "pacientdelete";
    }
    @RequestMapping("/pacientcreate")
    public String postsss() {
        return "pacientcreate";
    }
    @RequestMapping("/medicationcreate")
    public String postssss() {
        return "medicationcreate";
    }
    @RequestMapping("/medicationdelete")
    public String postsssss() {
        return "medicationdelete";
    }
    
    @RequestMapping("/caregivercreate")
    public String postssssss() {
        return "caregivercreate";
    }
    
    @RequestMapping("/caregiverdelete")
    public String postsssssss() {
        return "caregiverdelete";
    }
    
    @RequestMapping("/caregiverupdate")
    public String postssssssss() {
        return "caregiverupdate";
    }
    
    @RequestMapping("/login")
    public String postsssssssss() {
        return "login";
    }
    
    @RequestMapping("/home")
    public String postssssssssss() {
        return "home";
    }
    
    @RequestMapping("/pacientupdate")
    public String postsssssssssss() {
        return "pacientupdate";
    }
    
    @RequestMapping("/medicationupdate")
    public String postssssssssssss() {
        return "medicationupdate";
    }
    
    @RequestMapping("/medicationplancreate")
    public String postsssssssssssss() {
        return "medicationplancreate";
    }
}