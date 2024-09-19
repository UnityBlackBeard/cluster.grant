package ru.unity.cluster.grant.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.unity.cluster.grant.model.ArticleEntity;

@RestController
@RequestMapping("/answer")
public class CommonController {


    @GetMapping
    public ResponseEntity<String> getAnswer() {
        final ArticleEntity emptyArticle = new ArticleEntity();

// тут возвращать лучше статус ок
// и сам созданный объект

        return new ResponseEntity<>("ok", HttpStatus.OK);

    }
}
