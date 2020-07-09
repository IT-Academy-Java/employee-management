package com.ITAcademy.simplehttpservice.model.dao;


import com.ITAcademy.simplehttpservice.model.entity.Employee;

import java.util.List;

public interface IEmployeeDAO {
    public List<Employee> findAll();
}
