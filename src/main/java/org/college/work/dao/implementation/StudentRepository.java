package org.college.work.dao.implementation;

import org.college.work.dao.api.ARepository;
import org.college.work.dao.api.IRepository;
import org.college.work.dao.api.StudentMapper;
import org.college.work.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by byaxe on 6/27/16.
 */
@Repository
public class StudentRepository extends ARepository<Student> implements IRepository<Student> {

    @Override
    public Student get(Long id) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        SQL = "SELECT * FROM students";

        return jdbcTemplate.query(SQL, new StudentMapper());
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, Student repository) {

    }

    @Override
    public void create(Student repository) {

    }
}
