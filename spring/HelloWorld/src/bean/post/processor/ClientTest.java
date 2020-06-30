package bean.post.processor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
	public static void main(String ...strings) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Message.xml");
		Message message = context.getBean("message", Message.class);
		
		System.out.println(message.getMessageId() + "    " + message.getMessage());
		
		((AbstractApplicationContext) context).close();
	}
}
