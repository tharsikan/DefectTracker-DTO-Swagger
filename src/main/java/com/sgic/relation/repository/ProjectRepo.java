package com.sgic.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.relation.model.Project;

public interface ProjectRepo extends JpaRepository<Project, Long>{

}
