
package com.clozanoga.financeapp.domain.coinmarketcap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "price",
    "volume_24h",
    "percent_change_1h",
    "percent_change_24h",
    "percent_change_7d",
    "market_cap",
    "last_updated"
})
public class EUR {

    @JsonProperty("price")
    private Double price;
    @JsonProperty("volume_24h")
    private Double volume24h;
    @JsonProperty("percent_change_1h")
    private Double percentChange1h;
    @JsonProperty("percent_change_24h")
    private Double percentChange24h;
    @JsonProperty("percent_change_7d")
    private Double percentChange7d;
    @JsonProperty("market_cap")
    private Double marketCap;
    @JsonProperty("last_updated")
    private String lastUpdated;

    @JsonProperty("price")
    public Double getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonProperty("volume_24h")
    public Double getVolume24h() {
        return volume24h;
    }

    @JsonProperty("volume_24h")
    public void setVolume24h(Double volume24h) {
        this.volume24h = volume24h;
    }

    @JsonProperty("percent_change_1h")
    public Double getPercentChange1h() {
        return percentChange1h;
    }

    @JsonProperty("percent_change_1h")
    public void setPercentChange1h(Double percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    @JsonProperty("percent_change_24h")
    public Double getPercentChange24h() {
        return percentChange24h;
    }

    @JsonProperty("percent_change_24h")
    public void setPercentChange24h(Double percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    @JsonProperty("percent_change_7d")
    public Double getPercentChange7d() {
        return percentChange7d;
    }

    @JsonProperty("percent_change_7d")
    public void setPercentChange7d(Double percentChange7d) {
        this.percentChange7d = percentChange7d;
    }

    @JsonProperty("market_cap")
    public Double getMarketCap() {
        return marketCap;
    }

    @JsonProperty("market_cap")
    public void setMarketCap(Double marketCap) {
        this.marketCap = marketCap;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("price", price).append("volume24h", volume24h).append("percentChange1h", percentChange1h).append("percentChange24h", percentChange24h).append("percentChange7d", percentChange7d).append("marketCap", marketCap).append("lastUpdated", lastUpdated).toString();
    }

}
