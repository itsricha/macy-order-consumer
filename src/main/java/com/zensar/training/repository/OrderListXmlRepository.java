package com.zensar.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.training.entity.OrderListXmlDAO;

@Repository
public interface OrderListXmlRepository extends JpaRepository<OrderListXmlDAO, String>{
	
	

}
