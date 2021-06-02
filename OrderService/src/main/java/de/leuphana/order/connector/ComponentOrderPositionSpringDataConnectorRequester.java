package de.leuphana.order.connector;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.leuphana.order.component.structure.OrderPosition;

//Spring Data Connector for OrderPositions
public interface ComponentOrderPositionSpringDataConnectorRequester extends CrudRepository<OrderPosition, Integer> {
	List<OrderPosition> findByOrderId(int orderId);

	OrderPosition findByOrderPositionId(int orderPositionId);

}
