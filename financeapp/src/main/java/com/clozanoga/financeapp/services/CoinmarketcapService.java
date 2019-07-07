package com.clozanoga.financeapp.services;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.clozanoga.financeapp.domain.coinmarketcap.MarketData;
import com.clozanoga.financeapp.dtos.coinmarketcap.MarketDataDTO;

@Service
public class CoinmarketcapService {

	private static final String apiKey = "2d7dbec1-0aa2-4d6e-82ad-8a5e20ca1138";
	
	private RestTemplate restTemplate;
	
	@Autowired
	public CoinmarketcapService(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}
	
	public MarketDataDTO getMarketData(String symbol, String fiatCurrency) {		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.add("X-CMC_PRO_API_KEY", apiKey);

		HttpEntity<String> entity = new HttpEntity<>("body", headers);

		ResponseEntity<MarketData> response = restTemplate.exchange(
				"https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest?symbol="+symbol+"&convert="+fiatCurrency, 
				HttpMethod.GET, entity, MarketData.class);
		
		return mapEntityToDto(response.getBody());
	}
	
	private MarketDataDTO mapEntityToDto(MarketData marketData) {
		MarketDataDTO marketDataDto = new MarketDataDTO();
		marketDataDto.setSymbol(marketData.getData().getBTC().getSymbol());
		BigDecimal price = new BigDecimal(marketData.getData().getBTC().getQuote().getEUR().getPrice());
		marketDataDto.setPrice(price.setScale(2, BigDecimal.ROUND_HALF_UP));
		marketDataDto.setFiatCurrency(marketData.getData().getBTC().getQuote().getEUR().getClass().getSimpleName());
		marketDataDto.setTimestamp(ZonedDateTime.parse(marketData.getData().getBTC().getLastUpdated()));
		
		return marketDataDto;
	}
	
}
