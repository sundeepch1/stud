package observer.design.pattern;


interface Subject {
	void register(Observer obj);

	void unregister(Observer obj);

	void notifyObservers();
}
