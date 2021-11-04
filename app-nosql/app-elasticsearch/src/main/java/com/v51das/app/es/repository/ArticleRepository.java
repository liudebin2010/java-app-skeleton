package com.v51das.app.es.repository;

import com.v51das.app.es.model.ArticleEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends ElasticsearchRepository<ArticleEntity, String> {

    List<ArticleEntity> findByTitle(String title);
    List<ArticleEntity> findByTitleOrContent(String title, String content);
    List<ArticleEntity> findByTitleOrContent(String title, String content, Pageable pageable);

}