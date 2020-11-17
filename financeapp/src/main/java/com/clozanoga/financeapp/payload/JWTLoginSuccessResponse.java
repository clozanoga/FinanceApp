package com.clozanoga.financeapp.payload;

public class JWTLoginSuccessResponse {
	
	private Boolean success;
	private String token;
	
	public JWTLoginSuccessResponse(Boolean success, String token) {
		this.success = success;
		this.token = token;
	}
	
	public Boolean isSuccess() {
		return success;
	}
	
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}	
	
	@Override
	public String toString() {
		return "JWTLoginSuccessReponse{" + 
				"success=" + this.success +
				", token='" + this.token + "'" + 
				"}";
	}

}
