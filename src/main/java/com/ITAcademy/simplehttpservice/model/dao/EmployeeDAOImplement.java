package com.ITAcademy.simplehttpservice.model.dao;

import com.ITAcademy.simplehttpservice.model.entity.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeDAOImplement implements IEmployeeDAO{

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public List<Employee> findAll() {
        return em.createQuery("from Employee").getResultList();
    }
}
