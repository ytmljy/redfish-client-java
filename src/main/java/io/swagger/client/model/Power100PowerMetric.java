package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Power100PowerMetric   {
  
  private BigDecimal averageConsumedWatts = null;
  private BigDecimal intervalInMin = null;
  private BigDecimal maxConsumedWatts = null;
  private BigDecimal minConsumedWatts = null;

  
  /**
   * The average power level over the measurement window (the last IntervalInMin minutes).
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The average power level over the measurement window (the last IntervalInMin minutes).")
  @JsonProperty("AverageConsumedWatts")
  public BigDecimal getAverageConsumedWatts() {
    return averageConsumedWatts;
  }
  public void setAverageConsumedWatts(BigDecimal averageConsumedWatts) {
    this.averageConsumedWatts = averageConsumedWatts;
  }

  
  /**
   * The time interval (or window) in which the PowerMetrics are measured over.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The time interval (or window) in which the PowerMetrics are measured over.")
  @JsonProperty("IntervalInMin")
  public BigDecimal getIntervalInMin() {
    return intervalInMin;
  }
  public void setIntervalInMin(BigDecimal intervalInMin) {
    this.intervalInMin = intervalInMin;
  }

  
  /**
   * The highest power consumption level that has occured over the measurement window (the last IntervalInMin minutes).
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The highest power consumption level that has occured over the measurement window (the last IntervalInMin minutes).")
  @JsonProperty("MaxConsumedWatts")
  public BigDecimal getMaxConsumedWatts() {
    return maxConsumedWatts;
  }
  public void setMaxConsumedWatts(BigDecimal maxConsumedWatts) {
    this.maxConsumedWatts = maxConsumedWatts;
  }

  
  /**
   * The lowest power consumption level over the measurement window (the last IntervalInMin minutes).
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The lowest power consumption level over the measurement window (the last IntervalInMin minutes).")
  @JsonProperty("MinConsumedWatts")
  public BigDecimal getMinConsumedWatts() {
    return minConsumedWatts;
  }
  public void setMinConsumedWatts(BigDecimal minConsumedWatts) {
    this.minConsumedWatts = minConsumedWatts;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Power100PowerMetric power100PowerMetric = (Power100PowerMetric) o;
    return Objects.equals(averageConsumedWatts, power100PowerMetric.averageConsumedWatts) &&
        Objects.equals(intervalInMin, power100PowerMetric.intervalInMin) &&
        Objects.equals(maxConsumedWatts, power100PowerMetric.maxConsumedWatts) &&
        Objects.equals(minConsumedWatts, power100PowerMetric.minConsumedWatts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageConsumedWatts, intervalInMin, maxConsumedWatts, minConsumedWatts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Power100PowerMetric {\n");
    
    sb.append("    averageConsumedWatts: ").append(toIndentedString(averageConsumedWatts)).append("\n");
    sb.append("    intervalInMin: ").append(toIndentedString(intervalInMin)).append("\n");
    sb.append("    maxConsumedWatts: ").append(toIndentedString(maxConsumedWatts)).append("\n");
    sb.append("    minConsumedWatts: ").append(toIndentedString(minConsumedWatts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

