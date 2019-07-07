package com.clozanoga.financeapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clozanoga.financeapp.dtos.coinmarketcap.MarketDataDTO;
import com.clozanoga.financeapp.services.CoinmarketcapService;
import com.clozanoga.financeapp.services.MarketService;

@RestController
@CrossOrigin
@RequestMapping("/api/markets")
public class CoinmarketcapController {

	private CoinmarketcapService coinmarketcapService;
	private MarketService marketService;
	
	@Autowired
	public CoinmarketcapController(CoinmarketcapService coinmarketcapService, MarketService marketService) {
		this.coinmarketcapService = coinmarketcapService;
		this.marketService = marketService;
	}
	
	@GetMapping("/{symbol}")
	public ResponseEntity<?> getMarketDataBySymbol(@PathVariable String symbol) {
		MarketDataDTO marketDataDto = coinmarketcapService.getMarketData(symbol, "EUR");
		
		return new ResponseEntity<MarketDataDTO>(marketDataDto, HttpStatus.OK);
	}
	
	@GetMapping("/marketwatch")
	public Iterable<MarketDataDTO> getMarketWatch(){
		return marketService.findMarketWatch();
	}
	
}
