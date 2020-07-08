package com.ITAcademy.simplehttpservice;

import domain.Employee;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String init(Model model){

        Employee employee1 = new Employee();
        employee1.setName("Elena");
        employee1.setSurname("Piaggio");
        employee1.setJob("Developer");

        Employee employee2 = new Employee();
        employee2.setName("Sophia");
        employee2.setSurname("Collins");
        employee2.setJob("Analist");

        ArrayList<Employee> employeeList = new ArrayList();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(new Employee("Carlos", "Tomasini", "digital"));
        employeeList.add(new Employee("Bicho", "Tomasini", "art"));
        employeeList.add(new Employee("Arto", "Tomasini", "disseny"));
        employeeList.add(new Employee("Merlin", "Tomasini", "office"));

        // ArrayList<Employee> employeeArrayList = (ArrayList<Employee>) Arrays.asList(employee, employee2);

        //model.addAttribute("employee", employee);
        model.addAttribute("employeeList", employeeList);

        return "index";
    }
}
