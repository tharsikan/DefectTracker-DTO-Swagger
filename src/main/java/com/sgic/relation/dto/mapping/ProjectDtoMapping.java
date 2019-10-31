package com.sgic.relation.dto.mapping;

import com.sgic.relation.dto.ProjectDto;
import com.sgic.relation.model.Project;

// to store data

public class ProjectDtoMapping {
	public static Project projectDtoToProject(ProjectDto projectDto) {
		Project project = new Project();
		project.setId(projectDto.getId());
		project.setName(projectDto.getName());
		project.setDescription(projectDto.getDescription());
		project.setCreated_date(projectDto.getCreated_date());
		project.setUpdated_date(projectDto.getUpdated_date());
		return project;
	}
}
