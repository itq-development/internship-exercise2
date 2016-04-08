package by.novacom.exercise.aspects;

import by.novacom.exercise.entities.CompaniesEntity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by byaxe on 4/8/16.
 */
@Aspect
public class DeleteCompaniesWatcher {

    @Pointcut("execution(* by.novacom.exercise.dao.interfaces.ICompaniesDAO.removeCompany(..))")
    private void tryToRemoveCompany() {
    }


    @Around(value = "tryToRemoveCompany()")
    public void onCompanyRemove(ProceedingJoinPoint joinPoint) {
        CompaniesEntity company;
        try {
            company = (CompaniesEntity) joinPoint.proceed();
            if (!company.getChildren().isEmpty()) throw new Exception();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

}
