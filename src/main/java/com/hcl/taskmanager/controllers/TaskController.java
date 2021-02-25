package com.hcl.taskmanager.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.hcl.taskmanager.model.Task;
import com.hcl.taskmanager.services.TaskService;
import com.hcl.taskmanager.services.UserService;

@Controller
public class TaskController {

	@Autowired
	TaskService taskService;

	@Autowired
	UserService userService;

	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) {
	 * 
	 * SimpleDateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
	 * binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,
	 * false)); }
	 */

	@RequestMapping(value = { "/", "/list-tasks" }, method = RequestMethod.GET)
	public String showAllTasks(ModelMap model, Principal principal) {
		Iterable<Task> tasks = taskService.GetAllTasks();
		model.put("tasks", tasks);
		model.put("user", userService.getUserByName(principal.getName()));
		return "list-task";
	}

	@RequestMapping(value = "/add-task", method = RequestMethod.GET)
	public String newTaskForm(ModelMap model) {
		return "add-task";
	}

	@RequestMapping(value = "/add-task", method = RequestMethod.POST)
	public RedirectView createNewTask(ModelMap model, Principal principal, Task task) {
		task.setUser(userService.getUserByName(principal.getName()));
		taskService.AddTask(task);
		return new RedirectView("list-tasks");
	}

	@RequestMapping(value = "delete-task/{id}", method = RequestMethod.GET)
	public ModelAndView deleteTask(ModelMap model, @PathVariable("id") Long id) {
		Task task = taskService.GetTaskById(id);
		taskService.DeleteTask(task);
		model.put("deleted", task.getName());
		return new ModelAndView("redirect:/list-tasks", model);
	}

}
