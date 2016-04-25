package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Sai on 4/20/2016.
 */

@Entity
@Table(name = "test_book")
public class Book implements Serializable {
    private static final long serialVersionUID = 8025948150436422040L;
    @Id
    long id;

    @Column(name = "name")
    String name;

    @Column(name = "author")
    String author;

    @Column(name = "price")
    long price;

    @ManyToOne
    @JoinColumn(name = "addressid")
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
