package ru.unity.cluster.grant.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.unity.cluster.grant.model.ArticleEntity;
import ru.unity.cluster.grant.services.ArticleService;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {


    private final ArticleService articleService;

    @Autowired
    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ArticleEntity article) {
        articleService.create(article);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<ArticleEntity>> read() {
        final List<ArticleEntity> articles = articleService.readAll();
        final ArrayList<ArticleEntity> emptyList = new ArrayList<>();
        return articles != null && !articles.isEmpty()
                ? new ResponseEntity<>(articles, HttpStatus.OK)

        :new ResponseEntity<>(emptyList, HttpStatus.NO_CONTENT);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ArticleEntity> read(@PathVariable(name = "id") int id) {
        final ArticleEntity article = articleService.read(id);


        return article != null
                ? new ResponseEntity<>(article, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ArticleEntity> update(@PathVariable(name = "id") int id, @RequestBody ArticleEntity article){

        final boolean updated  = articleService.update(article, id);
        return updated
        ? new ResponseEntity<>(HttpStatus.OK)
        : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);

    }

    @DeleteMapping (value = "/{id}")
    public ResponseEntity<?> delete (@PathVariable(name  = "id") int id){

        final boolean deleted  = articleService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

}