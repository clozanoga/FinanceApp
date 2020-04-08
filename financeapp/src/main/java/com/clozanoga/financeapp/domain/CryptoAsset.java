package com.clozanoga.financeapp.domain;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "crypto-asset")
public class CryptoAsset {
	
	@Transient
	public static final String SEQUENCE_NAME = "cryptoAsset_sequence";
	
	@Id
	private Long id;
	
	private Long marketId;
	private BigDecimal lastPrice;
	
	public Long getMarketId() {
		return marketId;
	}
	public void setMarketId(Long marketId) {
		this.marketId = marketId;
	}
	public BigDecimal getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(BigDecimal lastPrice) {
		this.lastPrice = lastPrice;
	}

}
