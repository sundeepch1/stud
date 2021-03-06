package injection.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("collection.properties.xml");
		UserInfo userInfo =  applicationContext.getBean("userInfo", UserInfo.class);
		
		Properties properties= userInfo.getProperties();
		Set<Entry<Object, Object>> entries=properties.entrySet();
		for (Entry<Object, Object> entry : entries) {
			System.out.println(entry.getKey() + "  " + entry.getValue() + "   " + entry.getClass());
		}
				
		((AbstractApplicationContext) applicationContext).close();
	}

}
