package com.osoleksandr.service;

import com.osoleksandr.model.Book;

import java.util.List;

public interface BookService {

    void add(Book book);
    void updateBook(Book book);
    void removeBook(long id);
    Book getBookById(long d);
    List<Book> getListOfBooks();

}
