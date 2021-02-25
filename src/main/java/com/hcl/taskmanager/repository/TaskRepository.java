package com.hcl.taskmanager.repository;

import com.hcl.taskmanager.model.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long>{

}
