package org.college.work.dao.api;

import org.college.work.model.Exam;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by byaxe on 6/27/16.
 */
public class ExamMapper implements RowMapper<Exam> {

    @Override
    public Exam mapRow(ResultSet resultSet, int i) throws SQLException {

        Exam exam = new Exam();

        Long id = resultSet.getLong("id");
        String title = resultSet.getString("title");
        Date scheduledDate = resultSet.getDate("scheduled_date");
        Long cabinet = resultSet.getLong("cabinet");
        String status = resultSet.getString("status");
        Long group = resultSet.getLong("group_number");
        Long teacher = resultSet.getLong("teacher");

        exam.setId(id);
        exam.setTitle(title);
        exam.setScheduledDate(scheduledDate);
        exam.setCabinet(cabinet);
        exam.setStatus(status);
        exam.setGroup(group);
        exam.setTeacher(teacher);

        return exam;
    }
}
