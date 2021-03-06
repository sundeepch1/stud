package method.injection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

	public static void main(String[] args) {
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("ticket.xml");
		TicketvendingMachine ticketvendingMachine = abstractApplicationContext.getBean("ticketvendingMachine", TicketvendingMachine.class);
	
		Ticket ticket=ticketvendingMachine.generateTicket();
		
		ticket.printTicket();
		
		abstractApplicationContext.close();
	
	}

}
