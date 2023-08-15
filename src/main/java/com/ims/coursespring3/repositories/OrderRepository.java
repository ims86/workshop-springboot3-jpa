package com.ims.coursespring3.repositories;

import com.ims.coursespring3.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
