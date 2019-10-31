package com.sgic.relation.dto.mapping;

import com.sgic.relation.dto.DefectRequestDto;
import com.sgic.relation.model.Defect;

public class DefectDtoMapping {
	public static Defect defectDtoToDefect(DefectRequestDto defectDto) {
		Defect defect = new Defect();
		defect.setId(defectDto.getId());
		defect.setDescription(defectDto.getDescription());
		defect.setPriority(defectDto.getPriority());
		defect.setSeviarity(defectDto.getSeviarity());
		defect.setCreated_date(defectDto.getCreated_date());
		defect.setUpdated_date(defectDto.getUpdated_date());
		return defect;
	}
	
}
