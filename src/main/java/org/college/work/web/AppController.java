package org.college.work.web;

import org.college.work.service.CompleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.NO_CONTENT;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Handles requests for the application index page.
 */
@RestController
public class AppController {

    private final CompleteService completeService;

    @Autowired
    public AppController(CompleteService completeService) {
        this.completeService = completeService;
    }

    @RequestMapping(method = GET, value = "/")
    public ResponseEntity<Map<String, List<?>>> get() {
        Map<String, List<?>> result = completeService.getAll();

        if (result.isEmpty()) return new ResponseEntity<>(NO_CONTENT);

        return new ResponseEntity<>(result, OK);
    }

    @RequestMapping(method = POST, value = "/")
    public void create() {
        // TODO implement!
    }

/*    @RequestMapping(method = GET, value = "/mark/{groupId}")
    public int getAverageMarkByGroup(@PathVariable("groupId") Integer groupId) {

    }*/

}