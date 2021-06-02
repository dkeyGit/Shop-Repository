package de.leuphana.shop.behaviour;

import java.util.Set;

import de.leuphana.shop.structure.Article;
import de.leuphana.shop.structure.Cart;
import de.leuphana.shop.structure.Order;

public interface CustomerShopService {

	Integer createCustomerWithCart();

	Article getArticle(int articleId);

	Set<Article> getArticles();

	void removeArticleFromCart(Integer customerId, int articleId);

	void addArticleToCart(Integer customerId, Integer articleId);

	void decrementArticleQuantityInCart(Integer customerId, Integer articleId);

	Order checkOutCart(int customerId);

	Cart getCartForCustomer(Integer customerId);

}