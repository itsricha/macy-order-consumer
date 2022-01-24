package com.zensar.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.training.entity.OrderListJsonDAO;

public interface OrderListJsonRepository extends JpaRepository<OrderListJsonDAO, Integer>  {

}
