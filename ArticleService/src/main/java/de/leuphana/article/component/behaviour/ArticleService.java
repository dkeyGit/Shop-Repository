package de.leuphana.article.component.behaviour;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.leuphana.article.component.structure.Article;
import de.leuphana.article.configuration.ArticleNotFoundException;
import de.leuphana.article.connector.ComponentArticleSpringDataConnectorRequester;

@Service
public class ArticleService {

	private final ComponentArticleSpringDataConnectorRequester repository;

	@Autowired
	public ArticleService(final ComponentArticleSpringDataConnectorRequester repository) {
		this.repository = repository;
	}

	// get all Articles
	public ArrayList<Article> getArticles() {
		return (ArrayList<Article>) repository.findAll();
	}

	// get Article by ID
	public Article getArticle(int articleId) {
		return repository.findById(articleId).orElseThrow(ArticleNotFoundException::new);
	}

	// add Article
	public Article addArticle(Article article) {
		return repository.save(article);
	}

	// update Article by ID
	public Article updateArticle(int articleId, Article article) {
		Article articleToUpdate = repository.findById(articleId).orElseThrow(ArticleNotFoundException::new);

		articleToUpdate.setName(article.getName());
		articleToUpdate.setManufactor(article.getManufactor());
		articleToUpdate.setPrice(article.getPrice());

		return repository.save(articleToUpdate);
	}

	// delete Article by ID
	public void deleteArticle(int articleId) {
		repository.findById(articleId).orElseThrow(ArticleNotFoundException::new);
		repository.deleteById(articleId);
	}
}
