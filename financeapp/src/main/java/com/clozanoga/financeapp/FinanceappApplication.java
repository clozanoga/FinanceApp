package com.clozanoga.financeapp;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.clozanoga.financeapp.domain.coinexchange.Market;
import com.clozanoga.financeapp.domain.coinmarketcap.MarketData;

@SpringBootApplication
public class FinanceappApplication {

	private static final Logger log = LoggerFactory.getLogger(FinanceappApplication.class);
	private static final String apiKey = "2d7dbec1-0aa2-4d6e-82ad-8a5e20ca1138";
	
	public static void main(String[] args) {
		SpringApplication.run(FinanceappApplication.class, args);
	}
	
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//	
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
////			Market response = restTemplate.getForObject(
////					"https://www.coinexchange.io/api/v1/getmarketsummary?market_id=18", Market.class);
//			
//			HttpHeaders headers = new HttpHeaders();
//			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//			headers.add("X-CMC_PRO_API_KEY", apiKey);
//
//			HttpEntity<String> entity = new HttpEntity<>("body", headers);
//
//			ResponseEntity<MarketData> response = restTemplate.exchange(
//					"https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest?symbol=BTC&convert=EUR", 
//					HttpMethod.GET, entity, MarketData.class);
//							
//			log.info(response.toString());
//		};
//	}

}
