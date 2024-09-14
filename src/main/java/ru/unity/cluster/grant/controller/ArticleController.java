package ru.unity.cluster.grant.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.unity.cluster.grant.model.Article;
import ru.unity.cluster.grant.services.ArticleService;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class ArticleController {

    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping(value = "/articles")
    public ResponseEntity<?> create(@RequestBody Article article) {
        articleService.create(article);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/articles")
    public ResponseEntity<List<Article>> read() {
        final List<Article> articles = articleService.readAll();
        final ArrayList<Article> emptyList = new ArrayList<>();
        return articles != null && !articles.isEmpty()
                ? new ResponseEntity<>(articles, HttpStatus.OK)

                //: new ResponseEntity<>(HttpStatus.NOT_FOUND);
        :new ResponseEntity<>(emptyList, HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/articles/{id}")
    public ResponseEntity<Article> read(@PathVariable(name = "id") int id) {
        final Article article = articleService.read(id);
        final Article emptyArticle = new Article();

        return article != null
                ? new ResponseEntity<>(article, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}