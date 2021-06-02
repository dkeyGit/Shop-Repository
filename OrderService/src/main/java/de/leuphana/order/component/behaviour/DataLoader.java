package de.leuphana.order.component.behaviour;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import de.leuphana.order.component.structure.Order;
import de.leuphana.order.component.structure.OrderPosition;
import de.leuphana.order.connector.ComponentOrderPositionSpringDataConnectorRequester;
import de.leuphana.order.connector.ComponentOrderSpringDataConnectorRequester;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

	private final ComponentOrderSpringDataConnectorRequester dReq;
	private final ComponentOrderPositionSpringDataConnectorRequester componentOrderPositionSpringDataConnectorRequester;

	public DataLoader(ComponentOrderSpringDataConnectorRequester dReq,
			ComponentOrderPositionSpringDataConnectorRequester componentOrderPositionSpringDataConnectorRequester) {
		this.dReq = dReq;
		this.componentOrderPositionSpringDataConnectorRequester = componentOrderPositionSpringDataConnectorRequester;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Order order = new Order();
		order.setCustomerId(1);

		OrderPosition orderPosition = new OrderPosition();
		orderPosition.setArticleId(3);
		orderPosition.setArticleQuantity(10);
		orderPosition.setOrderId(1);

		dReq.save(order);
		componentOrderPositionSpringDataConnectorRequester.save(orderPosition);

	}
}
