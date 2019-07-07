package com.clozanoga.financeapp.domain.coinexchange;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"MarketID",
"LastPrice",
"Change",
"HighPrice",
"LowPrice",
"Volume",
"BTCVolume",
"TradeCount",
"BidPrice",
"AskPrice",
"BuyOrderCount",
"SellOrderCount"
})
public class Result {
	
	@JsonProperty("MarketID")
	private String marketID;
	@JsonProperty("LastPrice")
	private String lastPrice;
	@JsonProperty("Change")
	private String change;
	@JsonProperty("HighPrice")
	private String highPrice;
	@JsonProperty("LowPrice")
	private String lowPrice;
	@JsonProperty("Volume")
	private String volume;
	@JsonProperty("BTCVolume")
	private String bTCVolume;
	@JsonProperty("TradeCount")
	private String tradeCount;
	@JsonProperty("BidPrice")
	private String bidPrice;
	@JsonProperty("AskPrice")
	private String askPrice;
	@JsonProperty("BuyOrderCount")
	private String buyOrderCount;
	@JsonProperty("SellOrderCount")
	private String sellOrderCount;

	@JsonProperty("MarketID")
	public String getMarketID() {
	return marketID;
	}

	@JsonProperty("MarketID")
	public void setMarketID(String marketID) {
	this.marketID = marketID;
	}

	@JsonProperty("LastPrice")
	public String getLastPrice() {
	return lastPrice;
	}

	@JsonProperty("LastPrice")
	public void setLastPrice(String lastPrice) {
	this.lastPrice = lastPrice;
	}

	@JsonProperty("Change")
	public String getChange() {
	return change;
	}

	@JsonProperty("Change")
	public void setChange(String change) {
	this.change = change;
	}

	@JsonProperty("HighPrice")
	public String getHighPrice() {
	return highPrice;
	}

	@JsonProperty("HighPrice")
	public void setHighPrice(String highPrice) {
	this.highPrice = highPrice;
	}

	@JsonProperty("LowPrice")
	public String getLowPrice() {
	return lowPrice;
	}

	@JsonProperty("LowPrice")
	public void setLowPrice(String lowPrice) {
	this.lowPrice = lowPrice;
	}

	@JsonProperty("Volume")
	public String getVolume() {
	return volume;
	}

	@JsonProperty("Volume")
	public void setVolume(String volume) {
	this.volume = volume;
	}

	@JsonProperty("BTCVolume")
	public String getBTCVolume() {
	return bTCVolume;
	}

	@JsonProperty("BTCVolume")
	public void setBTCVolume(String bTCVolume) {
	this.bTCVolume = bTCVolume;
	}

	@JsonProperty("TradeCount")
	public String getTradeCount() {
	return tradeCount;
	}

	@JsonProperty("TradeCount")
	public void setTradeCount(String tradeCount) {
	this.tradeCount = tradeCount;
	}

	@JsonProperty("BidPrice")
	public String getBidPrice() {
	return bidPrice;
	}

	@JsonProperty("BidPrice")
	public void setBidPrice(String bidPrice) {
	this.bidPrice = bidPrice;
	}

	@JsonProperty("AskPrice")
	public String getAskPrice() {
	return askPrice;
	}

	@JsonProperty("AskPrice")
	public void setAskPrice(String askPrice) {
	this.askPrice = askPrice;
	}

	@JsonProperty("BuyOrderCount")
	public String getBuyOrderCount() {
	return buyOrderCount;
	}

	@JsonProperty("BuyOrderCount")
	public void setBuyOrderCount(String buyOrderCount) {
	this.buyOrderCount = buyOrderCount;
	}

	@JsonProperty("SellOrderCount")
	public String getSellOrderCount() {
	return sellOrderCount;
	}

	@JsonProperty("SellOrderCount")
	public void setSellOrderCount(String sellOrderCount) {
	this.sellOrderCount = sellOrderCount;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("marketID", marketID).append("lastPrice", lastPrice).append("change", change).append("highPrice", highPrice).append("lowPrice", lowPrice).append("volume", volume).append("bTCVolume", bTCVolume).append("tradeCount", tradeCount).append("bidPrice", bidPrice).append("askPrice", askPrice).append("buyOrderCount", buyOrderCount).append("sellOrderCount", sellOrderCount).toString();
	}
}
