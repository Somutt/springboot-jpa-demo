package com.samuel.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samuel.services.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
