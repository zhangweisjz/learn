package com.example.repository;

import com.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Sai on 4/20/2016.
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByName(String name);
    List<Book> findByNameAndAuthor(String name, String author);
    List<Book> findByPrice(long price);
}
