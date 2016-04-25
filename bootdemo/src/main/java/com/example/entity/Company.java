package com.example.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Sai on 4/21/2016.
 */


@Entity
@Table(name="test_company")
public class Company implements Serializable{
    private static final long serialVersionUID = 6095859037713007152L;

    @Column
    public String name;

    @Column(name="register_number")
    public String register_no;

    @Column
    public String address;

    @Column
    public String representative;

    @Column
    public String business_scope;

    @Column
    public String capital;

    @Column
    public String phone;

    @Column
    public String register_date;

    @Column
    public String province;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    public Long id;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegister_no() {
        return register_no;
    }

    public void setRegister_no(String register_no) {
        this.register_no = register_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getBusiness_scope() {
        return business_scope;
    }

    public void setBusiness_scope(String business_scope) {
        this.business_scope = business_scope;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegister_date() {
        return register_date;
    }

    public void setRegister_date(String register_date) {
        this.register_date = register_date;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


}
