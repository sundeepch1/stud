package dependency.injection.constructor;

public class ActiveMQMessage implements Message {
	
	public void sendMessage() {
		System.out.println("Message send successfully");
	}
}
