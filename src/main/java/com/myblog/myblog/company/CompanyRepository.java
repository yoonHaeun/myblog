package com.myblog.myblog.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional(readOnly = true)
public interface CompanyRepository extends JpaRepository<Company, Long> {

    List<Company> findAll();
    List<Company> findAllById(Long id);

}