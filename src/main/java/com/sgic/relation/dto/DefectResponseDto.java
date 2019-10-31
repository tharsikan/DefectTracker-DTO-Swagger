package com.sgic.relation.dto;

import java.util.Date;

public class DefectResponseDto {
	private Long id;

	private String description;
	private String seviarity;
	private String priority;
	private Date updated_date;
	private Date created_date;
	private ProjectDto project;

	public ProjectDto getProject() {
		return project;
	}

	public void setProject(ProjectDto project) {
		this.project = project;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSeviarity(String seviarity) {
		this.seviarity = seviarity;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public String getSeviarity() {
		return seviarity;
	}

	public String getPriority() {
		return priority;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public Date getCreated_date() {
		return created_date;
	}

}
