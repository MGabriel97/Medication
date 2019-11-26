package com.example.springdemo.validators;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.example.springdemo.entities.Task;
import java.text.ParseException;
public class Check {
	
	Task t;
	
	
	public Check(Task t) {
		this.t = t;
	}


	public Task getT() {
		return t;
	}


	public void setT(Task t) {
		this.t = t;
	}


	public void verificare()
	{
	String start=t.getStart();
	String end=t.getEnd();
	String job=t.getJob();
	
	try {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date datestart = format.parse(start);
       // System.out.println(datestart);
        Date dateend = format.parse(end);
      //  System.out.println(dateend);
        long hr=dateend.getTime()-datestart.getTime();
        long difhr= TimeUnit.MILLISECONDS.toHours(hr);
      //  System.out.println(""+difhr);
        if(job.equals("Sleeping") && difhr>12)
        {
        	System.out.println("The sleep period longer than 12 hours");
        }
        if(job.equals("Leaving") && difhr>12)
        {
        	System.out.println("The leaving activity (outdoor) is longer than 12 hours");
        }
        if(job.equals("Toileting") && difhr>1)
        {
        	System.out.println("The period spent in bathroom is longer than 1 hour");
        }

    } catch (ParseException e) {
        e.printStackTrace();
    }
	}

}
