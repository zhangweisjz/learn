package com.example.service;

import com.example.entity.Company;
import com.example.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Sai on 4/21/2016.
 */
@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Override
    public Company findOne(long id) {
        return companyRepository.findOne(id);
    }

    @Override
    public void saveCompany(Company company) {
        companyRepository.save(company);
    }

    @Override
    public void delete(long id) {
        companyRepository.delete(id);
    }

    @Override
    public List<Company> findByName(String name) {
        return companyRepository.findByName(name);
    }

    @Override
    public void deleteByName(String name) {
        companyRepository.deleteByName(name);
    }
}
