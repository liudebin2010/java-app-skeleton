package com.v51das.app.es.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "index_blog")
@Data
public class ArticleEntity {
    @Id
    @Field(type = FieldType.Long, store = true)
    private Long id;

    @Field(type = FieldType.Text, store = true, analyzer = "ik_smart")
    private String title;

    @Field(type = FieldType.Text, store = true, analyzer = "ik_smart")
    private String content;
}
