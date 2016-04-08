package by.novacom.exercise.dao.implementation;

import by.novacom.exercise.dao.GenericAbstractDAO;
import by.novacom.exercise.dao.interfaces.ICompaniesDAO;
import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Created by byaxe on 4/5/16.
 */

@Repository
@Transactional(readOnly = true)
public class CompaniesDAOImpl extends GenericAbstractDAO implements ICompaniesDAO {

    @Override
    public List<CompaniesEntity> getCompaniesList() {
        return entityManager.createQuery("SELECT c FROM CompaniesEntity c",
                CompaniesEntity.class).getResultList();
    }

    @Override
    public CompaniesEntity getCompanyById(final int id) {
        return entityManager.createQuery("SELECT c FROM CompaniesEntity c WHERE id = " + id,
                CompaniesEntity.class).getSingleResult();
    }

    @Override
    public List<EmployeesEntity> getEmployeesListById(final int id) {
        return entityManager.createQuery("SELECT e FROM EmployeesEntity e JOIN" +
                " e.companies c WHERE c.id = " + id, EmployeesEntity.class)
                .getResultList();
    }

    @Override
    @Transactional
    public CompaniesEntity addCompany(final CompaniesEntity company) {
        entityManager.persist(company);
        return company;
    }

    @Override
    @Transactional
    public EmployeesEntity addEmployee(EmployeesEntity employee, CompaniesEntity company) {
        Set<EmployeesEntity> newEmployees = company.getEmployees();

        newEmployees.add(employee);

        company.setEmployees(newEmployees);

        entityManager.persist(company);

        return employee;
    }

    @Override
    @Transactional
    public CompaniesEntity removeCompany(final int id) {
        CompaniesEntity removedCompany = entityManager
                .createQuery("SELECT c FROM CompaniesEntity c WHERE id = :id",
                        CompaniesEntity.class).setParameter("id", id).getSingleResult();

        entityManager.remove(removedCompany);

        if(true) throw new RuntimeException();

        return removedCompany;
    }
}