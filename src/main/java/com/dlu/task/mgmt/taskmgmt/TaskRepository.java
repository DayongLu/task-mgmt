package com.dlu.task.mgmt.taskmgmt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task,Long> {
}
