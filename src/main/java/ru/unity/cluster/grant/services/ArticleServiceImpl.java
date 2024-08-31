package ru.unity.cluster.grant.services;

import org.springframework.stereotype.Service;
import ru.unity.cluster.grant.model.Article;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class ArticleServiceImpl implements ArticleService{

    private static final Map<Integer, Article> ARTICLE_REPOSITORY_MAP = new HashMap<>();

    private static final AtomicInteger ARTICLE_ID_HOLDER = new AtomicInteger();


    @Override
    public void create(Article article) {
        final int articleId = ARTICLE_ID_HOLDER.incrementAndGet();
        article.setId(articleId);
        ARTICLE_REPOSITORY_MAP.put(articleId, article);
    }

    @Override
    public List<Article> readAll() {

        return new ArrayList<>(ARTICLE_REPOSITORY_MAP.values());
    }

    @Override
    public Article read(int id) {
        return ARTICLE_REPOSITORY_MAP.get(id);
    }

   @Override
    public boolean update(Article article, int id) {
       if (ARTICLE_REPOSITORY_MAP.containsKey(id)) {
           article.setId(id);
           ARTICLE_REPOSITORY_MAP.put(id, article);
           return true;
       }

       return false;


   }

    @Override
    public boolean delete(int id) {
        return ARTICLE_REPOSITORY_MAP.remove(id) != null;

    }
}
