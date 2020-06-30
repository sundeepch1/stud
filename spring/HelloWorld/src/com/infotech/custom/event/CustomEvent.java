package com.infotech.custom.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
	}
	
	public String myToString() {
		return "My first event spring";
	}

}
