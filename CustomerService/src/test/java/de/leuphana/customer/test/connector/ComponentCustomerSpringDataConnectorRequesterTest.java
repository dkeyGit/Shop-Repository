package de.leuphana.customer.test.connector;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import de.leuphana.customer.connector.ComponentCustomerSpringDataConnectorRequester;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentCustomerSpringDataConnectorRequesterTest {

	  @Autowired
	  private ComponentCustomerSpringDataConnectorRequester componentCustomerSpringDataConnectorRequester;

	  @Test
	    public void testfindById() {
		  assertNotNull(componentCustomerSpringDataConnectorRequester.findById(3));

	}


}
