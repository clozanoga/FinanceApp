package com.clozanoga.financeapp.domain.coinexchange;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"success",
"request",
"message",
"result"
})
public class Market {
	
	@JsonProperty("success")
	private String success;
	@JsonProperty("request")
	private String request;
	@JsonProperty("message")
	private String message;
	@JsonProperty("result")
	private Result result = null;

	@JsonProperty("success")
	public String getSuccess() {
	return success;
	}

	@JsonProperty("success")
	public void setSuccess(String success) {
	this.success = success;
	}

	@JsonProperty("request")
	public String getRequest() {
	return request;
	}

	@JsonProperty("request")
	public void setRequest(String request) {
	this.request = request;
	}

	@JsonProperty("message")
	public String getMessage() {
	return message;
	}

	@JsonProperty("message")
	public void setMessage(String message) {
	this.message = message;
	}

	@JsonProperty("result")
	public Result getResult() {
		return result;
	}

	@JsonProperty("result")
	public void setResult(Result result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("success", success).append("request", request).append("message", message).append("result", result).toString();
	}
	
}
