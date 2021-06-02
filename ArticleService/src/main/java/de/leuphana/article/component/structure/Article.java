package de.leuphana.article.component.structure;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DB_Article")
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int articleId;
	private String name;
	private String manufactor;
	private Float price;

	public Article() {
	}

	public Article(String name, String manufactor, Float price) {
		this.name = name;
		this.manufactor = manufactor;
		this.price = price;
	}

	public int getArticleId() {
		return articleId;
	}

	public String getName() {
		return name;
	}

	public String getManufactor() {
		return manufactor;
	}

	public Float getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setManufactor(String manufactor) {
		this.manufactor = manufactor;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
