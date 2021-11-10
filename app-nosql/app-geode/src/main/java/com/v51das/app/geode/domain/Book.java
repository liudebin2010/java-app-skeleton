package com.v51das.app.geode.domain;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.config.annotation.EnablePdx;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Region("book")
//@EnablePdx
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String isbn;
    private String title;
    private Integer price;

    public Book(String isbn, String title, Integer price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    public Book() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}