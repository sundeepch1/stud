package com.infotech.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartedEventHandler implements ApplicationListener<ContextStartedEvent> {

	@Override
	public void onApplicationEvent(ContextStartedEvent cse) {
		System.out.println("ContextStartedEvent = Received...");
		System.out.println(cse.getApplicationContext());
		System.out.println(cse.getSource());
	}

}
