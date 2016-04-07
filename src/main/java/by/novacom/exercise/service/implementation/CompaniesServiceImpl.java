package by.novacom.exercise.service.implementation;

import by.novacom.exercise.dao.interfaces.ICompaniesDAO;
import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;
import by.novacom.exercise.service.interfaces.ICompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by byaxe on 4/5/16.
 */

@Service
//@Transactional(readOnly = true)
public class CompaniesServiceImpl implements ICompaniesService {

    @Autowired
    private ICompaniesDAO companiesDAO;

    @Override
    public List<CompaniesEntity> getCompaniesList() {
        return this.companiesDAO.getCompaniesList();
    }

    @Override
    public CompaniesEntity getCompanyById(final int id) {
        return this.companiesDAO.getCompanyById(id);
    }

    @Override
    public List<EmployeesEntity> getEmployeesListById(final int id) {
        return this.companiesDAO.getEmployeesListById(id);
    }

    @Override
//    @Transactional
    public CompaniesEntity addCompany(CompaniesEntity company) {
        return this.companiesDAO.addCompany(company);
    }

    @Override
//    @Transactional
    public CompaniesEntity removeCompany(final int id) {
        return this.companiesDAO.removeCompany(id);
    }
}
