package com.osoleksandr.dao;

import com.osoleksandr.model.Book;

import java.util.List;

public interface BookDao {

    void add(Book book);
    void updateBook(Book book);
    void removeBook(long id);
    Book getBookById(long d);
    List<Book> getListOfBooks();
}
