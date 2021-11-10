package com.v51das.app.geode.repository;

import java.util.List;
import com.v51das.app.geode.domain.Book;
import org.springframework.data.gemfire.mapping.annotation.Region;
import org.springframework.data.gemfire.repository.GemfireRepository;
import org.springframework.data.gemfire.repository.Query;
import org.springframework.data.gemfire.repository.support.SimpleGemfireRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
    List<Book> findByTitleLikeOrderByPriceDesc(String title);

    @Query("<TRACE> SELECT * FROM /myRegion ")
    List<Book> findByPriceGreaterThan(int price);
}