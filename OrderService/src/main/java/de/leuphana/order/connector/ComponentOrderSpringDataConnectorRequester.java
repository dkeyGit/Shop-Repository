package de.leuphana.order.connector;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.leuphana.order.component.structure.Order;

//Spring Data Connector for Order
public interface ComponentOrderSpringDataConnectorRequester extends CrudRepository<Order, Integer> {
	List<Order> findByCustomerId(int customerId);

}
