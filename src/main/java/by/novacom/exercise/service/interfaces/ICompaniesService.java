package by.novacom.exercise.service.interfaces;

import by.novacom.exercise.entities.CompaniesEntity;

import java.util.List;

/**
 * Created by byaxe on 4/5/16.
 */
public interface ICompaniesService {

    List<CompaniesEntity> getCompaniesList();

    CompaniesEntity getCompanyById(final int id);

}
