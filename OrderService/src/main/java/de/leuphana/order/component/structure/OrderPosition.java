package de.leuphana.order.component.structure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DB_OrderPosition")
public class OrderPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderPositionId;
	private Integer articleId;
	private int articleQuantity;
	private Integer orderId;

	public OrderPosition() {
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public void setOrderPositionId(Integer orderPositionId) {
		this.orderPositionId = orderPositionId;
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
