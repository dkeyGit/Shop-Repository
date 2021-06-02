package de.leuphana.article.test.connector;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import de.leuphana.article.component.structure.Article;
import de.leuphana.article.connector.ComponentArticleSpringDataConnectorRequester;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentArticleRestConnectorProviderTest {

	@Autowired
	private ComponentArticleSpringDataConnectorRequester componentArticleSpringDataConnectorRequester;
	
	private Article article_d;
	private Article article_e;
	private Article article_f;
	private Article article_g;

	@Before
	public void setUp() {
		article_d = new Article();
		article_d.setName("Johnny");
		article_d.setPrice(17.5f);
		article_d.setManufactor("Leuphana");
		componentArticleSpringDataConnectorRequester.save(article_d);

		article_e = new Article();
		article_e.setName("Beton");
		article_e.setPrice(13.5f);
		article_e.setManufactor("Leuphana");
		componentArticleSpringDataConnectorRequester.save(article_e);

		article_f = new Article();
		article_f.setName("Model");
		article_f.setPrice(13.5f);
		article_f.setManufactor("Leuphana");
		componentArticleSpringDataConnectorRequester.save(article_f);

		article_g = new Article();
		article_g.setName("Scholle");
		article_g.setPrice(199.3f);
		article_g.setManufactor("SpugiAndLami");
		componentArticleSpringDataConnectorRequester.save(article_g);

	}
	

	// getArticles-Test
	@Test
	public void getArticles() {
		assertNotNull(componentArticleSpringDataConnectorRequester.findAll());
	}


	

}
