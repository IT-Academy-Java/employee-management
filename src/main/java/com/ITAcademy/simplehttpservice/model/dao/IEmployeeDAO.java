package com.ITAcademy.simplehttpservice.model.dao;


import com.ITAcademy.simplehttpservice.model.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IEmployeeDAO {
    public List<Employee> findAll();
}
