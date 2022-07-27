/**
 *  Copyright 2005-2018 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package org.mycompany;

import org.apache.camel.component.sjms2.Sjms2Component;
import org.apache.qpid.jms.JmsConnectionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * A spring-boot application that includes a Camel route builder to setup the Camel routes
 */
@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class Application {

	
	@Value("${amqp.username}")
	private String username;
	
	@Value("${amqp.password}")
	private String password;
	
    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

   // @Bean
    //org.apache.qpid.jms.JmsConnectionFactory jmsConnectionFactory(){
    //	org.apache.qpid.jms.JmsConnectionFactory factory = new JmsConnectionFactory(username, password, "amqps://name222-amqp-0-svc-rte-activemq-ssl.apps.cluster-mm9j5.mm9j5.sandbox1798.opentlc.com:443?transport.trustStoreLocation=client.ts&amp;transport.trustStorePassword=password");
    //	return factory;
    //}
    
   // @Bean(name = "amqp")
   // org.apache.camel.component.sjms2.Sjms2Component get(JmsConnectionFactory jmsConnectionFactory) {
   // 	org.apache.camel.component.sjms2.Sjms2Component amqp = new Sjms2Component();
   // 	amqp.setConnectionFactory(jmsConnectionFactory);
   // 	return amqp;
    //}
}
