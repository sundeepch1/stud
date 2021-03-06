package dependency.injection.setter.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Message.xml");
		
		Communication communication = applicationContext.getBean("communication", Communication.class);
		
		communication.communicate();
		applicationContext.close();
	}

}
