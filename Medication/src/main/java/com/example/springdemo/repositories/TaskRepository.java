package com.example.springdemo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.entities.Task;
@Repository
public interface TaskRepository  extends JpaRepository<Task, Integer> {

}
