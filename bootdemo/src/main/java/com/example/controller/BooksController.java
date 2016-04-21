package com.example.controller;

import com.example.entity.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sai on 4/20/2016.
 */

@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value="/add/{id}/{name}/{author}/{price}")
    public Book addBook(@PathVariable int id, @PathVariable String name, @PathVariable String author, @PathVariable long price){
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setAuthor(author);
        book.setPrice(price);
        bookService.saveBook(book);
        return book;
    }

    @RequestMapping(value="/delete/{id}")
    public void deleteBook(@PathVariable long id){
//        Book book = new Book();
//        book.setId(id);
        bookService.delete(id);
    }

    @RequestMapping(value="/{id}")
    public Book getBook(@PathVariable int id){
        Book book = bookService.findOne(id);
        return book;
    }

    @RequestMapping("/")
    public List<Book> getBooks(){
        return bookService.findAll();
    }


    @RequestMapping(value="/search/name/{name}")
    public List<Book> getBookByName(@PathVariable String name){
        List<Book> books = bookService.findByName(name);
        return books;
    }

    @RequestMapping(value="search/{name}/{author}")
    public List<Book> getBookByNameAndAuthor(@PathVariable String name, @PathVariable String author){
        List<Book> books = bookService.findByNameAndAuthor(name, author);
        return books;
    }

    @RequestMapping(value="search/price/{price}")
    public List<Book> getBookByPrice(@PathVariable long price){
        List<Book> books = bookService.findByPrice(price);
        return books;
    }
}
