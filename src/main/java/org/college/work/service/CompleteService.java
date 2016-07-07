package org.college.work.service;

import org.college.work.dao.implementation.ExamRepository;
import org.college.work.dao.implementation.ResultRepository;
import org.college.work.dao.implementation.StudentRepository;
import org.college.work.model.Exam;
import org.college.work.model.Result;
import org.college.work.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

/**
 * Created by byaxe on 6/27/16.
 */
@Service
public class CompleteService {

    private final ResultRepository resultRepository;

    private final StudentRepository studentRepository;

    private final ExamRepository examRepository;

    @Autowired
    public CompleteService(ResultRepository resultRepository,
                           StudentRepository studentRepository,
                           ExamRepository examRepository) {
        this.resultRepository = resultRepository;
        this.studentRepository = studentRepository;
        this.examRepository = examRepository;
    }

    public final Map<String, List<?>> getAll() {
        HashMap<String, List<?>> resultMap = new HashMap<>();

        resultMap.put("EXAMS", examRepository.getAll());
        resultMap.put("STUDENTS", studentRepository.getAll());
        resultMap.put("RESULTS", resultRepository.getAll());

        return resultMap;
    }

    public String createExam(Exam exam) {
        try {
            examRepository.create(exam);
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return th.toString();
        }
    }

    public String getAverageMarkByGroup(String groupId) {

        List<Student> studentList = studentRepository.getAll()
                .stream().filter(student -> student.getGroupNumber().equals(groupId)).collect(toList());

        List<Result> resultList = resultRepository.getAll();

        int amountOfStudents = 0;
        int sumOfMarks = 0;

        for (Student student : studentList) {
            if (Objects.equals(student.getGroupNumber(), groupId)) {
                ++amountOfStudents;
            }
        }

        for (Result result : resultList) {
            for (Student student : studentList) {
                if (Objects.equals(student.getId(), result.getStudentId())) {
                    sumOfMarks += result.getMark();
                }
            }
        }

        if (amountOfStudents == 0) {
            throw new IllegalStateException("No such group, of current group not contain students!");
        }

        if (sumOfMarks == 0) {
            throw new IllegalStateException("This group did not pass any exams yet.");
        }

        return String.valueOf(sumOfMarks / amountOfStudents);
    }

}
