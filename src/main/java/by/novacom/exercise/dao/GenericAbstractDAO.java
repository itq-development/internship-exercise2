package by.novacom.exercise.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by byaxe on 4/5/16.
 */
public abstract class GenericAbstractDAO {

    @PersistenceContext(unitName = "APPLICATION_PERSISTENCE_UNIT")
    protected EntityManager entityManager;
}
