package com.sgic.relation.entity.mapping;

import java.util.ArrayList;
import java.util.List;

import com.sgic.relation.dto.ProjectDto;
import com.sgic.relation.model.Project;

// for getting data

public class ProjectMapping {
	public static ProjectDto projectToprojectDto(Project project) {
		ProjectDto projectDto = new ProjectDto();
		projectDto.setId(project.getId());
		projectDto.setName(project.getName());
		projectDto.setDescription(project.getDescription());
		projectDto.setCreated_date(project.getCreated_date());
		projectDto.setUpdated_date(project.getUpdated_date());
		return projectDto;
	}
	
	public static List<ProjectDto> projectDtoListToProjectList(List<Project> projectList){
		List<ProjectDto> proectDtoList = new ArrayList<ProjectDto>();
		if(projectList!=null) {
			for(Project project:projectList) {
				proectDtoList.add(projectToprojectDto(project));
			}
		}
		return proectDtoList;
	}
}
