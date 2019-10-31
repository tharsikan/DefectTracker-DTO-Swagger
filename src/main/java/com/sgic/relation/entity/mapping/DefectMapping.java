package com.sgic.relation.entity.mapping;

import java.util.ArrayList;
import java.util.List;

import com.sgic.relation.dto.DefectRequestDto;
import com.sgic.relation.dto.DefectResponseDto;
import com.sgic.relation.dto.ProjectDto;
import com.sgic.relation.model.Defect;

public class DefectMapping {
	public static DefectResponseDto defectToDefectResponseDto(Defect defect) {
		DefectResponseDto defectResponseDto = new DefectResponseDto();
		defectResponseDto.setId(defect.getId());
		defectResponseDto.setDescription(defect.getDescription());
		defectResponseDto.setSeviarity(defect.getSeviarity());
		defectResponseDto.setPriority(defect.getPriority());
		defectResponseDto.setCreated_date(defect.getCreated_date());
		defectResponseDto.setUpdated_date(defect.getUpdated_date());
		
		ProjectDto projectDto = new ProjectDto();
		projectDto.setId(defect.getProject().getId());
		projectDto.setName(defect.getProject().getName());
		projectDto.setDescription(defect.getProject().getDescription());
		projectDto.setCreated_date(defect.getProject().getCreated_date());
		projectDto.setUpdated_date(defect.getProject().getUpdated_date());
		
		defectResponseDto.setProject(projectDto);
		
		return defectResponseDto;
	}
	
	public static List<DefectResponseDto> defectListToDefectDtoList(List<Defect> defectList) {
		List<DefectResponseDto> defectResponseDtoList = new ArrayList<>();
		if(defectResponseDtoList!=null) {
			for(Defect defect: defectList) {
				defectResponseDtoList.add(defectToDefectResponseDto(defect));
			}
		}
		return defectResponseDtoList;
	}
	public static DefectRequestDto defectToDefectRequestDto(Defect defect) {
		DefectRequestDto defectRequestDto = new DefectRequestDto();
		defectRequestDto.setId(defect.getId());
		defectRequestDto.setDescription(defect.getDescription());
		defectRequestDto.setSeviarity(defect.getSeviarity());
		defectRequestDto.setPriority(defect.getPriority());
		defectRequestDto.setCreated_date(defect.getCreated_date());
		defectRequestDto.setUpdated_date(defect.getUpdated_date());
		
		return defectRequestDto;
	}
	
	public static List<DefectRequestDto> defectListToDefectRequestListDto(List<Defect> defectList) {
		List<DefectRequestDto> defectRequestDtoList = new ArrayList<>();
		if(defectRequestDtoList!=null) {
			for(Defect defect: defectList) {
				defectRequestDtoList.add(defectToDefectRequestDto(defect));
			}
		}
		return defectRequestDtoList;
	}
}
