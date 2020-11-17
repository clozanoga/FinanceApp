package com.clozanoga.financeapp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "assets")
public class Asset {

	@Transient
	public static final String SEQUENCE_NAME = "assets_sequence";
	
	@Id
	private Long id;
	
	private String name;
	
}
