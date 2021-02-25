package com.hcl.taskmanager.repository;

import com.hcl.taskmanager.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

	public User findUserByUsername(String name);
}
