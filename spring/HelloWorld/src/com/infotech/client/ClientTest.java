package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Message;

public class ClientTest {

	public static void main(String[] args) {
//		Resource resource = new ClassPathResource("Beans.xml");
//		BeanFactory beanFactory = new XmlBeanFactory(resource);
//		Object object = beanFactory.getBean("message");
//		
//		if(object != null) {
//			Message message = (Message)object;
//			System.out.println( message.getMessage() + "  " + message.getMessageId());
//		}
//		
//		System.out.println("---------------------------------");
//		Message message = beanFactory.getBean("message", Message.class);
//		System.out.println( message.getMessage() + "  " + message.getMessageId());
//		Class<?> class1 = beanFactory.getType("message");
//		System.out.println(class1);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		Message message = (Message) applicationContext.getBean("message", Message.class);
		message.setMessageId(1001);
		message.setMessage("Hello Sundeep!!!");
		System.out.println( message.getMessage() + "  " + message.getMessageId());
		
		Message message1 = applicationContext.getBean("message", Message.class);
		System.out.println( message1.getMessage() + "  " + message1.getMessageId());
		
		((AbstractApplicationContext) applicationContext).close();
	}

}
