package com.example.service;

import com.example.entity.Book;

import java.util.List;

/**
 * Created by Sai on 4/20/2016.
 */
public interface BookService {
    public List<Book> findAll();
    public void saveBook(Book book);
    public Book findOne(long id);
    public void delete(long id);
    public List<Book> findByName(String name);
    public List<Book> findByNameAndAuthor(String name, String author);
    public List<Book> findByPrice(long price);


}
