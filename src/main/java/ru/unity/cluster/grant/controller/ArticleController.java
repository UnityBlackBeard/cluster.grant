package ru.unity.cluster.grant.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.unity.cluster.grant.model.Article;
import ru.unity.cluster.grant.services.ArticleService;


import java.util.List;

@RestController
@RequestMapping("/get")
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

        return articles != null && !articles.isEmpty()
                ? new ResponseEntity<>(articles, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/articles/{id}")
    public ResponseEntity<Article> read(@PathVariable(name = "id") int id) {
        final Article article = articleService.read(id);

        return article != null
                ? new ResponseEntity<>(article, HttpStatus.OK)
                : new
//тут вернуть пустой массив ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

   //вынести в отдельный контроллер с отдельным мапингом 
 @GetMapping("/answer")
    public ResponseEntity<String> getAnswer() {

// тут возвращать лучше статус ок и сам созданный объект
        return new ResponseEntity<>("ok", HttpStatus.CREATED);

    }
}