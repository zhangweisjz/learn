package com.example.service;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Sai on 4/20/2016.
 */

@Service
@Transactional
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findOne(long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public void delete(long id) {
        bookRepository.delete(id);
    }

    @Override
    public List<Book> findByName(String name) {
        return bookRepository.findByName(name);
    }

    @Override
    public List<Book> findByNameAndAuthor(String name, String author) {
        return bookRepository.findByNameAndAuthor(name, author);
    }

    @Override
    public List<Book> findByPrice(long price) {
        return bookRepository.findByPrice(price);
    }
}
