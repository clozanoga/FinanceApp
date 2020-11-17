package com.clozanoga.financeapp.manager;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clozanoga.financeapp.domain.Portfolio;
import com.clozanoga.financeapp.repositories.PortfolioRepository;

@Service
public class PortfolioService {

	private PortfolioRepository portfolioRepository;
	private SequenceGeneratorService sequenceGeneratorService;
	
	@Autowired
	public PortfolioService(PortfolioRepository portfolioRepository, SequenceGeneratorService sequenceGeneratorService) {
		this.portfolioRepository = portfolioRepository;
		this.sequenceGeneratorService = sequenceGeneratorService;
	}
	
	public Portfolio saveOrUpdatePortfolio(Portfolio portfolio) {
//		portfolio.setId(sequenceGeneratorService.generateSequence("portfolios_sequence"));
		portfolio.setCreatedAt(LocalDate.now());
		return portfolioRepository.save(portfolio);
	}
	
	public Portfolio getPortfolioById(Long id) {
		Optional<Portfolio> opPortfolio = portfolioRepository.findById(id);
		
		if (!opPortfolio.isPresent()) {
			return null;
		}
		
		return opPortfolio.get();
	}
	
}
