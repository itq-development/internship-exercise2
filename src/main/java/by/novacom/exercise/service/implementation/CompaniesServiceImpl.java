package by.novacom.exercise.service.implementation;

import by.novacom.exercise.dao.implementation.CompaniesDAOImpl;
import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;
import by.novacom.exercise.service.interfaces.ICompaniesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by byaxe on 4/5/16.
 */

@Service
public class CompaniesServiceImpl implements ICompaniesService {

    @Autowired
    CompaniesDAOImpl companiesDAO;

    @Override
    public List<CompaniesEntity> getCompaniesList() {
        return this.companiesDAO.getCompaniesList();
    }

    @Override
    public CompaniesEntity getCompanyById(final int id) {
        return this.companiesDAO.getCompanyById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public List<EmployeesEntity> getEmployeesListById(final int id) {
        return this.companiesDAO.getEmployeesListById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)

    public CompaniesEntity addCompany(CompaniesEntity company) {
        return this.companiesDAO.addCompany(company);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public CompaniesEntity removeCompany(final int id) {
        return this.companiesDAO.removeCompany(id);
    }
}
