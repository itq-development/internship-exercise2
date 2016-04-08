package by.novacom.exercise.dao.interfaces;

import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;

import java.util.List;

/**
 * Created by byaxe on 4/5/16.
 */
public interface IEmployeesDAO {

    EmployeesEntity getEmployeeById(final int id);

    List<EmployeesEntity> getEmployeesList();

    EmployeesEntity addEmployee(EmployeesEntity employee);

    CompaniesEntity addCompany(CompaniesEntity company, EmployeesEntity employee);

    EmployeesEntity removeEmployee(final int id);
}
