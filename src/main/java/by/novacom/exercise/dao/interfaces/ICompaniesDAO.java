package by.novacom.exercise.dao.interfaces;

import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;

import java.util.List;

/**
 * Created by byaxe on 4/5/16.
 */
public interface ICompaniesDAO {
    List<CompaniesEntity> getCompaniesList();

    CompaniesEntity getCompanyById(final int id);

    List<EmployeesEntity> getEmployeesListById(final int id);

    CompaniesEntity addCompany(CompaniesEntity company);

    EmployeesEntity addEmployee(EmployeesEntity employee, CompaniesEntity company);

    CompaniesEntity removeCompany(final int id);
}
