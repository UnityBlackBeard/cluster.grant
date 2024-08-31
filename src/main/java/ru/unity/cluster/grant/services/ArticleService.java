package ru.unity.cluster.grant.services;

import ru.unity.cluster.grant.model.Article;

import java.util.List;

public interface ArticleService {


    void create (Article article);


    List<Article> readAll();

    Article read(int id);

    boolean update(Article article, int id);

    boolean delete(int id);

}
