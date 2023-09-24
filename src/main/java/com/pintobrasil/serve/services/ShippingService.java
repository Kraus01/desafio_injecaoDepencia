package com.pintobrasil.serve.services;

import org.springframework.stereotype.Service;

import com.pintobrasil.serve.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double frete = 0.0;
		if(order.getBasic() < 100.0) {
			return  frete = 20.0;
			
		} else if (order.getBasic() >= 100.0 && order.getBasic() <= 200.0) {
			return frete = 12.0;
			}
		
		return frete;
	} 
}
