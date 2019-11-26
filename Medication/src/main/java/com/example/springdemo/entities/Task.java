package com.example.springdemo.entities;

import static javax.persistence.GenerationType.IDENTITY;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "task")
public class Task {
	public Task(String start, String end, String job) {
		this.start = start;
		this.end = end;
		this.job = job;
	}

	public Task() {
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int id;
	
	@Column(name = "start")
	public String start ;
	
	@Column(name = "end")
	public String end ;
	
	@Column(name = "job")
	public String job;
	
	
	@Override
	public String toString() {
		return "Task [start=" + start + ", end=" + end + ", job=" + job + "]";
	}
	public Task(int id, String start, String end, String job) {
		
		this.id = id;
		this.start = start;
		this.end = end;
		this.job = job;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getStart(DateFormat start)
	{
		Date date = new Date();  
		 String strDate = start.format(date);  
		 return strDate;
	}
}
