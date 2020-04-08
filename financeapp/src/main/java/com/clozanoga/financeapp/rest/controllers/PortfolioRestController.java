package com.clozanoga.financeapp.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.clozanoga.financeapp.domain.Portfolio;
import com.clozanoga.financeapp.dtos.PortfolioDTO;
import com.clozanoga.financeapp.manager.PortfolioService;
import com.clozanoga.financeapp.mappers.PortfolioMapper;
import com.clozanoga.financeapp.rest.api.PortfolioRestAPI;

@RestController
public class PortfolioRestController implements PortfolioRestAPI {
	
	private PortfolioService portfolioService;
	private PortfolioMapper portfolioMapper;
	
	@Autowired
	public PortfolioRestController(PortfolioService portfolioService, PortfolioMapper portfolioMapper) {
		this.portfolioService = portfolioService;
		this.portfolioMapper = portfolioMapper;
	}
	
	public ResponseEntity<PortfolioDTO> createNewPortfolio(PortfolioDTO portfolioDTO){		
		Portfolio portfolioSaved = portfolioService.saveOrUpdatePortfolio(portfolioMapper.portfolioDTOToPortfolio(portfolioDTO));		
		return new ResponseEntity<PortfolioDTO>(portfolioMapper.portfolioToPortfolioDTO(portfolioSaved), HttpStatus.CREATED);
	}
	
	public ResponseEntity<PortfolioDTO> getPortfolio(Long portfolioId) {
		Portfolio portfolio = portfolioService.getPortfolioById(portfolioId);
		
		return new ResponseEntity<PortfolioDTO>(portfolioMapper.portfolioToPortfolioDTO(portfolio), HttpStatus.OK);
	}

}
