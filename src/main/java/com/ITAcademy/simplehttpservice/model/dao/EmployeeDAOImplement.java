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

    @Override
    @Transactional
    public void create(Employee employee) {
        em.persist(employee);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAll() {
        return em.createQuery("from Employee").getResultList();
    }
}
