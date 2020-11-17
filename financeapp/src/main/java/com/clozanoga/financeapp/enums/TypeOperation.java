package com.clozanoga.financeapp.enums;

import com.clozanoga.financeapp.deserializers.TypeOperationDeserializer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = TypeOperationDeserializer.class)
public enum TypeOperation {
	
	@JsonProperty("B")
	BUY("B"),
	
	@JsonProperty("S")
	SELL("S");
	
	private final String type;
	
	private TypeOperation(String type) {
		this.type = type;
	}
	
	public static TypeOperation nameOf(String type) {
		for(TypeOperation v : values()) {
			if (v.type.equals(type)) {
				return v;
			}
		}
		return null;
	}
	
	public String getType() {
		return type;
	}

}
