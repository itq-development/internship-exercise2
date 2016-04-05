package by.novacom.exercise.service.implementation;

import by.novacom.exercise.dao.implementation.EmployeesDAOImpl;
import by.novacom.exercise.entities.EmployeesEntity;
import by.novacom.exercise.service.interfaces.IEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by byaxe on 4/5/16.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EmployeesServiceImpl implements IEmployeesService {

    @Autowired
    EmployeesDAOImpl employeesDAO;

    @Override
    public EmployeesEntity getEmployeeById(int id) {
        return this.employeesDAO.getEmployeeById(id);
    }
}
