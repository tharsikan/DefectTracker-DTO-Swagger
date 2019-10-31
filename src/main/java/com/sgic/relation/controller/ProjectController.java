package com.sgic.relation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.relation.dto.ProjectDto;
import com.sgic.relation.model.Project;
import com.sgic.relation.service.ProjectService;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("/project")
	public ResponseEntity<Project> saveProject(@RequestBody ProjectDto projectDto) {
		return new ResponseEntity<>(projectService.saveProject(projectDto),HttpStatus.CREATED);
		//projectService.saveProject(projectDto) which returns the <Project>
	}
	
	@GetMapping("/project")
	public ResponseEntity<List<ProjectDto>> getAllProject() {
//		HttpHeaders httpHeaders = new HttpHeaders();
//		httpHeaders.add("Key1", "Value1");
//		httpHeaders.add("Key2", "Value2");
//		httpHeaders.add("Key3", "Value3");
//		return new ResponseEntity<>(projectService.getAllProject(),httpHeaders,HttpStatus.OK);
		return new ResponseEntity<>(projectService.getAllProject(),HttpStatus.OK);	
	}
	
	@GetMapping("/project/{p_id}")
	public ResponseEntity<ProjectDto> findProject(@PathVariable Long p_id) {
		return new ResponseEntity<>(projectService.getProjectById(p_id),HttpStatus.FOUND);
	}
	
	@PutMapping("/project/{p_id}")
	public Project updateProject(@PathVariable Long p_id, @RequestBody ProjectDto projectDto) {
		return projectService.updateProject(p_id, projectDto);
	}
	
	@DeleteMapping("/project/{p_id}")
	public ResponseEntity<?> deleteProject(@PathVariable Long p_id) {
		projectService.deleteProject(p_id);
		return ResponseEntity.ok().build();
	}
}
