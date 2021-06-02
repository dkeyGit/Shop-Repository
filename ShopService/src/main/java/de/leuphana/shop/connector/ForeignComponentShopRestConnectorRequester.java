package de.leuphana.shop.connector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import de.leuphana.shop.structure.Article;
import de.leuphana.shop.structure.Customer;
import de.leuphana.shop.structure.Order;
import de.leuphana.shop.structure.OrderPosition;

@RestController
public class ForeignComponentShopRestConnectorRequester {

	@Autowired
	RestTemplate restTemplate;

	private String glooEdgeProxyURL = "http://192.168.49.2:31813";

	// get all Articles from Article Service
	public Article[] getArticles() {
		ResponseEntity<Article[]> response = restTemplate.getForEntity(glooEdgeProxyURL + "/articles/articles",
				Article[].class);
		Article[] articles = response.getBody();
		return articles;
	}

	// get Article from Article Service by ID
	public Article getArticleById(int articleId) {
		return restTemplate.getForObject(glooEdgeProxyURL + "/articles/" + articleId, Article.class);
	}

	// add Article to Article Service
	public Article addArticleToCatalog(Article article) {
		return restTemplate.postForObject(glooEdgeProxyURL + "/articles", article, Article.class);
	}

	// delete Article by ID
	public void deleteArticleById(int articleId) {
		restTemplate.delete(glooEdgeProxyURL + "/articles/" + articleId);

	}

	// update Article by ID
	public void updateArticleById(int articleId, Article article) {
		restTemplate.put(glooEdgeProxyURL + "/articles/" + articleId, article, Article.class);

	}

	// get all Customers from Customer Service
	public Customer[] getCustomers() {
		ResponseEntity<Customer[]> response = restTemplate.getForEntity(glooEdgeProxyURL + "/customers/customers",
				Customer[].class);
		Customer[] customers = response.getBody();
		return customers;
	}

	// get Customer from Customer Service by ID
	public Customer getCustomerById(int customerId) {
		return restTemplate.getForObject(glooEdgeProxyURL + "/customers/" + customerId, Customer.class);
	}

	// add Customer to Customer Service
	public Customer createCustomer(Customer customer) {
		return restTemplate.postForObject(glooEdgeProxyURL + "/customers", customer, Customer.class);
	}

	// delete Customer by ID
	public void deleteCustomerById(int customerId) {

		restTemplate.delete(glooEdgeProxyURL + "/customers/" + customerId);
	}

	// update Customer by ID
	public void updateCustomerById(int customerId, Customer customer) {
		restTemplate.put(glooEdgeProxyURL + "/customers/" + customerId, customer, Customer.class);

	}

	// get all Orders from Order Service
	public Order[] getOrders() {

		ResponseEntity<Order[]> response = restTemplate.getForEntity(glooEdgeProxyURL + "/orders/orders",
				Order[].class);
		Order[] orders = response.getBody();
		return orders;
	}

	// get Order from Order Service by ID
	public Order getOrderById(int orderId) {
		return restTemplate.getForObject(glooEdgeProxyURL + "/orders/" + orderId, Order.class);
	}

	// add Order to Order Service
	public Order addOrder(Order order) {
		return restTemplate.postForObject(glooEdgeProxyURL + "/orders", order, Order.class);
	}

	// get OrderPositions from Order from Order Service by OrderID
	public OrderPosition[] findOrderPositionsFromOrderByOrderId(int orderId) {

		ResponseEntity<OrderPosition[]> response = restTemplate
				.getForEntity(glooEdgeProxyURL + "/orders/orderPositions/" + orderId, OrderPosition[].class);
		OrderPosition[] orderPositions = response.getBody();
		return orderPositions;
	}

	// add OrderPosition to Order Service
	public OrderPosition addOrderPosition(OrderPosition orderPosition) {
		return restTemplate.postForObject(glooEdgeProxyURL + "/orders/orderPosition", orderPosition,
				OrderPosition.class);
	}

	// get Article from OrderPosition from Order Service by OrderPositionID
	public Article getArticleFromOrderPositionById(int orderPositionId) {
		return restTemplate.getForObject(glooEdgeProxyURL + "/orders/orderPosition/" + orderPositionId, Article.class);
	}

	// delete Order by ID
	public void deleteOrderById(int orderId) {
		restTemplate.delete(glooEdgeProxyURL + "/orders/" + orderId);

	}
}
