package com.osoleksandr.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "book_price")
    private Long price;
    @Column(name = "book_title")
    private String bookTitle;
    @Column(name = "book_author")
    private String bookAuthor;

    //list genres; many to many
    //todo big decimal price price;

    public Book() {}

    public Book(Long price, String bookTitle, String bookAuthor) {
        this.price = price;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
