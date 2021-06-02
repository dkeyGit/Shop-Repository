package de.leuphana.order.test.connector;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import de.leuphana.order.component.structure.Order;
import de.leuphana.order.component.structure.OrderPosition;
import de.leuphana.order.connector.ComponentOrderPositionSpringDataConnectorRequester;
import de.leuphana.order.connector.ComponentOrderSpringDataConnectorRequester;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentOrderRestConnectorProviderTest {

	@Autowired
	private ComponentOrderSpringDataConnectorRequester componentOrderSpringDataConnectorRequester;
	
	@Autowired
	private ComponentOrderPositionSpringDataConnectorRequester componentOrderPositionSpringDataConnectorRequester;

	@Before
	public void setUp() {
		
		Order order = new Order();
		order.setCustomerId(12);
		componentOrderSpringDataConnectorRequester.save(order);

		OrderPosition orderPosition = new OrderPosition();
		orderPosition.setOrderPositionId(1);
		orderPosition.setArticleId(3);
		orderPosition.setArticleQuantity(10);
		orderPosition.setOrderId(order.getOrderId());
		System.out.println(orderPosition);
		componentOrderPositionSpringDataConnectorRequester.save(orderPosition);


	}
	

	// getOrders-Test
	@Test
	public void getOrders() {
		assertNotNull(componentOrderSpringDataConnectorRequester.findAll());
	}
	
	// getOrderPositions-Test
	@Test
	public void getOrderPositions() {
		assertNotNull(componentOrderPositionSpringDataConnectorRequester.findAll());
	}


	/*
	 * @Test
	 * 
	 * @Transactional public void canArticleBeCreated() {
	 * 
	 * }
	 * 
	 * @Test
	 * 
	 * @Transactional public void canArticleBeUpdated() {
	 * 
	 * }
	 * 
	 * @Test
	 * 
	 * @Transactional public void canArticleBeDeleted() {
	 * 
	 * }
	 */

}
