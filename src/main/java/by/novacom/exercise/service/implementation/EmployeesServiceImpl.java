package by.novacom.exercise.service.implementation;

import by.novacom.exercise.dao.interfaces.IEmployeesDAO;
import by.novacom.exercise.entities.EmployeesEntity;
import by.novacom.exercise.service.interfaces.IEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by byaxe on 4/5/16.
 */
@Service
//@Transactional(readOnly = true)
public class EmployeesServiceImpl implements IEmployeesService {

    @Autowired
    private IEmployeesDAO employeesDAO;

    @Override
    public EmployeesEntity getEmployeeById(int id) {
        return this.employeesDAO.getEmployeeById(id);
    }

    @Override
//    @Transactional
    public EmployeesEntity addEmployee(EmployeesEntity employee) {
        return this.employeesDAO.addEmployee(employee);
    }

    @Override
//    @Transactional
    public EmployeesEntity removeEmployee(final int id) {
        return this.employeesDAO.removeEmployee(id);
    }
}
