package org.college.work.dao.implementation;

import org.college.work.dao.api.ARepository;
import org.college.work.dao.api.IRepository;
import org.college.work.dao.api.ResultMapper;
import org.college.work.model.Result;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by byaxe on 6/27/16.
 */
@Repository
public class ResultRepository extends ARepository<Result> implements IRepository<Result> {

    @Override
    public Result get(Long id) {
        return null;
    }

    @Override
    public List<Result> getAll() {
        SQL = "SELECT * FROM results";

        return jdbcTemplate.query(SQL, new ResultMapper());
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, Result repository) {

    }

    @Override
    public void create(Result repository) {

    }
}
