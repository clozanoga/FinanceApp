
package com.clozanoga.financeapp.domain.coinmarketcap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "error_code",
    "error_message",
    "elapsed",
    "credit_count"
})
public class Status {

    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("error_code")
    private Integer errorCode;
    @JsonProperty("error_message")
    private Object errorMessage;
    @JsonProperty("elapsed")
    private Integer elapsed;
    @JsonProperty("credit_count")
    private Integer creditCount;

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("error_code")
    public Integer getErrorCode() {
        return errorCode;
    }

    @JsonProperty("error_code")
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("error_message")
    public Object getErrorMessage() {
        return errorMessage;
    }

    @JsonProperty("error_message")
    public void setErrorMessage(Object errorMessage) {
        this.errorMessage = errorMessage;
    }

    @JsonProperty("elapsed")
    public Integer getElapsed() {
        return elapsed;
    }

    @JsonProperty("elapsed")
    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    @JsonProperty("credit_count")
    public Integer getCreditCount() {
        return creditCount;
    }

    @JsonProperty("credit_count")
    public void setCreditCount(Integer creditCount) {
        this.creditCount = creditCount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timestamp", timestamp).append("errorCode", errorCode).append("errorMessage", errorMessage).append("elapsed", elapsed).append("creditCount", creditCount).toString();
    }

}
