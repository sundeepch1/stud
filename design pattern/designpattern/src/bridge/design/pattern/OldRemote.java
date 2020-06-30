package bridge.design.pattern;

class OldRemote implements Remote {

	@Override
	public void on() {
		System.out.println("ON with Old Remote");
	}

	@Override
	public void off() {
		System.out.println("OFF with old Remote");
	}
}
