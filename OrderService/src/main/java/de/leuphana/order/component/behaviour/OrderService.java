package de.leuphana.order.component.behaviour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.leuphana.order.component.structure.Article;
import de.leuphana.order.component.structure.Order;
import de.leuphana.order.component.structure.OrderPosition;
import de.leuphana.order.configuration.OrderNotFoundException;
import de.leuphana.order.connector.ComponentOrderPositionSpringDataConnectorRequester;
import de.leuphana.order.connector.ComponentOrderSpringDataConnectorRequester;
import de.leuphana.order.connector.ForeignComponentArticleRestConnectorRequester;

@Service
public class OrderService {

	@Autowired
	ComponentOrderSpringDataConnectorRequester repositoryOrder;

	@Autowired
	ComponentOrderPositionSpringDataConnectorRequester repositoryOrderPosition;

	@Autowired
	ForeignComponentArticleRestConnectorRequester aForeign;

	// get all Orders
	public List<Order> getOrders() {
		return (List<Order>) repositoryOrder.findAll();
	}

	// get Order by ID
	public Order getOrder(int orderId) {
		return repositoryOrder.findById(orderId).orElseThrow(OrderNotFoundException::new);
	}

	// add Order
	public Order addOrder(Order order) {
		return repositoryOrder.save(order);
	}

	// delete Order by ID
	public void deleteOrder(int orderId) {
		repositoryOrder.findById(orderId).orElseThrow(OrderNotFoundException::new);
		repositoryOrder.deleteById(orderId);
	}

	// get OrderPositions from Order by OrderID
	public List<OrderPosition> findOrderPositionsFromOrderByOrderId(int orderId) {
		return repositoryOrderPosition.findByOrderId(orderId);
	}

	// add OrderPosition
	public OrderPosition addOrderPosition(OrderPosition orderPosition) {
		return repositoryOrderPosition.save(orderPosition);
	}

	// get Article from OrderPosition by OrderPositionID
	public Article getArticleFromOrderPositionById(int orderPositionId) {
		OrderPosition orderPosition = repositoryOrderPosition.findByOrderPositionId(orderPositionId);
		return aForeign.findByArticleIdFromOrderPostion(orderPosition.getArticleId());
	}
}
