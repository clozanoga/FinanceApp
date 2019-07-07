
package com.clozanoga.financeapp.domain.coinmarketcap;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "symbol",
    "slug",
    "circulating_supply",
    "total_supply",
    "max_supply",
    "date_added",
    "num_market_pairs",
    "tags",
    "platform",
    "cmc_rank",
    "last_updated",
    "quote"
})
public class BTC {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("circulating_supply")
    private Integer circulatingSupply;
    @JsonProperty("total_supply")
    private Integer totalSupply;
    @JsonProperty("max_supply")
    private Integer maxSupply;
    @JsonProperty("date_added")
    private String dateAdded;
    @JsonProperty("num_market_pairs")
    private Integer numMarketPairs;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("platform")
    private Object platform;
    @JsonProperty("cmc_rank")
    private Integer cmcRank;
    @JsonProperty("last_updated")
    private String lastUpdated;
    @JsonProperty("quote")
    private Quote quote;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("circulating_supply")
    public Integer getCirculatingSupply() {
        return circulatingSupply;
    }

    @JsonProperty("circulating_supply")
    public void setCirculatingSupply(Integer circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    @JsonProperty("total_supply")
    public Integer getTotalSupply() {
        return totalSupply;
    }

    @JsonProperty("total_supply")
    public void setTotalSupply(Integer totalSupply) {
        this.totalSupply = totalSupply;
    }

    @JsonProperty("max_supply")
    public Integer getMaxSupply() {
        return maxSupply;
    }

    @JsonProperty("max_supply")
    public void setMaxSupply(Integer maxSupply) {
        this.maxSupply = maxSupply;
    }

    @JsonProperty("date_added")
    public String getDateAdded() {
        return dateAdded;
    }

    @JsonProperty("date_added")
    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    @JsonProperty("num_market_pairs")
    public Integer getNumMarketPairs() {
        return numMarketPairs;
    }

    @JsonProperty("num_market_pairs")
    public void setNumMarketPairs(Integer numMarketPairs) {
        this.numMarketPairs = numMarketPairs;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("platform")
    public Object getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    @JsonProperty("cmc_rank")
    public Integer getCmcRank() {
        return cmcRank;
    }

    @JsonProperty("cmc_rank")
    public void setCmcRank(Integer cmcRank) {
        this.cmcRank = cmcRank;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    @JsonProperty("last_updated")
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @JsonProperty("quote")
    public Quote getQuote() {
        return quote;
    }

    @JsonProperty("quote")
    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("symbol", symbol).append("slug", slug).append("circulatingSupply", circulatingSupply).append("totalSupply", totalSupply).append("maxSupply", maxSupply).append("dateAdded", dateAdded).append("numMarketPairs", numMarketPairs).append("tags", tags).append("platform", platform).append("cmcRank", cmcRank).append("lastUpdated", lastUpdated).append("quote", quote).toString();
    }

}
