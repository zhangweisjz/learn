package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Sai on 4/24/2016.
 */
@Entity
@Table(name = "test_address")
public class Address implements Serializable{
    private static final long serialVersionUID = -3541059157210384355L;

    @Id
    @Column(name= "addressid")
    private long addressId;

    @Column(name="addresscountry")
    private String addressCountry;

    @Column(name="addresscity")
    private String addressCity;

//    @OneToMany(cascade=CascadeType.ALL, mappedBy="address")
//    private List<Book> books;

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

//    public List<Book> getBooks() {
//        return books;
//    }
//
//    public void setBooks(List<Book> books) {
//        this.books = books;
//    }


}
