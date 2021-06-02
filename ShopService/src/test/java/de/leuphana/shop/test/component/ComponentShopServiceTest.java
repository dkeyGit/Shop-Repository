package de.leuphana.shop.test.component;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.shop.connector.ComponentShopRestConnectorProvider;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentShopServiceTest {

	@Autowired
	private ComponentShopRestConnectorProvider controller;
	
	@Test
	public void contextLoads() {
		System.out.println("Application context starts");
	}
	
	@Test
	public void contexLoads() throws Exception {
		assertThat(controller).isNotNull();
	}
}
