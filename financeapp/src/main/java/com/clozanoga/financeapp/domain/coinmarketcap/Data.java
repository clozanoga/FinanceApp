
package com.clozanoga.financeapp.domain.coinmarketcap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BTC"
})
public class Data {

    @JsonProperty("BTC")
    private BTC bTC;

    @JsonProperty("BTC")
    public BTC getBTC() {
        return bTC;
    }

    @JsonProperty("BTC")
    public void setBTC(BTC bTC) {
        this.bTC = bTC;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bTC", bTC).toString();
    }

}
