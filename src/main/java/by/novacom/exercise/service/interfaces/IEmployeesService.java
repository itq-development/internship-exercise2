package by.novacom.exercise.service.interfaces;

import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;

import java.util.List;

/**
 * Created by byaxe on 4/5/16.
 */
public interface IEmployeesService {

    List<EmployeesEntity> getEmployeesByCompany(final CompaniesEntity company);

    EmployeesEntity getEmployeeById(final int id);

}
