package factory.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("factory.xml");
		ATM atm = context.getBean("atm", ATM.class);
		
		atm.printBalanceInformation("ASDFGHJK");
		((AbstractApplicationContext) context).close();
	}

}
