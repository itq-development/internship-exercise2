package org.college.work.service;

import org.college.work.dao.implementation.ExamRepository;
import org.college.work.dao.implementation.ResultRepository;
import org.college.work.dao.implementation.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
