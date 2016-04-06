package by.novacom.exercise.dao.implementation;

import by.novacom.exercise.dao.GenericAbstractDAO;
import by.novacom.exercise.dao.interfaces.IEmployeesDAO;
import by.novacom.exercise.entities.EmployeesEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by byaxe on 4/5/16.
 */
@Repository
public class EmployeesDAOImpl extends GenericAbstractDAO implements IEmployeesDAO {

    @Override
    public EmployeesEntity getEmployeeById(final int id) {
        return entityManager.createQuery("SELECT e FROM EmployeesEntity e WHERE id = " + id,
                EmployeesEntity.class).getSingleResult();
    }

    @Override
    public EmployeesEntity addEmployee(EmployeesEntity employee) {
        entityManager.persist(employee);
        return employee;
    }

    @Override
    @Transactional
    public EmployeesEntity removeEmployee(final int id) {
        EmployeesEntity removedEmployee = entityManager
                .createQuery("SELECT e FROM EmployeesEntity e WHERE e.id = :id",
                        EmployeesEntity.class).setParameter("id", id).getSingleResult();

        entityManager.remove(removedEmployee);

        return removedEmployee;
    }
}