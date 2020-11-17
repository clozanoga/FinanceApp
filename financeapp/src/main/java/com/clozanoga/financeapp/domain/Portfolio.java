package com.clozanoga.financeapp.domain;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

//@Document(collection = "portfolios")
public class Portfolio {
	
//	@Transient
//	public static final String SEQUENCE_NAME = "portofolios_sequence";
	
//	@Id
//	private Long id;
	@NotBlank(message = "Portfolio name is required")
	private String name;
	@NotBlank(message = "Portfolio description is required")
	private String description;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate createdAt;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate updatedAt;

	public Portfolio() {
		
	}
	
//	public Long getId() {
//		return id;
//	}
//
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

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

}
