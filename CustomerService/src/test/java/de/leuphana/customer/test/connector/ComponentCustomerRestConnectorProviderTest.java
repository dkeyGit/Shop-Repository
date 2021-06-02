package de.leuphana.customer.test.connector;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.customer.component.structure.Customer;
import de.leuphana.customer.connector.ComponentCustomerSpringDataConnectorRequester;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentCustomerRestConnectorProviderTest {

	@Autowired
	private ComponentCustomerSpringDataConnectorRequester componentCustomerSpringDataConnectorRequester;
	
	private Customer customer_d;
	private Customer customer_e;

	@Before
	public void setUp() {
		customer_d = new Customer();
		customer_d.setName("Johnny");
		customer_d.setAddress("Musterstra�e 23");
		componentCustomerSpringDataConnectorRequester.save(customer_d);
		
		customer_e = new Customer();
		customer_e.setName("Julia");
		customer_e.setAddress("Juiastra�e 536");
		componentCustomerSpringDataConnectorRequester.save(customer_e);

	}
	

	// getCustomers-Test
	@Test
	public void getCustomers() {
		assertNotNull(componentCustomerSpringDataConnectorRequester.findAll());
	}

}
