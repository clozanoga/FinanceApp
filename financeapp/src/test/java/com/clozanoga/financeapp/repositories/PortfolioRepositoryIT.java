package com.clozanoga.financeapp.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.clozanoga.financeapp.domain.Portfolio;

@RunWith(SpringRunner.class)
public class PortfolioRepositoryIT {
	
	@Autowired
	private PortfolioRepository portfolioRepository;
	
	@Before
	public void setUp() throws Exception {
		Portfolio portfolio1 = new Portfolio();
//		portfolio1.setId(99999999L);
		portfolio1.setName("test portfolio");
		
		portfolio1 = portfolioRepository.save(portfolio1);
	}
	
	@Test
	public void getPortfolio_Test() {
		Optional<Portfolio> opPortfolioA = portfolioRepository.findById(99999999L);
		Portfolio portfolioA = null;
		if (opPortfolioA.isPresent()) {
			portfolioA = opPortfolioA.get();
		}
			
		assertNotNull(portfolioA);
		assertEquals("test portfolio", portfolioA.getName());
	}
	
	@After
	public void tearDown() {
		portfolioRepository.deleteAll();
	}

}
