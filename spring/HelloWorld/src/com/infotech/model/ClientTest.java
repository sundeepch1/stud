package com.infotech.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.required.Message;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.required.xml");
		
		Message message = context.getBean("message", Message.class);
		
	 	System.out.println(message.getMessageId() + "     " + message.getMessage());
		
		((AbstractApplicationContext) context).close();
	}
}
