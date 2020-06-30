package com.infotech.custom.event;

import org.springframework.context.ApplicationListener;

public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	@Override
	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.myToString());
		//System.out.println(event.getApplicationContext());
		System.out.println(event.getSource());
		
	}

}
