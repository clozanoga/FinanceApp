package com.clozanoga.financeapp.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "crypto-transactions")
public class CryptoTransaction {
	
	@Transient
	public static final String SEQUENCE_NAME = "cryptoTx_sequence";
	
	@Id
	private Long id;
	
	private String description;
	private Long portfolioId;
	private Long originAssetId;
	private Long destinationAssetId;
	private Date date;
	private String type;
	private BigDecimal price;
	private BigDecimal amount;
	private BigDecimal exchangeFee;
	private BigDecimal blockchainFee;
	
	public CryptoTransaction() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getPortfolioId() {
		return portfolioId;
	}
	public void setPortfolioId(Long portfolioId) {
		this.portfolioId = portfolioId;
	}
	public Long getOriginAssetId() {
		return originAssetId;
	}
	public void setOriginAssetId(Long originAssetId) {
		this.originAssetId = originAssetId;
	}
	public Long getDestinationAssetId() {
		return destinationAssetId;
	}
	public void setDestinationAssetId(Long destinationAssetId) {
		this.destinationAssetId = destinationAssetId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getExchangeFee() {
		return exchangeFee;
	}
	public void setExchangeFee(BigDecimal exchangeFee) {
		this.exchangeFee = exchangeFee;
	}
	public BigDecimal getBlockchainFee() {
		return blockchainFee;
	}
	public void setBlockchainFee(BigDecimal blockchainFee) {
		this.blockchainFee = blockchainFee;
	}
	
}
