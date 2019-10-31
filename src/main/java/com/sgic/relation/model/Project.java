package com.sgic.relation.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date created_date;

	@Temporal(TemporalType.DATE)
	private Date updated_date;
	private String name;

	private String description;

	@OneToMany(fetch = FetchType.EAGER,mappedBy = "project")
	private List<Defect> defects;

	public List<Defect> getDefects() {
		return defects;
	}

	public void setDefects(List<Defect> defects) {
		this.defects = defects;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

}
