package by.novacom.exercise.dao.implementation;

import by.novacom.exercise.dao.GenericAbstractDAO;
import by.novacom.exercise.dao.interfaces.ICompaniesDAO;
import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by byaxe on 4/5/16.
 */

@Repository
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
    public CompaniesEntity addCompany(CompaniesEntity company) {
        entityManager.persist(company);
        return company;
    }

    @Override
    public CompaniesEntity removeCompany(final int id) {
        CompaniesEntity removedCompany = entityManager
                .createQuery("SELECT c FROM CompaniesEntity c WHERE id = " + id,
                        CompaniesEntity.class).getSingleResult();

        entityManager.remove(removedCompany);

        return removedCompany;
    }
}