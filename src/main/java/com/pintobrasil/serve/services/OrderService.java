package com.pintobrasil.serve.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pintobrasil.serve.entities.Order;

@Service
public class OrderService {
	

	@Autowired
	private ShippingService shippingService;
	
	
	public double total(Order order) {
		
		double orderTotal = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)) + shippingService.shipment(order);
		return orderTotal;
	}

}
