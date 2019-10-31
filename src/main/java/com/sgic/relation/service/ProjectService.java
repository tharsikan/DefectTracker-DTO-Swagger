package com.sgic.relation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.relation.dto.ProjectDto;
import com.sgic.relation.dto.mapping.ProjectDtoMapping;
import com.sgic.relation.entity.mapping.ProjectMapping;
import com.sgic.relation.model.Project;
import com.sgic.relation.repository.ProjectRepo;

@Service
public class ProjectService {
	@Autowired
	private ProjectRepo projectRepo;
	
	public Project saveProject(ProjectDto projectDto) {
		return projectRepo.save(ProjectDtoMapping.projectDtoToProject(projectDto));
	}
		
    public List<ProjectDto> getAllProject() {
        return ProjectMapping.projectDtoListToProjectList(projectRepo.findAll());
    }
		
	public ProjectDto getProjectById(Long p_id) {
		return ProjectMapping.projectToprojectDto(projectRepo.findById(p_id).orElse(null));
	}
	
	public Project updateProject(Long p_id,ProjectDto projectDto) {
		return (projectRepo.findById(p_id).map(proj->{
			proj.setName(projectDto.getName());
			proj.setDescription(projectDto.getDescription());
			proj.setCreated_date(projectDto.getCreated_date());
			proj.setUpdated_date(projectDto.getUpdated_date());
			return projectRepo.save(proj);
		}).orElse(null));
	}
	
	public void deleteProject(Long p_id) {
		 projectRepo.findById(p_id).map(proj->{
			  projectRepo.delete(proj);
			  return null;
		 }).orElse(null);
	}
}