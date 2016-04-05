package by.novacom.exercise.dao.implementation;

import by.novacom.exercise.dao.GenericAbstractDAO;
import by.novacom.exercise.dao.interfaces.IEmployeesDAO;
import by.novacom.exercise.entities.CompaniesEntity;
import by.novacom.exercise.entities.EmployeesEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by byaxe on 4/5/16.
 */
@Repository
public class EmployeesDAOImpl extends GenericAbstractDAO implements IEmployeesDAO {

    @Override
    public List<EmployeesEntity> getEmployeesByCompany(final CompaniesEntity company) {
        return null/*entityManager.createQuery("SELECT e FROM EmployeesEntity WHERE ",
            EmployeesEntity.class).getResultList()*/;
    }

    @Override
    public EmployeesEntity getEmployeeById(final int id) {
        return entityManager.createQuery("SELECT e FROM EmployeesEntity WHERE id = " + id,
                EmployeesEntity.class).getSingleResult();
    }
}
