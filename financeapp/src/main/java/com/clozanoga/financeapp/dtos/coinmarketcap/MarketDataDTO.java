package com.clozanoga.financeapp.dtos.coinmarketcap;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class MarketDataDTO {

	private String symbol;
	private BigDecimal price;
	private String fiatCurrency;
	private ZonedDateTime timestamp;
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getFiatCurrency() {
		return fiatCurrency;
	}
	public void setFiatCurrency(String fiatCurrency) {
		this.fiatCurrency = fiatCurrency;
	}
	public ZonedDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(ZonedDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
}
