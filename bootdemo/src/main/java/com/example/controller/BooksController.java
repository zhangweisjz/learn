package com.example.controller;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Created by Sai on 4/20/2016.
 */

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BookRepository bookRepository;

    static final Logger logger = LogManager.getLogger(BooksController.class.getName());


    //CREATE
    @RequestMapping(value = "/add/{id}/{name}/{author}/{price}")
    @ResponseBody
    public String addBook(@PathVariable int id, @PathVariable String name, @PathVariable String author, @PathVariable long price) {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setAuthor(author);
        book.setPrice(price);
        try {
            bookRepository.save(book);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return e.getMessage();
        }
        return "Creation successful: " + String.valueOf(id);
    }

    //DELETE
    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public String deleteBook(@PathVariable long id) {
        try {
            bookRepository.delete(id);
        } catch (Exception e) {
            logger.error(e.getMessage());
            return e.getMessage();
        }
        return "Deletion successful";
    }


    @RequestMapping(value = "/{id}")
    public Book getBook(@PathVariable long id) {
        Book book = bookRepository.findOne(id);
        return book;
    }

    @RequestMapping("/")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }


    @RequestMapping(value = "/search/name/{name}")
    public List<Book> getBookByName(@PathVariable String name) {
        List<Book> books = bookRepository.findByName(name);
        return books;
    }

    @RequestMapping(value = "search/{name}/{author}")
    public List<Book> getBookByNameAndAuthor(@PathVariable String name, @PathVariable String author) {
        List<Book> books = bookRepository.findByNameAndAuthor(name, author);
        return books;
    }

    @RequestMapping(value = "search/price/{price}")
    public List<Book> getBookByPrice(@PathVariable long price) {
        List<Book> books = bookRepository.findByPrice(price);
        return books;
    }
}
