package de.leuphana.order.connector;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.leuphana.order.component.behaviour.OrderService;
import de.leuphana.order.component.structure.Article;
import de.leuphana.order.component.structure.Order;
import de.leuphana.order.component.structure.OrderPosition;

@RestController
@RequestMapping("orders")
public class ComponentOrderRestConnectorProvider {

	private final OrderService orderService;

	public ComponentOrderRestConnectorProvider(final OrderService orderService) {
		this.orderService = orderService;
	}

	// get all Orders
	@GetMapping("/orders")
	public List<Order> getOrders() {
		return orderService.getOrders();
	}

	// get Order by ID
	@GetMapping("/{orderId}")
	public Order getOrder(@PathVariable int orderId) {
		return orderService.getOrder(orderId);
	}

	// add Order
	@PostMapping
	public Order addOrder(@RequestBody Order order) {
		return orderService.addOrder(order);
	}

	// delete Order by ID
	@DeleteMapping("/{orderId}")
	public void deleteOrder(@PathVariable int orderId) {
		orderService.deleteOrder(orderId);
	}

	// get OrderPositions from Order by OrderID
	@GetMapping("/orderPositions/{orderId}")
	public List<OrderPosition> findOrderPositionsFromOrderByOrderId(@PathVariable("orderId") int orderId) {
		return orderService.findOrderPositionsFromOrderByOrderId(orderId);
	}

	// add OrderPosition
	@PostMapping("/orderPosition")
	public OrderPosition addOrderPosition(@RequestBody OrderPosition orderPosition) {
		return orderService.addOrderPosition(orderPosition);
	}

	// get Article from OrderPosition by OrderPositionID
	@GetMapping("/orderPosition/{orderPositionId}")
	public Article getArticleFromOrderPositionById(@PathVariable("orderPositionId") int orderPositionId) {
		return orderService.getArticleFromOrderPositionById(orderPositionId);
	}

}
