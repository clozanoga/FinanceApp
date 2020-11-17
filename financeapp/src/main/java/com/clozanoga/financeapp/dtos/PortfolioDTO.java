package com.clozanoga.financeapp.dtos;

import java.io.Serializable;
import java.time.LocalDate;

public class PortfolioDTO implements Serializable {

	private static final long serialVersionUID = 2925429783657584357L;
	
//	private Long id;
	private String name;	
	private String description;

	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
