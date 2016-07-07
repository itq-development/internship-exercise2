package org.college.work.dao.implementation;

import org.college.work.dao.api.ARepository;
import org.college.work.dao.api.ExamMapper;
import org.college.work.dao.api.IRepository;
import org.college.work.model.Exam;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

/**
 * Created by byaxe on 6/27/16.
 */
@Repository
public class ExamRepository extends ARepository<Exam> implements IRepository<Exam> {

    @Override
    public Exam get(final Long id) {
        SQL = "SELECT * FROM exams WHERE id = ?";

        return jdbcTemplate.queryForObject(SQL, new Object[]{id}, new ExamMapper());
    }

    @Override
    public List<Exam> getAll() {
        SQL = "SELECT * FROM exams";

        return jdbcTemplate.query(SQL, new ExamMapper());
    }

    @Override
    public void delete(Long id) {
        SQL = "DELETE FROM exams WHERE id = ?";

        jdbcTemplate.update(SQL, id);
    }

    @Override
    public void update(Long id, Exam repository) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void create(Exam repository) {
        SQL = "INSERT INTO exams (title, scheduled_date, cabinet, status, group_number, teacher) VALUES (?,?,?,?,?,?)";

        if (!validateOnCreate(repository)) throw new IllegalStateException("Wrong date or cabinet for exam.");

        jdbcTemplate.update(SQL,
                repository.getTitle(),
                repository.getScheduledDate(),
                repository.getCabinet(),
                repository.getStatus(),
                repository.getGroup(),
                repository.getTeacher());

    }

    private boolean validateOnCreate(Exam exam) {
        List<Exam> examList = getAll();

        for (Exam exam1 : examList) {
            if (Objects.equals(exam.getGroup(), exam1.getGroup())) {

                Long MAX_DIFFERENCE = 259_200_000L;
                if (!exam.getScheduledDate().equals(exam1.getScheduledDate()) ||
                        exam.getScheduledDate().getTime() - exam1.getScheduledDate().getTime() >= MAX_DIFFERENCE ||
                        exam1.getScheduledDate().getTime() - exam.getScheduledDate().getTime() >= MAX_DIFFERENCE) {
                    return false;
                }
            } else {
                if (!Objects.equals(exam.getCabinet(), exam1.getCabinet())) {
                    return false;
                }
            }
        }

        return true;
    }
}

