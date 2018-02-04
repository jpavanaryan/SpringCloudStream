package com.springcloudstream;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(Sink.class)
public class ConsumerService
{
	@StreamListener(Sink.INPUT)
	public void consume(Greeting greeting)
	{
		System.out.println("Message Received: "+greeting.getMessage());
	}
}