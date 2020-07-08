package com.ITAcademy.simplehttpservice;

import domain.Employee;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String init(Model model){

        Employee employee = new Employee();
        employee.setName("Elena");
        employee.setSurname("Piaggio");
        employee.setJob("Developer");

        return "index";
    }
}
