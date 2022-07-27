package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class MyRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		
		 from("timer://foo?repeatCount=1")
		  .setBody().simple("Hello Jiiii")
		  .to("{{amqp.queue.name}}")
		  .log("Pushed message to Queue");
		 
		  
		
	}

}
