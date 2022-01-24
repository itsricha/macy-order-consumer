package com.zensar.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.training.dto.OrderListJson;
import com.zensar.training.dto.OrderListXml;
import com.zensar.training.service.OrderListJsonService;


@RestController
@RequestMapping("/macyConsumerController")
public class MacyConsumerController {
	
	@Autowired
	OrderListJsonService service;
	
	//@PostMapping("/json/message")
		@RequestMapping(value = "/", method = RequestMethod.POST, consumes = { "application/json", "application/xml" })
		public String consumeJsonMessage(@RequestBody OrderListJson order) {
			service.updateOrderInfo(order);
			return "Data updated successfully";
		}
		//@RequestMapping(value = "/xml", method = RequestMethod.POST, consumes = {  "application/xml" })
		@PostMapping(value = "/xml", consumes = {  "application/xml" })
		public String consumeXMLMessage(@RequestBody OrderListXml orderlistxml) {
			service.updateXMlOrderInfo(orderlistxml);
			return "XML Data updated successfully";
		}

}
