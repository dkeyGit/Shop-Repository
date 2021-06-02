package de.leuphana.shop.structure;

public class CartItem {

	private int cartItemId;
	private Integer articleId;
	private int quantity;

	public CartItem() {
		quantity = 1;
	}

	public int getCartItemId() {
		return cartItemId;
	}
	
	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void incrementQuantity() {
		quantity++;
	}
	
	public void decrementQuantity() {
		quantity--;
	}

}