package dependency.injection.setter.method;

public class Communication {

	private Message message;
	
	public void setMessage(Message message) {
		this.message = message;
	}
	
	public void communicate() {
		message.sendMessage();
	}

}
