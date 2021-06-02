package de.leuphana.shop.structure;

public class OrderPosition {

	private Integer orderPositionId;
	private Integer articleId;
	private int articleQuantity;
	private Integer orderId;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public void setOrderPositionId(Integer positionId) {
		this.orderPositionId = positionId;
	}

	public Integer getOrderPositionId() {
		return orderPositionId;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public int getArticleQuantity() {
		return articleQuantity;
	}

	public void setArticleQuantity(int articleQuantity) {
		this.articleQuantity = articleQuantity;
	}

}