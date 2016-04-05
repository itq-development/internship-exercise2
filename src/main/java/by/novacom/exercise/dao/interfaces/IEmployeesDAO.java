package by.novacom.exercise.dao.interfaces;

import by.novacom.exercise.entities.EmployeesEntity;

/**
 * Created by byaxe on 4/5/16.
 */
public interface IEmployeesDAO {

    EmployeesEntity getEmployeeById(final int id);

}
