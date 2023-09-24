package com.pintobrasil.serve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.pintobrasil.serve.entities.Order;
import com.pintobrasil.serve.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.pintobrasil.serve"})
public class ServeApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(ServeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido codigo " + order.getCode());
		System.out.println("valor total: " + orderService.total(order));
		
	}

}
