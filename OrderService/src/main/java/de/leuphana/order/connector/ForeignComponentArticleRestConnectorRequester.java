package de.leuphana.order.connector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import de.leuphana.order.component.structure.Article;

@RestController
public class ForeignComponentArticleRestConnectorRequester {

	@Autowired
	RestTemplate restTemplate;

	// get Article from OrderPosition by ArticleID
	public Article findByArticleIdFromOrderPostion(int articleId) {
		return restTemplate.getForObject("http://articleservice:8081/articles/" + articleId, Article.class);
	}

}
