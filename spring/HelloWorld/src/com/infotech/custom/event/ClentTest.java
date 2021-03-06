package com.infotech.custom.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Message;


public class ClentTest {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("custom.event.xml");
		
		
		CustomEventPublisher customEventPublisher = applicationContext.getBean("customEventPublisher", CustomEventPublisher.class);
		customEventPublisher.publishEvent();
		
		
		
		((ConfigurableApplicationContext) applicationContext).close();
	}

}
