/*package com.example.springdemo.services;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.springdemo.entities.Task;
import com.example.springdemo.validators.Check;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang3.StringUtils;

@Component
public class Consumer implements MessageListener {
	private TaskService taskService;
	
	 @Autowired
	    public Consumer(TaskService taskService) {
	        this.taskService = taskService;
	    }
	 
	@Override
	
	@RabbitListener(queues = "${rabbitmq.queue}")
	public void onMessage(Message message)
	{
		String aux=message.toString();
		char a=aux.charAt(0);
		System.out.println(""+aux);
		String act,start,end;
		act=StringUtils.substringBetween(aux, "activity", "start");
			//System.out.println(""+act);
		start=StringUtils.substringBetween(aux, "start", "end");
			//System.out.println(""+start);
		end=StringUtils.substringBetween(aux, "end", "stop");
			//System.out.println(""+end);
			
		DateFormat date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			date.parse(start);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			DateFormat date1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			date1.parse(end);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Task t=new Task(start,end,act);
		taskService.save(t);
		Check ch=new Check(t);
		ch.verificare();
		
	}
}*/
