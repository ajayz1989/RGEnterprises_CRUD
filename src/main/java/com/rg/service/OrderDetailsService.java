
package com.rg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rg.dao.OrderDetailsDAO;
import com.rg.entity.OrderDetails;

@Service
public class OrderDetailsService {

	@Autowired
	private OrderDetailsDAO orderDetailsDAO;
	
	public void create(OrderDetails orderDetails) {
		orderDetailsDAO.save(orderDetails);
	}
	
	public List<OrderDetails> findAll() {
		return (List<OrderDetails>) orderDetailsDAO.findAll();
	}
}
