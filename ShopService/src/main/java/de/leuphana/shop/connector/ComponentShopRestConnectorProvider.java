package de.leuphana.shop.connector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.leuphana.shop.behaviour.Shop;
import de.leuphana.shop.structure.Article;
import de.leuphana.shop.structure.Customer;
import de.leuphana.shop.structure.Order;
import de.leuphana.shop.structure.OrderPosition;

@RestController
@RequestMapping("/shop")
public class ComponentShopRestConnectorProvider {

	@Autowired
	Shop shop;

	// get all Articles from Article Service
	@GetMapping("/getArticles")
	public Article[] getArticles() {
		return shop.getArticles();
	}

	// get Article from Article Service by ID
	@GetMapping("/getArticleById/{articleId}")
	public Article getArticleById(@PathVariable("articleId") int articleId) {
		return shop.getArticleById(articleId);
	}

	// add Article to Article Service
	@PostMapping("/addArticleToCatalog")
	public Article addArticleToCatalog(@RequestBody Article article) {
		return shop.addArticleToCatalog(article);
	}

	// delete Article by ID
	@DeleteMapping("/deleteArticleById/{articleId}")
	public void deleteArticleById(@PathVariable int articleId) {
		shop.deleteArticleById(articleId);
	}

	// update Article by ID
	@PutMapping("/updateArticleById/{articleId}")
	public void updateArticleById(@PathVariable int articleId, @RequestBody Article article) {
		shop.updateArticleById(articleId, article);
	}

	// get all Customers from Customer Service
	@GetMapping("/getCustomers")
	public Customer[] getCustomers() {
		return shop.getCustomers();
	}

	// get Customer from Customer Service by ID
	@GetMapping("/findCustomerById/{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") int customerId) {
		return shop.getCustomerById(customerId);
	}

	// add Customer to Customer Service
	@PostMapping("/createCustomer")
	public Integer createCustomer(@RequestBody Customer customer) {
		return shop.createCustomerWithCart(customer.getName(), customer.getAddress());
	}

	// delete Customer by ID
	@DeleteMapping("/deleteCustomerById/{customerId}")
	public void deleteCustomerById(@PathVariable int customerId) {
		shop.deleteCustomerById(customerId);
	}

	// update Customer by ID
	@PutMapping("/updateCustomerById/{customerId}")
	public void updateCustomerById(@PathVariable int customerId, @RequestBody Customer customer) {
		shop.updateCustomerById(customerId, customer);
	}

	// get all Orders from Order Service
	@GetMapping("/getOrders")
	public Order[] getOrders() {
		return shop.getOrders();
	}

	// get Order from Order Service by ID
	@GetMapping("/getOrderById/{orderId}")
	public Order getOrderById(@PathVariable("orderId") int orderId) {
		return shop.getOrderById(orderId);
	}

	// Add Order to Order Service
	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order order) {
		return shop.addOrder(order);
	}

	// get OrderPositions from Order from Order Service by OrderID
	@GetMapping("/getOrderPositionsFromOrderByOrderId/{orderId}")
	public OrderPosition[] findOrderPositionsFromOrderByOrderId(@PathVariable("orderId") int orderId) {
		return shop.findOrderPositionsFromOrderByOrderId(orderId);
	}

	// add OrderPosition to Order Service
	@PostMapping("/addOrderPosition")
	public OrderPosition addOrderPosition(@RequestBody OrderPosition orderPosition) {
		return shop.addOrderPosition(orderPosition);
	}

	// delete Order by ID
	@DeleteMapping("/deleteOrderById/{orderId}")
	public void deleteOrderById(@PathVariable int orderId) {
		shop.deleteOrderById(orderId);
	}

	// get Article from OrderPosition from Order Service by OrderPositionID
	@GetMapping("/getArticleFromOrderPositionById/{orderPositionId}")
	public Article getArticleFromOrderPositionById(@PathVariable("orderPositionId") int orderPositionId) {
		return shop.getArticleFromOrderPositionById(orderPositionId);
	}
}
