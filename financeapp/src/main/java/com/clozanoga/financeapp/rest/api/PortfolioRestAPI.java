package com.clozanoga.financeapp.rest.api;

import java.security.Principal;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;


import com.clozanoga.financeapp.dtos.PortfolioDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Portfolio rest controller", description="Service to manage portfolios")
@RequestMapping("/api/v1/portfolio")
@CrossOrigin
public interface PortfolioRestAPI {
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(description = "Create portfolio", summary = "Create a new portfolio")
	ResponseEntity<PortfolioDTO> createNewPortfolio(@RequestBody PortfolioDTO portfolio, Principal principal);

	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(description = "Get portfolio", summary = "Get portfolio info")
	ResponseEntity<PortfolioDTO> getPortfolio(@PathVariable("id") @Parameter(description = "Portfolio ID", required = true, in = ParameterIn.PATH) Long portfolioId);
	
}
