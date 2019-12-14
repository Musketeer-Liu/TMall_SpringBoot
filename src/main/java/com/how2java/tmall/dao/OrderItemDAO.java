package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.Order;
import java.util.List;

public interface OrderItemDAO extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findByOrderOrderByIdDesc(Order order);
}
