package bean.inheritance;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {
	public static void main(String... strings) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Message.xml");
		Employee employee = context.getBean("employee", Employee.class);

		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getGender());
		System.out.println(employee.getPanNo());

//		Person person = context.getBean("person", Person.class);
//
//		System.out.println(person.getId());
//		System.out.println(person.getName());
//		System.out.println(person.getGender());
		//System.out.println(person.getPanNo());

		context.close();
	}
}
