package dependency.injection.setter.method;

public class ActiveMQMessage implements Message {
	
	public void sendMessage() {
		System.out.println("Message send successfully");
	}
}
