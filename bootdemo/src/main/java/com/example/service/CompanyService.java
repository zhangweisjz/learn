package com.example.service;

import com.example.entity.Company;

import java.util.List;

/**
 * Created by Sai on 4/21/2016.
 */
public interface CompanyService {
    List<Company> findAll();
    Company findOne(long id);
    void saveCompany(Company company);
    void delete(long id);
    List<Company> findByName(String name);
    void deleteByName(String name);
}
