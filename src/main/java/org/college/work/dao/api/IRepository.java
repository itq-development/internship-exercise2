package org.college.work.dao.api;


import javax.sql.DataSource;
import java.util.List;

/**
 * Created by byaxe on 6/27/16.
 */
public interface IRepository<T> {
    void setDataSource(DataSource source);

    T get(final Long id);

    List<T> getAll();

    void delete(final Long id);

    void update(final Long id, final T repository);

    void create(final T repository);
}
