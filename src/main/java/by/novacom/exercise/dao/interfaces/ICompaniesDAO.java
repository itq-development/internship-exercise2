package by.novacom.exercise.dao.interfaces;

import by.novacom.exercise.entities.CompaniesEntity;

import java.util.List;

/**
 * Created by byaxe on 4/5/16.
 */
public interface ICompaniesDAO {
    List<CompaniesEntity> getCompaniesList();

    CompaniesEntity getCompanyById(final int id);
}
