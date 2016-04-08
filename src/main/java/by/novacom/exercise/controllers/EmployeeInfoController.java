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

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

/**
 * Created by byaxe on 4/8/16.
 */
@Controller
@RequestMapping(value = "/employees", method = RequestMethod.GET)
public class EmployeeInfoController {

    @Autowired
    private IEmployeesService employeesService;

    @Autowired
    private ICompaniesService companiesService;

    private Set<CompaniesEntity> companiesSet;


    /**
     * ?id=X
     */
    @RequestMapping
    public String loadPageAndGetInfoViaGetQuery(Model model, @RequestParam("id") Optional<Integer> idOptional) {
        model.addAttribute("employees", new CompaniesEntity());

        model.addAttribute("selectedEmployee", new EmployeesEntity());
        model.addAttribute("entireEmployeesList", this.employeesService.getEmployeesList());

        model.addAttribute("queriedCompanies", companiesSet);

        try {
            model.addAttribute("employeesList", this.companiesService.getEmployeesListById(idOptional.get()));
        } catch (NoSuchElementException ignored) {
        }
        return "employees";
    }

    @RequestMapping(value = "/employees/where/does/he/work", method = RequestMethod.POST)
    public String companiesListWhereEmployeeWorks(Model model,
                                                  @RequestParam("selectedEmployee") String empl) {
        EmployeesEntity emplEntity = this.employeesService.getEmployeeById(Integer.parseInt(empl));

        companiesSet = emplEntity.getCompanies();

        model.addAttribute("queriedCompanies", companiesSet);

        return "redirect:/employees";
    }


}
