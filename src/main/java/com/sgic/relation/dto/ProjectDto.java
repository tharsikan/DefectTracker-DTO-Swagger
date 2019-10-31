package com.sgic.relation.dto;

import java.util.Date;

public class ProjectDto {

	private Long id;	
	private Date created_date;
	private Date updated_date;
	private String name;
	private String description;


	public void setId(Long id) {
		this.id = id;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	
	
}
