package de.leuphana.article.connector;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.leuphana.article.component.behaviour.ArticleService;
import de.leuphana.article.component.structure.Article;

@RestController
@RequestMapping("articles")
public class ComponentArticleRestConnectorProvider {

	private final ArticleService articleService;

	public ComponentArticleRestConnectorProvider(final ArticleService articleService) {
		this.articleService = articleService;
	}

	// get all Articles
	@GetMapping("/articles")
	public ArrayList<Article> getArticles() {
		return articleService.getArticles();
	}

	// get Article by ID
	@GetMapping("/{articleId}")
	public Article getArticle(@PathVariable int articleId) {
		return articleService.getArticle(articleId);
	}

	// add Article
	@PostMapping
	public Article addArticle(@RequestBody Article article) {
		return articleService.addArticle(article);
	}

	// update Article by ID
	@PutMapping("/{articleId}")
	public void updateArticle(@PathVariable int articleId, @RequestBody Article article) {
		articleService.updateArticle(articleId, article);
	}

	// delete Article by ID
	@DeleteMapping("/{articleId}")
	public void deleteArticle(@PathVariable int articleId) {
		articleService.deleteArticle(articleId);
	}
}
