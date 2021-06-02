package de.leuphana.article.component.behaviour;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import de.leuphana.article.component.structure.Article;
import de.leuphana.article.connector.ComponentArticleSpringDataConnectorRequester;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

	private final ComponentArticleSpringDataConnectorRequester dReq;
	
	

	public DataLoader(ComponentArticleSpringDataConnectorRequester dReq) {
		this.dReq = dReq;
	}



	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Article article_a = new Article();
    	article_a.setName("Meerjungfrau");
    	article_a.setPrice(17.5f);
    	article_a.setManufactor("Leuphana");
		dReq.save(article_a);
		
		Article article_b = new Article();
		article_b.setName("Weihnachtsmann");
		article_b.setPrice(13.5f);
		article_b.setManufactor("Leuphana");
		dReq.save(article_b);
		
		Article article_c = new Article();
		article_c.setName("Osterhase");
		article_c.setPrice(13.5f);
		article_c.setManufactor("Leuphana");
		dReq.save(article_c);
	}

}
