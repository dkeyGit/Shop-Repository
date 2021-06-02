package de.leuphana.shop.test.connector;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.shop.behaviour.Shop;
import de.leuphana.shop.structure.Article;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentShopRestConnectorProviderTest {
/*
	@Autowired
	private Shop shop;

	// getAllArticles-Test
	@Test
	public void getAllArticlesTest() {
		assertTrue(!shop.getArticles().isEmpty());
	}

	// getArticleById-Test
	@Test
	public void getArticleByIdTest() {
		assertTrue(shop.getArticle(1).getName().equals("Meerjungfrau"));
	}

// addArticleToCatalog-Test
	@Test
	public void addArticleToArticleServiceTest() {
		Article article = new Article();
		article.setManufactor("SpugiUndLami");
		article.setName("Scholle");
		article.setPrice(22.2f);
		shop.addArticle(article);
		assertTrue(!shop.getArticles().isEmpty());
	}

	// createCustomer-Test
	@Test
	public void createCustomerWithCartTest() {

		Integer custID = shop.createCustomerWithCart("Hans", "Leuphana");
		assertTrue(shop.getCustomerById(custID).getName().equals("Hans"));
		assertTrue(!shop.getCustomersWithCart().isEmpty());
	}

	@Test
	public void getAllCustomers() {
		assertTrue(!shop.getCustomers().isEmpty());
	}

	@Test
	public void addArticleToCart() {
		Integer custID = shop.createCustomerWithCart("Ente", "Leuphana");
		shop.addArticleToCart(custID, 1);
		assertTrue(shop.getCartFromCustomer(custID).getNumberOfArticles() == 1);

	}

	@Test
	public void decrementArticleQuantity() {
		Integer custID = shop.createCustomerWithCart("Hund", "Leuphana");
		shop.addArticleToCart(custID, 1);
		shop.decrementArticleQuantityInCart(custID, 1);
		assertTrue(shop.getCartFromCustomer(custID).getNumberOfArticles() == 0);
	}
	*/
}
