package com.example.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.dto.PersonDTO;
import com.example.springdemo.entities.Task;
import com.example.springdemo.services.PersonService;
import com.example.springdemo.services.TaskService;

@RestController
@CrossOrigin
@RequestMapping(value = "/tasks")
public class TaskController {
	TaskService taskService;
	
	 @Autowired
	    public TaskController(TaskService taskService) {
	        this.taskService = taskService;
	    }
	 

 @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String insertPersonDTO(){
         taskService.save(new Task(2,"asd1","asd1","asd1"));
         return "Saved";
    }
}
