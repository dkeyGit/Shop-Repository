package de.leuphana.article.connector;

import org.springframework.data.repository.CrudRepository;

import de.leuphana.article.component.structure.Article;

//Spring Data Connector
public interface ComponentArticleSpringDataConnectorRequester extends CrudRepository<Article, Integer> {
	public Article findByName(String name);

	public void deleteByName(String name);

}
