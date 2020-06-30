package com.infotech.event.handler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Message;


public class ClentTest {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("event.xml");
		
		
		Message message = applicationContext.getBean("message", Message.class);
		System.out.println(message.getMessageId() + "    " + message.getMessage());
		((Lifecycle) applicationContext).start();
		((Lifecycle) applicationContext).stop();
		
		((ConfigurableApplicationContext) applicationContext).close();
	}

}
