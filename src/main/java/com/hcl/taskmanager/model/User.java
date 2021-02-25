package com.hcl.taskmanager.model;

import javax.persistence.*;

import lombok.Data;

@Entity
public @Data class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String username;

	private String password;
}
