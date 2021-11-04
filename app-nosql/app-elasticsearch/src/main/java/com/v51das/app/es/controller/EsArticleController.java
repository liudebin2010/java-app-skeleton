package com.v51das.app.es.controller;

import com.v51das.app.es.model.ArticleEntity;
import com.v51das.app.es.repository.ArticleRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/article")
public class EsArticleController {
    @Autowired
    private ArticleRepository articleReposiory;

    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @PostMapping("/add")
    public ArticleEntity addArticle(@RequestBody ArticleEntity article) {
        return articleReposiory.save(article);
    }

    @GetMapping("/find/{id}")
    public Optional<ArticleEntity> findArticle(@PathVariable Long id) {
        return articleReposiory.findById(String.valueOf(id));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteArticle(@PathVariable Long id) {
        articleReposiory.deleteById(String.valueOf(id));
    }

    @GetMapping("/findByTitleOrContentPage")
    public List<ArticleEntity> findByTitleOrContentPage(String title, String content, Integer pageNum, Integer pageSize) {
        Pageable pageable = PageRequest.of(pageNum, pageSize);
        return articleReposiory.findByTitleOrContent(title, content, pageable);
    }

    @GetMapping("/findByTitleOrContentPageByTemplate")
    public SearchHits<ArticleEntity> findByTitleOrContentPageByTemplate(String title, String content, Integer pageNum, Integer pageSize) {
        NativeSearchQuery nativeSearchQuery = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.queryStringQuery(title).defaultField("title"))
                .withQuery(QueryBuilders.queryStringQuery(content).defaultField("content"))
                .withPageable(PageRequest.of(pageNum, pageSize))
                .build();
        return elasticsearchRestTemplate.search(nativeSearchQuery, ArticleEntity.class);
    }


}
