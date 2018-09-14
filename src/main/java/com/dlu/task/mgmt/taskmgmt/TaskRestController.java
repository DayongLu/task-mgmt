package com.dlu.task.mgmt.taskmgmt;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskRestController {

    private TaskRepository repository;

    public TaskRestController(TaskRepository repository) {
        this.repository = repository;
    }

    @GetMapping(value = "/tasks",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Task> getTasks(){

        return this.repository.findAll();

    }
}
