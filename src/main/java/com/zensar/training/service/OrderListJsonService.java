package com.zensar.training.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.training.dto.OrderListJson;
import com.zensar.training.dto.OrderListXml;
import com.zensar.training.entity.OrderListJsonDAO;
import com.zensar.training.entity.OrderListXmlDAO;
import com.zensar.training.repository.OrderListJsonRepository;
import com.zensar.training.repository.OrderListXmlRepository;

@Service
public class OrderListJsonService {
	
	@Autowired
	OrderListJsonRepository orderListJsonRepository;
	
	@Autowired
	OrderListXmlRepository xmlrepository;
	
	public void updateOrderInfo(OrderListJson orderList) {
		OrderListJsonDAO orderDao = new OrderListJsonDAO();
		orderDao.setCommand(orderList.getCommand());
		orderDao.setImagePathname(orderList.getImagePathname());
		orderDao.setItemDescription(orderList.getItemDescription());
		orderDao.setItemHeight(orderList.getItemHeight());
		orderDao.setItemLength(orderList.getItemLength());
		orderDao.setItemName(orderList.getItemName());
		orderDao.setItemWeight(orderList.getItemWeight());
		orderDao.setItemWidth(orderList.getItemWidth());
		orderDao.setMessageName(orderList.getMessageName());
		orderDao.setPickType(orderList.getPickType());
		orderDao.setRfidTagged(orderList.isRfidTagged());
		orderDao.setStorageAttribute(orderList.getStorageAttribute());
		orderDao.setUpcList(orderList.getUpcList());
		orderDao.setId(orderList.getId());
		
		orderListJsonRepository.save(orderDao);
		
		/*OrderListJsonDAO orderDao = orderListJsonRepository.findById(orderList.getId()).orElse(null);
		if(orderDao != null) {
			// update existing data
		}else {
			// insert new data
		}*/
		
	}

	public String updateOrderInfo(int id, String status) {
		OrderListJsonDAO orderDao = orderListJsonRepository.findById(id).orElse(null);
		if(Objects.isNull(orderDao)) {
			return "Order not found...";
		}else {
			orderDao.setStatus(status);
			orderListJsonRepository.saveAndFlush(orderDao);
		}
		return "Order updated successfully...";
	}

	public void updateXMlOrderInfo(OrderListXml orderlistxml) {
		OrderListXmlDAO dao = new OrderListXmlDAO();
		dao.setClientID(orderlistxml.getSource().getClientID());
		dao.setFulfillmentChannelCode(orderlistxml.getFulfillmentChannelCode());
		dao.setOrderID(orderlistxml.getOrderID());
		dao.setOrderStatus(orderlistxml.getOrderStatus());
		dao.setPartnerOrderID(orderlistxml.getPartnerOrderID());
		xmlrepository.save(dao);
	}

}
