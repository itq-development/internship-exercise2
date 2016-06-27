package org.college.work.dao.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Created by byaxe on 6/27/16.
 */
@Component
public abstract class ARepository<T> implements IRepository<T> {

    protected JdbcTemplate jdbcTemplate;

    protected String SQL;

    @Override
    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

}
