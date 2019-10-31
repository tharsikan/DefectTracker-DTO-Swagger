package com.sgic.relation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.relation.dto.DefectRequestDto;
import com.sgic.relation.dto.DefectResponseDto;
import com.sgic.relation.dto.mapping.DefectDtoMapping;
import com.sgic.relation.entity.mapping.DefectMapping;
import com.sgic.relation.model.Defect;
import com.sgic.relation.repository.DefectRepo;
import com.sgic.relation.repository.ProjectRepo;

@Service
public class DefectService {
	
	@Autowired
	private DefectRepo defectRepo;
	
	@Autowired
	private ProjectRepo projectRepo;
	
	public Defect saveDefect(Long p_id, DefectRequestDto defectRequestDto) {
		return projectRepo.findById(p_id).map(project->{
			Defect defect = DefectDtoMapping.defectDtoToDefect(defectRequestDto);
			defect.setProject(project);
			return defectRepo.save(defect);
		}).orElse(null);
	}
	
	public DefectResponseDto findDefect(Long id) {
		return DefectMapping.defectToDefectResponseDto(defectRepo.findById(id).orElse(null));
	}
	
	public List<DefectRequestDto> projectHasDefects(Long p_id) {
		return DefectMapping.defectListToDefectRequestListDto(projectRepo.findById(p_id).map(project->{
			return project.getDefects();
		}).orElse(null));
	}
	
	public List<DefectResponseDto> findAllDefect(){
		return DefectMapping.defectListToDefectDtoList(defectRepo.findAll());
	}
	
	public DefectResponseDto editDefect(DefectRequestDto defectDto,Long id){
		return DefectMapping.defectToDefectResponseDto(defectRepo.findById(id).map(defect->{
			defect.setDescription(defectDto.getDescription());
			defect.setPriority(defectDto.getPriority());
			defect.setSeviarity(defectDto.getSeviarity());
			defect.setCreated_date(defectDto.getCreated_date());
			defect.setUpdated_date(defectDto.getUpdated_date());
			return defectRepo.save(defect);
		}).orElse(null));
	}
	
	public void deleteDefect(Long id) {
		defectRepo.findById(id).map(defect->{
			defectRepo.delete(defect);
			return null;
		}).orElse(null);
	}
}
	