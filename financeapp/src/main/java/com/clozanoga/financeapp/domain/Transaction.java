package com.clozanoga.financeapp.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.clozanoga.financeapp.enums.TypeOperation;

@Document(collection = "transactions")
public class Transaction {
	
	@Transient
	public static final String SEQUENCE_NAME = "tx_sequence";
	
	@Id
	private Long id;
	
	@NotBlank(message = "Portfolio is required")
	private String portfolioId;
	@DBRef
	private Asset asset;
	
	private TypeOperation operationType;
	
	private LocalDateTime txDate;	
	private BigDecimal price;
	private BigDecimal amount;
	private BigDecimal marketFee;
	private BigDecimal brokerFee;
	
	
	private String description;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getPortfolioId() {
		return portfolioId;
	}


	public void setPortfolioId(String portfolioId) {
		this.portfolioId = portfolioId;
	}


	public Asset getAsset() {
		return asset;
	}


	public void setAsset(Asset asset) {
		this.asset = asset;
	}


	public TypeOperation getOperationType() {
		return operationType;
	}


	public void setOperationType(TypeOperation operationType) {
		this.operationType = operationType;
	}


	public LocalDateTime getTxDate() {
		return txDate;
	}


	public void setTxDate(LocalDateTime txDate) {
		this.txDate = txDate;
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


	public BigDecimal getMarketFee() {
		return marketFee;
	}


	public void setMarketFee(BigDecimal marketFee) {
		this.marketFee = marketFee;
	}


	public BigDecimal getBrokerFee() {
		return brokerFee;
	}


	public void setBrokerFee(BigDecimal brokerFee) {
		this.brokerFee = brokerFee;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}	

}
