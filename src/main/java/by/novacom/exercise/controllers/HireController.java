package by.novacom.exercise.controllers;

import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;
import by.novacom.exercise.service.interfaces.ICompaniesService;
import by.novacom.exercise.service.interfaces.IEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by byaxe on 4/7/16.
 */
@Controller
@RequestMapping(value = "/hire", method = RequestMethod.GET)
public class HireController {

    @Autowired
    private ICompaniesService companiesService;

    @Autowired
    private IEmployeesService employeesService;

    @RequestMapping
    public String loadPage(Model model) {
        model.addAttribute("selectedEmployee", new EmployeesEntity());
        model.addAttribute("selectedCompany", new CompaniesEntity());
        model.addAttribute("company", new CompaniesEntity());

        model.addAttribute("companies", new CompaniesEntity());
        model.addAttribute("companiesList", this.companiesService.getCompaniesList());

        model.addAttribute("employees", new EmployeesEntity());
        model.addAttribute("employeesList", this.employeesService.getEmployeesList());

        return "hire";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public ModelAndView hireEmployee(@RequestParam("selectedEmployee") String empl,
                                     @RequestParam("selectedCompany") String comp) {

        EmployeesEntity emplEntity = this.employeesService.getEmployeeById(Integer.parseInt(empl));
        CompaniesEntity compEntity = this.companiesService.getCompanyById(Integer.parseInt(comp));

        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("redirect:/hire");

        this.companiesService.addEmployee(emplEntity, compEntity);
        this.employeesService.addCompany(compEntity, emplEntity);

        return modelAndView;
    }

}
