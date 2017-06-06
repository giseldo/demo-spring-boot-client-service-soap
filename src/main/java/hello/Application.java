package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import hello.wsdl.GetQuote;
import hello.wsdl.GetQuoteResponse;
import hello.wsdl.ObjectFactory;

@SpringBootApplication
public class Application {

	public static void main(String [] args) {
		SpringApplication.run(Application.class);
		
		QuoteClient client = new QuoteClient();
		GetQuoteResponse response = client.getQuote("A");
		
		
		System.out.println(response.getGetQuoteResult());
		
	} 
	
	public void teste() {
		
		
	}

}