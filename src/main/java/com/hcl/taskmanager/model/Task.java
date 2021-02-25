package com.hcl.taskmanager.model;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
public @Data class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String email;
	private String description;
	/*https://stackoverflow.com/questions/22787790/jsp-form-date-input-field*/
	@Column(name = "start_date")@DateTimeFormat(pattern = "yyyy-MM-dd")//annotation provided by DateTimeFormat by spring
	private Date startDate;
	@Column(name = "end_date")@DateTimeFormat(pattern = "yyyy-MM-dd")//Note: date format must be dd-mm-yy i.e. 27-10-2017 if you use other format it will cause exception
	private Date endDate;
	private String severity;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

}
