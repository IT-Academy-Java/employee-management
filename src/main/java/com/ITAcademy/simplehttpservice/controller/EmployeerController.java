package com.ITAcademy.simplehttpservice.controller;

import com.ITAcademy.simplehttpservice.model.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeerController {

    @Autowired
    private IEmployeeDAO iEmployeeDAO;

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list(Model model){
        model.addAttribute("title", "Employees list");
        model.addAttribute("employees", iEmployeeDAO.findAll());
        return "list";
    }
}
