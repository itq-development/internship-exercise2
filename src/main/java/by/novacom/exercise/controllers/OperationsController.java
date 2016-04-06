package by.novacom.exercise.controllers;

import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;
import by.novacom.exercise.service.implementation.CompaniesServiceImpl;
import by.novacom.exercise.service.implementation.EmployeesServiceImpl;
import by.novacom.exercise.service.interfaces.ICompaniesService;
import by.novacom.exercise.service.interfaces.IEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by byaxe on 4/6/16.
 */
@Controller
@RequestMapping(value = "/operations")
public class OperationsController {

    @Autowired
    private ICompaniesService companiesService;

    @Autowired
    private IEmployeesService employeesService;

    @RequestMapping(method = RequestMethod.GET)
    public String loadPage(@ModelAttribute("employee") EmployeesEntity employee) {
        return "operations";
    }

    @RequestMapping(value = "/add/employee", method = RequestMethod.GET)
    public String addEmployee(@ModelAttribute("employee") EmployeesEntity employee) {
        this.employeesService.addEmployee(employee);
        return "redirect:/operations";
    }

    @RequestMapping(value = "/remove/employee/")
    public String removeEmployee(@RequestParam("id") Optional<Integer> id) {
        try {
            this.employeesService.removeEmployee(id.get());
        } catch (Exception ignored) {
        }
        return "redirect:/operations";
    }

    @RequestMapping(value = "/add/company", method = RequestMethod.POST)
    public String addCompany(@ModelAttribute("company") CompaniesEntity company) {
        this.companiesService.addCompany(company);
        return "redirect:/operations";
    }

    @RequestMapping(value = "/remove/company/")
    public String removeCompany(@RequestParam("id") Optional<Integer> id) {
        try {
            this.employeesService.removeEmployee(id.get());
        } catch (Exception ignored) {
        }
        return "redirect:/operations";
    }
}
