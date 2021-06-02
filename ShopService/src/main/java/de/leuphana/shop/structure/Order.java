package de.leuphana.shop.structure;

public class Order {

	private Integer orderId;
	private Integer customerId;

	public Order() {

	}

	public Order(Integer customerId) {
		super();
		this.customerId = customerId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

//		public void addArticle(Article article) {
//			articles.add(article.getArticleId(), article);
//		}
//
//		public int getNumberOfArticles() {
//			// TODO Auto-generated method stub
//			return 0;
//		}

//		public double getTotalPrice() {
//			double totalPrice = 0.0;
	//
//			Article article;
//			for (OrderPositionEntity orderPosition : orderPositions) {
//				article = orderPosition.getArticle();
	//
//				totalPrice += orderPosition.getArticleQuantity() * article.getPrice();
//			}
	//
//			return totalPrice;
//		}

}