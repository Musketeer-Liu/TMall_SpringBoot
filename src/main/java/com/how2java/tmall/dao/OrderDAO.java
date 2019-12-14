package com.how2java.tmall.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.Order;

public interface OrderDAO extends JpaRepository<Order, Integer> {
}
