package org.college.work.dao.api;

import org.college.work.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by byaxe on 6/27/16.
 */
public class StudentMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student student = new Student();

        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        student.setGroupNumber(rs.getString("group_number"));
        student.setSex(rs.getString("sex"));

        return student;
    }
}
