package com.clozanoga.financeapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clozanoga.financeapp.dtos.coinmarketcap.MarketDataDTO;

@Service
public class MarketService {

	private CoinmarketcapService coinmarketcapService;
		
	@Autowired
	public MarketService(CoinmarketcapService coinmarketcapService) {
		this.coinmarketcapService = coinmarketcapService;
	}
	
	public Iterable<MarketDataDTO> findMarketWatch() {
		List<MarketDataDTO> l = new ArrayList<>();
		
		l.add(coinmarketcapService.getMarketData("BTC", "EUR"));		
		
		return l;
	}
	
}
