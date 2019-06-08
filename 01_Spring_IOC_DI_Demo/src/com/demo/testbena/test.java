package com.demo.testbena;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Message;
import com.demo.bean.Student;

public class test {

	public static void main(String[] args) {

/* IOC Parameter Should be XML FIle
 * 1)Using Class path
 * 2)Using Parameterized method of Context Interface parameters are Id and Class name 
 */
		
	/* 1) Way */	
	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	//Message message= (Message) context.getBean("message");
	//message.setMessage("Helo without property");
	//System.out.println(message);
	
	/* 2) Way */
	
		  Message message= context.getBean("message",Message.class);
		  System.out.println(message);
		  Message message2= context.getBean("message",Message.class);
		  System.out.println(message2);
		
		  
		  /*
		 * Student student= context.getBean("std",Student.class);
		 * System.out.println(student);
		 */	
	}

}
