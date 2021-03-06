package com.annotation.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/com/annotation/resource/annotation.resource.xml");
		Employee employee = applicationContext.getBean("employee", Employee.class);
		
		System.out.println(employee.getId() + "\t" + employee.getEmail() + "\t" + employee.getName());
		PanCard card = employee.getCard();
		System.out.println("--------- Card ---------------");
		System.out.println(card.getName() + "\t" + card.getNumber());
		
		((AbstractApplicationContext) applicationContext).close();

	}

}
