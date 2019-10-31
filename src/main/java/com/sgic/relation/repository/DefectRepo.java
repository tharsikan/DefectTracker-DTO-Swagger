package com.sgic.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.relation.model.Defect;

public interface DefectRepo extends JpaRepository<Defect, Long>{
	
}
