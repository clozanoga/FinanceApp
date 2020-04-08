package com.clozanoga.financeapp.domain;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "portfolios")
public class Portfolio {
	
	@Transient
	public static final String SEQUENCE_NAME = "portofolios_sequence";
	
	@Id
	private long id;
	@NotBlank(message = "Portfolio name is required")
	private String name;
	@NotBlank(message = "Portfolio identifier is required")
	@Size(min=4, max=10, message = "Please use 4 to 10 characters")
	@Column(updatable = false, unique = true)
	private String identifier;
	@NotBlank(message = "Portfolio description is required")
	private String description;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate startDate;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate endDate;
	
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate createdAt;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate updatedAt;

	public Portfolio() {
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
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
