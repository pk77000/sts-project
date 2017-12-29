package com.capg.hsbc.com.capg.hsbc.springIng;


import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class HelloWorldExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("context.xml");
		ctx.refresh();
		MessageChannel channel = ctx.getBean("names", MessageChannel.class);
		Message<String> message = MessageBuilder.withPayload("world").build();
		channel.send(message);
		channel = ctx.getBean("names2", MessageChannel.class);
		message = MessageBuilder.withPayload("world1").build();
		channel.send(message);
		
	}

}
