package de.leuphana.article.test.connector;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import de.leuphana.article.connector.ComponentArticleSpringDataConnectorRequester;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentArticleSpringDataConnectorRequesterTest {

	  @Autowired
	  private ComponentArticleSpringDataConnectorRequester componentArticleSpringDataConnectorRequester;

	  @Test
	    public void testfindByName() {
		  assertNotNull(componentArticleSpringDataConnectorRequester.findByName("Osterhase"));

	}

}
