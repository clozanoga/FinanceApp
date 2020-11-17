package com.clozanoga.financeapp.rest.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.clozanoga.financeapp.dtos.UserDTO;
import com.clozanoga.financeapp.payload.JWTLoginSuccessResponse;
import com.clozanoga.financeapp.payload.LoginRequest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;

@RequestMapping("/api/v1/users")
@Validated
public interface UserRestAPI {
	
	@PostMapping("/login")
	ResponseEntity<JWTLoginSuccessResponse> authenticateUser(@Valid @RequestBody LoginRequest loginRequest);

	@PostMapping("/register")
	ResponseEntity<UserDTO> registerUser(@Valid @RequestBody UserDTO userDTO, BindingResult result);
	
//	@GetMapping("/{id}")
//	@ResponseStatus(HttpStatus.OK)
//	@Operation(description = "Get user", summary = "Get user data")
//	ResponseEntity<UserDTO> getUser(@PathVariable("id") @Parameter(description = "User ID", required = true, in = ParameterIn.PATH) Long userId);
}
