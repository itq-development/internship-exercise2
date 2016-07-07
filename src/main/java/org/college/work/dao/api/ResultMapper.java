package org.college.work.dao.api;

import org.college.work.model.Result;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by byaxe on 6/27/16.
 */
public class ResultMapper implements RowMapper<Result> {

    @Override
    public Result mapRow(ResultSet rs, int rowNum) throws SQLException {

        Result result = new Result();

        result.setStudentId(rs.getLong("student_id"));
        result.setExamId(rs.getLong("exam_id"));
        result.setMark(rs.getInt("mark"));
        result.setVisited(rs.getBoolean("visited"));

        return result;
    }
}
