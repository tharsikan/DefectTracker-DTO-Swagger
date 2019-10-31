package com.sgic.relation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.relation.dto.DefectRequestDto;
import com.sgic.relation.dto.DefectResponseDto;
import com.sgic.relation.model.Defect;
import com.sgic.relation.service.DefectService;

@RestController
public class DefectController {
	
	@Autowired
	private DefectService defectService;
	
	@PostMapping("/project/{p_id}/defect")
	public ResponseEntity<Defect> saveDefect(@RequestBody DefectRequestDto DefectRequestDto,@PathVariable Long p_id) {
		return new ResponseEntity<>(defectService.saveDefect(p_id,DefectRequestDto),HttpStatus.CREATED);
	}
	
	@GetMapping("/project/defect")
	public ResponseEntity<List<DefectResponseDto>> findDefect() {
		return new ResponseEntity<>(defectService.findAllDefect(),HttpStatus.FOUND);
	}
	
	@GetMapping("/project/defect/{d_id}")
	public ResponseEntity<DefectResponseDto> findAllDefect(@PathVariable Long d_id) {
		return new ResponseEntity<>(defectService.findDefect(d_id),HttpStatus.FOUND);		
	}
	
	@GetMapping("/project/{p_id}/defect")
	public ResponseEntity<List<DefectRequestDto>> findProjectsDefects(@PathVariable Long p_id) {
		return new ResponseEntity<>(defectService.projectHasDefects(p_id),HttpStatus.FOUND);		
	}
	
//	@GetMapping("/project/{p_id}/defect/{d_id}")
//	public ResponseEntity<DefectResponseDto> findProjectsDefect(@PathVariable Long d_id) {
//		return new ResponseEntity<>(defectService.projectHasDefect(p_id,d_id),HttpStatus.FOUND);		
//	}
	

//	@PutMapping("/defect/{id}")
//	public ResponseEntity<DefectRequestDto> editDefect(@PathVariable Long id, @RequestBody DefectRequestDto defectDto) {
//		return new ResponseEntity<>(defectService.editDefect(defectDto, id),HttpStatus.CREATED);
//	}
//	
//	@DeleteMapping("/defect/{id}")
//	public ResponseEntity<?> deleteDefect(@PathVariable Long id) {
//		  defectService.deleteDefect(id);
//		  return ResponseEntity.ok().build();
//	}
}
