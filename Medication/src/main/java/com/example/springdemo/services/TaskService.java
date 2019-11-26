package com.example.springdemo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.dto.PersonDTO;
import com.example.springdemo.dto.builders.PersonBuilder;
import com.example.springdemo.entities.Person;
import com.example.springdemo.entities.Task;
import com.example.springdemo.errorhandler.DuplicateEntryException;
import com.example.springdemo.repositories.PatientRepository;
import com.example.springdemo.repositories.TaskRepository;
import com.example.springdemo.validators.PersonFieldValidator;

@Service
public class TaskService {
	private final TaskRepository taskRepository;

    @Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
   

	public void save(Task task) {
		taskRepository.save(task)	;
		
	}
}
