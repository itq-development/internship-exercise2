package by.novacom.exercise.controllers;

import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;
import by.novacom.exercise.service.implementation.CompaniesServiceImpl;
import by.novacom.exercise.service.implementation.EmployeesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

/**
 * Created by byaxe on 4/6/16.
 */
@Controller
@RequestMapping(value = "/operations")
public class OperationsController {

    @Autowired
    CompaniesServiceImpl companiesService;

    @Autowired
    EmployeesServiceImpl employeesService;

    @RequestMapping(method = RequestMethod.GET)
    public String loadPage() {
        return "operations";
    }

    @RequestMapping(value = "/add/employee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute("employee") EmployeesEntity employee) {
        this.employeesService.addEmployee(employee);
        return "redirect:operations";
    }

    @RequestMapping(value = "/remove/employee/{id}")
    public String removeEmployee(@PathVariable("id") Optional<Integer> id) {
        try {
            this.employeesService.removeEmployee(id.get());
        } catch (Exception ignored) {
        }
        return "redirect:operations";
    }

    @RequestMapping(value = "/add/company", method = RequestMethod.POST)
    public String addCompany(@ModelAttribute("company") CompaniesEntity company) {
        this.companiesService.addCompany(company);
        return "redirect:operations";
    }

    @RequestMapping(value = "/remove/company/{id}")
    public String removeCompany(@PathVariable("id") Optional<Integer> id) {
        try {
            this.employeesService.removeEmployee(id.get());
        } catch (Exception ignored) {
        }
        return "redirect:operations";
    }
}
