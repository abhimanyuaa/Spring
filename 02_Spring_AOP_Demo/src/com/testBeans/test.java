package com.testBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Account;

public class test {

	public static void main(String[] args) {

	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	
	Account account= context.getBean("Acc",Account.class);
	
	account.Deposite();
	
	account.Withdraw();

	}

}
