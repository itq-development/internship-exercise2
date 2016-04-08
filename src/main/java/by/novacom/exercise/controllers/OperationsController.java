package by.novacom.exercise.controllers;

import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;
import by.novacom.exercise.service.interfaces.ICompaniesService;
import by.novacom.exercise.service.interfaces.IEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

/**
 * Created by byaxe on 4/6/16.
 */
@Controller
@RequestMapping(value = "/operations", method = RequestMethod.GET)
public class OperationsController {

    @Autowired
    private ICompaniesService companiesService;

    @Autowired
    private IEmployeesService employeesService;

    @RequestMapping
    public String loadPage(Model model,
                           @ModelAttribute("employee") EmployeesEntity employee,
                           @ModelAttribute("company") CompaniesEntity company) {
        return "operations";
    }

    @RequestMapping(value = "/add/employee", method = RequestMethod.POST)
    public ModelAndView addEmployee(@ModelAttribute("employee") EmployeesEntity employee) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("redirect:/operations");
        modelAndView.addObject("employee", employee);

        this.employeesService.addEmployee(employee);

        return modelAndView;
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
    public ModelAndView addCompany(@ModelAttribute("company") CompaniesEntity company) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("redirect:/operations");
        this.companiesService.addCompany(company);

        modelAndView.addObject("company", company);

        return modelAndView;
    }

    @RequestMapping(value = "/remove/company/")
    public String removeCompany(@RequestParam("id") Optional<Integer> id) {
        try {
            this.companiesService.removeCompany(id.get());
        } catch (Exception ignored) {
        }
        return "redirect:/operations";
    }
}
