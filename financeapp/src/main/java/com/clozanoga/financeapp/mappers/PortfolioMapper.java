package com.clozanoga.financeapp.mappers;

import org.mapstruct.Mapper;

import com.clozanoga.financeapp.domain.Portfolio;
import com.clozanoga.financeapp.dtos.PortfolioDTO;

@Mapper(componentModel = "spring")
public interface PortfolioMapper {
	
	PortfolioDTO portfolioToPortfolioDTO(Portfolio portfolio);
	Portfolio portfolioDTOToPortfolio(PortfolioDTO portfolioDTO);

}
