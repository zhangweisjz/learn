package com.example.controller;

import com.example.entity.Company;
import com.example.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Sai on 4/21/2016.
 */
@RestController
@RequestMapping(value="/companies")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @RequestMapping(value="/")
    public List<Company> getCompanies(){
        return companyService.findAll();
    }

    @RequestMapping(value="/{id}")
    public Company getCompany(@PathVariable long id){
        return companyService.findOne(id);
    }

    @RequestMapping(value="/search/name/{name}")
    public List<Company> getCompanyByName(@PathVariable String name){
        return companyService.findByName(name);
    }

    @RequestMapping(value="/delete/{id}")
    public void deleteCompany(@PathVariable long id){
        companyService.delete(id);
    }

    @RequestMapping(value="delete/name/{name}")
    public void deleteCompany(@PathVariable String name){
        companyService.deleteByName(name);
    }

}
