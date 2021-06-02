package de.leuphana.order.test.connector;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.order.connector.ForeignComponentArticleRestConnectorRequester;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForeignComponentArticleSpringDataConnectorRequesterTest {

	  @Autowired
	  private ForeignComponentArticleRestConnectorRequester foreignComponentArticleRestConnectorRequester;

	  @Test
	    public void testfindById() {
		  assertNotNull(foreignComponentArticleRestConnectorRequester.findByArticleIdFromOrderPostion(3));

	}

}
