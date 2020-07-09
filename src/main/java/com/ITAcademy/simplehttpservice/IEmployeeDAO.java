package com.ITAcademy.simplehttpservice;

import domain.Employee;

import java.util.List;

public interface IEmployeeDAO {
    public List<Employee> findAll();
}
