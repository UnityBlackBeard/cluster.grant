package ru.unity.cluster.grant.services;

import ru.unity.cluster.grant.model.ArticleEntity;

import java.util.List;

public interface ArticleService {


    void create (ArticleEntity article);


    List<ArticleEntity> readAll();

    ArticleEntity read(int id);

    boolean update(ArticleEntity article, int id);

    boolean delete(int id);

}
