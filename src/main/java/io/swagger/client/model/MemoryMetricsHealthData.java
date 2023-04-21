package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class MemoryMetricsHealthData {
    private BigDecimal remainingSpareBlockPercentage = null;
    private boolean lastShutdownSuccess = false;
    private boolean dataLossDetected = false;
    private boolean performanceDegraded = false;

    @ApiModelProperty(value = "")
    @JsonProperty("RemainingSpareBlockPercentage")
    public BigDecimal getRemainingSpareBlockPercentage() { return remainingSpareBlockPercentage;  }
    public void setRemainingSpareBlockPercentage(BigDecimal remainingSpareBlockPercentage) {  this.remainingSpareBlockPercentage = remainingSpareBlockPercentage; }

    @ApiModelProperty(value = "")
    @JsonProperty("LastShutdownSuccess")
    public boolean getLastShutdownSuccess() { return lastShutdownSuccess;  }
    public void setLastShutdownSuccess(boolean lastShutdownSuccess) {  this.lastShutdownSuccess = lastShutdownSuccess; }

    @ApiModelProperty(value = "DataLossDetected")
    @JsonProperty("DataLossDetected")
    public boolean getDataLossDetected() { return dataLossDetected;  }
    public void setDataLossDetected(boolean dataLossDetected) {  this.dataLossDetected = dataLossDetected; }

    @ApiModelProperty(value = "PerformanceDegraded")
    @JsonProperty("PerformanceDegraded")
    public boolean getPerformanceDegraded() { return performanceDegraded;  }
    public void setPerformanceDegraded(boolean performanceDegraded) {  this.performanceDegraded = performanceDegraded; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemoryMetricsHealthData {\n");

        sb.append("    remainingSpareBlockPercentage: ").append(remainingSpareBlockPercentage).append("\n");
        sb.append("    lastShutdownSuccess: ").append(lastShutdownSuccess).append("\n");
        sb.append("    dataLossDetected: ").append(dataLossDetected).append("\n");
        sb.append("    performanceDegraded: ").append(performanceDegraded).append("\n");
        sb.append("}");
        return sb.toString();
    }

}
