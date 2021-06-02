package de.leuphana.order.test.connector;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.order.connector.ComponentOrderSpringDataConnectorRequester;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentOrderSpringDataConnectorRequesterTest {

	  @Autowired
	  private ComponentOrderSpringDataConnectorRequester componentOrderSpringDataConnectorRequester;

	  @Test
	    public void testfindById() {
		  assertNotNull(componentOrderSpringDataConnectorRequester.findByCustomerId(12));

	}

}
