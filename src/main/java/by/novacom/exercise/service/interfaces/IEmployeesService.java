package by.novacom.exercise.service.interfaces;

import by.novacom.exercise.entities.EmployeesEntity;

/**
 * Created by byaxe on 4/5/16.
 */
public interface IEmployeesService {

    EmployeesEntity getEmployeeById(final int id);

    EmployeesEntity addEmployee(EmployeesEntity employee);

    EmployeesEntity removeEmployee(final int id);
}
