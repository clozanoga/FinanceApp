package com.clozanoga.financeapp.deserializers;

import java.io.IOException;

import com.clozanoga.financeapp.enums.TypeOperation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

public class TypeOperationDeserializer extends JsonDeserializer<TypeOperation> {

	@Override
	public TypeOperation deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
		JsonNode rootNode = p.getCodec().readTree(p);
		String type = rootNode.asText();
		
		return TypeOperation.nameOf(type);
	}
}
