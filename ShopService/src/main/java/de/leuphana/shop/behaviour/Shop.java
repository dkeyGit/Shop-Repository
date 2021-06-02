package de.leuphana.shop.behaviour;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import de.leuphana.shop.connector.ForeignComponentShopRestConnectorRequester;
import de.leuphana.shop.structure.Article;
import de.leuphana.shop.structure.Cart;
import de.leuphana.shop.structure.CartItem;
import de.leuphana.shop.structure.Customer;
import de.leuphana.shop.structure.Order;
import de.leuphana.shop.structure.OrderPosition;

@Controller
public class Shop {
	// implements CustomerShopService, ProducerShopService
	// private Catalog catalog;
	private Map<Integer, Customer> customersWithCart;

	@Autowired
	ForeignComponentShopRestConnectorRequester foreignComponentShopRestConnectorRequester;

	public Shop() {
		customersWithCart = new HashMap<Integer, Customer>();
	}

	public Article[] getArticles() {
		return foreignComponentShopRestConnectorRequester.getArticles();

	}

	public Article getArticleById(int articleId) {
		return foreignComponentShopRestConnectorRequester.getArticleById(articleId);
	}

	public Article addArticleToCatalog(Article article) {
		return foreignComponentShopRestConnectorRequester.addArticleToCatalog(article);
	}

	public void deleteArticleById(int articleId) {
		foreignComponentShopRestConnectorRequester.deleteArticleById(articleId);
	}

	public void updateArticleById(int articleId, Article article) {
		foreignComponentShopRestConnectorRequester.updateArticleById(articleId, article);

	}

	public Customer[] getCustomers() {
		return foreignComponentShopRestConnectorRequester.getCustomers();
	}

	public Customer getCustomerById(int customerId) {
		return foreignComponentShopRestConnectorRequester.getCustomerById(customerId);
	}

	public void deleteCustomerById(int customerId) {
		foreignComponentShopRestConnectorRequester.deleteCustomerById(customerId);

	}

	public Integer createCustomerWithCart(String customerName, String customerAddress) {
		Customer customer = new Customer();
		customer.setName(customerName);
		customer.setAddress(customerAddress);
		Customer cust = foreignComponentShopRestConnectorRequester.createCustomer(customer);

		Cart cart = new Cart();
		cust.setCart(cart);

		customersWithCart.put(cust.getCustomerId(), cust);

		return cust.getCustomerId();
	}

	public Order[] getOrders() {
		return foreignComponentShopRestConnectorRequester.getOrders();
	}

	public Order getOrderById(int orderId) {
		return foreignComponentShopRestConnectorRequester.getOrderById(orderId);
	}

	public Order addOrder(Order order) {
		return foreignComponentShopRestConnectorRequester.addOrder(order);
	}

	public OrderPosition[] findOrderPositionsFromOrderByOrderId(int orderId) {
		return foreignComponentShopRestConnectorRequester.findOrderPositionsFromOrderByOrderId(orderId);
	}

	public OrderPosition addOrderPosition(OrderPosition orderPosition) {
		return foreignComponentShopRestConnectorRequester.addOrderPosition(orderPosition);
	}

	public Article getArticleFromOrderPositionById(int orderPositionId) {
		return foreignComponentShopRestConnectorRequester.getArticleFromOrderPositionById(orderPositionId);
	}

	public void removeArticleFromCart(Integer customerId, int articleId) { // Delegation Cart cart =
		Cart cart = customersWithCart.get(customerId).getCart();
		cart.deleteCartItem(articleId);
	}

	public void addArticleToCart(Integer customerId, Integer articleId) {
		Article foundArticle = getArticleById(articleId);

		Cart cart = customersWithCart.get(customerId).getCart();

		cart.addCartItem(foundArticle);
	}

	public void decrementArticleQuantityInCart(Integer customerId, Integer articleId) {
		Cart cart = customersWithCart.get(customerId).getCart();

		cart.decrementArticleQuantity(articleId);
	}

	public Order checkOutCart(int customerId) {

		Cart cart = customersWithCart.get(customerId).getCart();

		Order order = new Order();
		order.setCustomerId(customerId);
		Order orderForOrderId = foreignComponentShopRestConnectorRequester.addOrder(order);
		int orderId = orderForOrderId.getOrderId();

		// int i = 0;

		// List<OrderPosition> orderPositions = new ArrayList<OrderPosition>();
		for (CartItem cartItem : cart.getCartItems()) {
			OrderPosition orderPosition = new OrderPosition();
			// orderPosition.setPositionId(i++);
			orderPosition.setOrderId(orderId);
			orderPosition.setArticleId(cartItem.getArticleId());
			orderPosition.setArticleQuantity(cartItem.getQuantity());
			foreignComponentShopRestConnectorRequester.addOrderPosition(orderPosition);
			// orderPositions.add(orderPosition);
		}
		// order.setOrderPositions(orderPositions);

		// customer.addOrder(order);

		return order;
	}

	public Map<Integer, Customer> getCustomersWithCart() {
		return customersWithCart;
	}

	public Cart getCartFromCustomer(Integer customerId) {
		Cart cart = customersWithCart.get(customerId).getCart();
		return cart;
	}

	public void deleteOrderById(int orderId) {
		foreignComponentShopRestConnectorRequester.deleteOrderById(orderId);

	}

	public void updateCustomerById(int customerId, Customer customer) {
		foreignComponentShopRestConnectorRequester.updateCustomerById(customerId, customer);

	}

}