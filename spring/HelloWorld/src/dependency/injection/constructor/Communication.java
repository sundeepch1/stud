package dependency.injection.constructor;

public class Communication {

	private Message message;
	
	public Communication(Message message) {
		this.message = message;
	}
	
	public void communicate() {
		message.sendMessage();
	}

}
