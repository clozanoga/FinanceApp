package com.clozanoga.financeapp.rest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clozanoga.financeapp.domain.User;
import com.clozanoga.financeapp.dtos.UserDTO;
import com.clozanoga.financeapp.manager.MapValidationErrorService;
import com.clozanoga.financeapp.manager.impl.UserServiceImpl;
import com.clozanoga.financeapp.mappers.UserMapper;
import com.clozanoga.financeapp.payload.JWTLoginSuccessResponse;
import com.clozanoga.financeapp.payload.LoginRequest;
import com.clozanoga.financeapp.rest.api.UserRestAPI;
import com.clozanoga.financeapp.security.JwtTokenProvider;
import com.clozanoga.financeapp.validators.UserDTOValidator;

import static com.clozanoga.financeapp.constants.SecurityConstants.TOKEN_PREFIX;

@RestController
public class UserRestController implements UserRestAPI {

	private UserServiceImpl userServiceImpl;
	private UserMapper userMapper;
	private UserDTOValidator userDTOValidator;
	private JwtTokenProvider tokenProvider;
	private AuthenticationManager authenticationManager;
		
	@Autowired
	public UserRestController(UserServiceImpl userServiceImpl, UserMapper userMapper, 
			UserDTOValidator userDTOValidator, JwtTokenProvider tokenProvider, AuthenticationManager authenticationManager) {
		this.userServiceImpl = userServiceImpl;		
		this.userMapper = userMapper;
		this.userDTOValidator = userDTOValidator;
		this.tokenProvider = tokenProvider;
		this.authenticationManager = authenticationManager;
	}
	
	@Override
	public ResponseEntity<JWTLoginSuccessResponse> authenticateUser(LoginRequest loginRequest) {
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
		
		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = TOKEN_PREFIX + tokenProvider.generateToken(authentication);
		
		return new ResponseEntity<JWTLoginSuccessResponse>(new JWTLoginSuccessResponse(true, jwt), HttpStatus.OK);
	}
	
	@Override
	public ResponseEntity<UserDTO> registerUser(UserDTO userDTO, BindingResult result) {
		userDTOValidator.validate(userDTO, result);
		
//		ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
//        if(errorMap != null) return errorMap;
        
        Map<String, String> errorMap = new HashMap<>();
		
		for(FieldError error: result.getFieldErrors()) {
			errorMap.put(error.getField(), error.getDefaultMessage());
		}
		if (result.hasErrors()) {
			return new ResponseEntity(errorMap, HttpStatus.BAD_REQUEST);
		}
		
		User newUser = userServiceImpl.saveUser(userMapper.userDTOToUser(userDTO));
		return new ResponseEntity<UserDTO>(userMapper.userToUserDTO(newUser), HttpStatus.CREATED);
	}
	
//	@Override
//	public ResponseEntity<UserDTO> getUser(Long userId) {
//		User user = userServiceImpl.getUser(userId);
//		return new ResponseEntity<UserDTO>(userMapper.userToUserDTO(user), HttpStatus.OK);
//	}
	
	
}
