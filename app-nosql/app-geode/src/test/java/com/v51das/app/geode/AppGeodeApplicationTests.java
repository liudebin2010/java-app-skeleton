package com.v51das.app.geode;

//import com.v51das.app.geode.domain.Book;
//import com.v51das.app.geode.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.gemfire.repository.Wrapper;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AppGeodeApplicationTests {

//    @Autowired
//    BookRepository bookRepository;

//    @Test
//    public void keywordQuery() {
//        List<Book> books =
//                Arrays.asList(
//                        new Book("978-4798142470", "Spring徹底入門 ", 4320),
//                        new Book("978-4774182179", "Spring入門 ", 4104),
//                        new Book("978-4777519699", "Spring Boot", 2700)
//                );
//
//        books.stream().map(book -> bookRepository.save(book));
//
//        assertThat(bookRepository.count())
//                .isEqualTo(3L);
//
//        List<Book> queryResultBooks = (List<Book>) bookRepository.findByTitleLikeOrderByPriceDesc("%フレームワーク%");
//        assertThat(queryResultBooks)
//                .hasSize(2);
//        assertThat(queryResultBooks.get(0).getTitle())
//                .isEqualTo("[改訂新版]Spring入門 ――Javaフレームワーク・より良い設計とアーキテクチャ");
//        assertThat(queryResultBooks.get(1).getTitle())
//                .isEqualTo("はじめてのSpring Boot―スプリング・フレームワークで簡単Javaアプリ開発");
//
//        bookRepository.delete((Book) books);
//    }
}
