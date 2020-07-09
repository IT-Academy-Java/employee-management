package com.ITAcademy.simplehttpservice.model.dao;

import com.ITAcademy.simplehttpservice.model.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDAOImplement implements IEmployeeDAO{
    @Override
    public List<Employee> findAll() {
        return null;
    }
}
