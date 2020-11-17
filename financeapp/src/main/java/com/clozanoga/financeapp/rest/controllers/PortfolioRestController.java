package com.clozanoga.financeapp.rest.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.clozanoga.financeapp.domain.Portfolio;
import com.clozanoga.financeapp.domain.User;
import com.clozanoga.financeapp.dtos.PortfolioDTO;
import com.clozanoga.financeapp.manager.PortfolioService;
import com.clozanoga.financeapp.manager.UserService;
import com.clozanoga.financeapp.manager.impl.UserServiceImpl;
import com.clozanoga.financeapp.mappers.PortfolioMapper;
import com.clozanoga.financeapp.rest.api.PortfolioRestAPI;

@RestController
public class PortfolioRestController implements PortfolioRestAPI {
	
	private PortfolioService portfolioService;
	private UserService userService;
	private PortfolioMapper portfolioMapper;
	
	@Autowired
	public PortfolioRestController(PortfolioService portfolioService, UserService userService, PortfolioMapper portfolioMapper) {
		this.portfolioService = portfolioService;
		this.userService = userService;
		this.portfolioMapper = portfolioMapper;
	}
	
	public ResponseEntity<PortfolioDTO> createNewPortfolio(PortfolioDTO portfolioDTO, Principal principal){
		
		User user = userService.getUser(principal.getName());
		Portfolio portfolio = portfolioMapper.portfolioDTOToPortfolio(portfolioDTO);
		
		userService.addPortfolioToUser(user, portfolio);
		
//		Portfolio portfolioSaved = portfolioService.saveOrUpdatePortfolio(portfolioMapper.portfolioDTOToPortfolio(portfolioDTO));		
		return new ResponseEntity<PortfolioDTO>(portfolioDTO, HttpStatus.CREATED);
	}
	
	public ResponseEntity<PortfolioDTO> getPortfolio(Long portfolioId) {
		Portfolio portfolio = portfolioService.getPortfolioById(portfolioId);
		
		return new ResponseEntity<PortfolioDTO>(portfolioMapper.portfolioToPortfolioDTO(portfolio), HttpStatus.OK);
	}

}
