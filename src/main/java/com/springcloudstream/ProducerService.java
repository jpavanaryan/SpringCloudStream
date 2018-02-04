package com.springcloudstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableBinding(Source.class)
public class ProducerService
{

	private Source source;

	@Autowired
    public ProducerService(Source source) 
	{
        this.source = source;
    }
	
	@RequestMapping("/api/greetings/{count}")
    //@Timed
    public void getGreetings(@PathVariable int count) 
	{
        while(count > 0) 
        	{
        		//((MessageChannel) source).send(MessageBuilder.withPayload(new Greeting().setMessage("Hello world!: " + count)).build());
        		source.output().send(MessageBuilder.withPayload(new Greeting().setMessage("Hello world!: " + count)).build());
            count--;
        }
    }
}