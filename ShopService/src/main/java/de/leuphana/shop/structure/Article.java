package de.leuphana.shop.structure;

import java.io.Serializable;

// Marker-interface
public class Article implements Serializable {

	private Integer articleId;
	private String manufactor;
	private String name;
	private float price;

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getManufactor() {
		return manufactor;
	}

	public void setManufactor(String manufactor) {
		this.manufactor = manufactor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}