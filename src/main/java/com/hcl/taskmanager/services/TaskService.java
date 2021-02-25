package com.hcl.taskmanager.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.taskmanager.model.Task;
import com.hcl.taskmanager.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public Iterable<Task> GetAllTasks() {
		return taskRepository.findAll();
	}

	public Task GetTaskById(Long id) {
		return taskRepository.findById(id).get();
	}

	public Task AddTask(Task task) {
		return taskRepository.save(task);
	}

	public void DeleteTask(Task task) {
		taskRepository.delete(task);
	}
	
	public void UpdateTask(Task task) {
		taskRepository.save(task);
	}
}
