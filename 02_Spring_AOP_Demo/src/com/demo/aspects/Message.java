package com.demo.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Message {

	@After("execution (public void Withdraw())")
	public void SendSMSWithdraw()
	{
		System.out.println(" MSg FOR WithDraw ");
	}
	
	@After("execution (public void Deposite())")
	public void SendSMSDeposite()
	{
		System.out.println(" MSg FOR Deposite ");
		
	}
	
	
	
}
