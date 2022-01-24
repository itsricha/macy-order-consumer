package com.zensar.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.training.service.OrderListJsonService;

@RestController(value = "/order")
public class OrderStasController {
	
	@Autowired
	OrderListJsonService service;

	@PutMapping("/update/status/{id}/{status}")
	public String updateOrderStatus(@PathVariable(value = "id") int id, @PathVariable(value = "status") String status) {
		return service.updateOrderInfo(id,status);
	}
}
