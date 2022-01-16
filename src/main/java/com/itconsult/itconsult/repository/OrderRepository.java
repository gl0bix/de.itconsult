package com.itconsult.itconsult.repository;

import com.itconsult.itconsult.entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.Optional;

@RepositoryDefinition(domainClass = Order.class, idClass = Long.class)
public interface OrderRepository extends CrudRepository<Order, Long> {

}
