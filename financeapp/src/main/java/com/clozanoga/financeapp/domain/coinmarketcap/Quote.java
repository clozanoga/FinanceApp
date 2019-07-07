
package com.clozanoga.financeapp.domain.coinmarketcap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EUR"
})
public class Quote {

    @JsonProperty("EUR")
    private EUR eUR;

    @JsonProperty("EUR")
    public EUR getEUR() {
        return eUR;
    }

    @JsonProperty("EUR")
    public void setEUR(EUR eUR) {
        this.eUR = eUR;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eUR", eUR).toString();
    }

}
