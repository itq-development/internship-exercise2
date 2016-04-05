package by.novacom.exercise.dao.implementation;

import by.novacom.exercise.dao.GenericAbstractDAO;
import by.novacom.exercise.dao.interfaces.ICompaniesDAO;
import by.novacom.exercise.entities.CompaniesEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
}
