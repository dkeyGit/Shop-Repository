package de.leuphana.article.test.component;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.article.connector.ComponentArticleRestConnectorProvider;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentArticleServiceTests {
	
	@Autowired
	private ComponentArticleRestConnectorProvider controller;
	
	@Test
	public void contextLoads() {
		System.out.println("Application context starts");
	}
	
	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
