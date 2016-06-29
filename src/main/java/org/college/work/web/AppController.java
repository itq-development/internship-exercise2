package org.college.work.web;

import org.college.work.model.Exam;
import org.college.work.service.CompleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.*;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Handles requests for the application index page.
 */
@RestController
@CrossOrigin(origins = "*")
public class AppController {

    private final CompleteService completeService;

    @Autowired
    public AppController(CompleteService completeService) {
        this.completeService = completeService;
    }

    @RequestMapping(method = GET, value = "/")
    public ResponseEntity<Map<String, List<?>>> get(HttpServletResponse response) {
        Map<String, List<?>> result = completeService.getAll();

        if (result.isEmpty()) return new ResponseEntity<>(NO_CONTENT);

        response.addHeader("Access-Control-Allow-Origin", "*");

        return new ResponseEntity<>(result, OK);
    }

    @RequestMapping(method = POST, value = "/")
    public ResponseEntity<String> create(@RequestBody Exam exam) {
        String response = completeService.createExam(exam);

        if (response == null) {
            return new ResponseEntity<>(OK);
        }

        return new ResponseEntity<>(response, BAD_REQUEST);
    }

    @RequestMapping(method = GET, value = "/mark/{groupId}")
    public ResponseEntity<String> getAverageMarkByGroup(@PathVariable("groupId") String groupId) {
        String markByGroup;

        try {
            markByGroup = completeService.getAverageMarkByGroup(groupId);
            return new ResponseEntity<>(markByGroup, OK);
        } catch (Throwable th) {
            return new ResponseEntity<>(th.getLocalizedMessage(), BAD_REQUEST);

        }

    }

}