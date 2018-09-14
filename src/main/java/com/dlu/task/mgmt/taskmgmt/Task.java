package com.dlu.task.mgmt.taskmgmt;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@EqualsAndHashCode
@Entity
@ToString
public class Task {


    @Id
    @GeneratedValue
    private long id;

    private String taskName;

    public Task(String taskName){
        this.taskName = taskName;
    }


}
