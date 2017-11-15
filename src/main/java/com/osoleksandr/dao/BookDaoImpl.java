package com.osoleksandr.dao;

import com.osoleksandr.model.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BookDaoImpl implements BookDao {

    //todo logging

    @Autowired
    private SessionFactory sessionFactory;

    public void add(Book book) {
        sessionFactory.getCurrentSession().persist(book);
    }

    public void updateBook(Book book) {
        sessionFactory.getCurrentSession().update(book);
    }

    public void removeBook(long id) {
        sessionFactory.getCurrentSession().delete(id);
    }

    public Book getBookById(long id) {
        return (Book) sessionFactory.getCurrentSession().get(Book.class, id);

    }

    public List<Book> getListOfBooks() {
        List<Book> bookList = sessionFactory.getCurrentSession().createQuery("from Book").list();
        return bookList;
    }
}
