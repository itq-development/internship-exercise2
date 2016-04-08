package by.novacom.exercise.aspects;

import by.novacom.exercise.entities.CompaniesEntity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by byaxe on 4/8/16.
 */
@Service
@Aspect
@Transactional(readOnly = true)
public class DeleteCompaniesWatcher {

    @Around("execution(* by.novacom.exercise.dao.interfaces.ICompaniesDAO.removeCompany(..))")
    public void onCompanyRemove(ProceedingJoinPoint joinPoint) {
        CompaniesEntity company;
        try {
            company = (CompaniesEntity) joinPoint.proceed();
            if (!company.getChildren().isEmpty() || !company.getEmployees().isEmpty()) throw new Exception();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
