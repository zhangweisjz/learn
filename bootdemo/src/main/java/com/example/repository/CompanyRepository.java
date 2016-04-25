package com.example.repository;

import com.example.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Sai on 4/21/2016.
 */
public interface CompanyRepository extends JpaRepository<Company, Long> {
    List<Company> findByName(String name);
    List<Company> deleteByName(String name);
}
