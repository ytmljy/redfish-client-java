package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * This object contains power limit status and configuration information for the chassis.
 **/

@ApiModel(description = "This object contains power limit status and configuration information for the chassis.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Power100PowerLimit   {
  
  private BigDecimal correctionInMs = null;


  public enum LimitExceptionEnum {
    NOACTION("NoAction"),
    HARDPOWEROFF("HardPowerOff"),
    LOGEVENTONLY("LogEventOnly"),
    OEM("Oem");

    private String value;

    LimitExceptionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private LimitExceptionEnum limitException = null;
  private BigDecimal limitInWatts = null;

  
  /**
   * The time required for the limiting process to reduce power consumption to below the limit.
   **/
  
  @ApiModelProperty(value = "The time required for the limiting process to reduce power consumption to below the limit.")
  @JsonProperty("CorrectionInMs")
  public BigDecimal getCorrectionInMs() {
    return correctionInMs;
  }
  public void setCorrectionInMs(BigDecimal correctionInMs) {
    this.correctionInMs = correctionInMs;
  }

  
  /**
   * The action that is taken if the power cannot be maintained below the LimitInWatts.
   **/
  
  @ApiModelProperty(value = "The action that is taken if the power cannot be maintained below the LimitInWatts.")
  @JsonProperty("LimitException")
  public LimitExceptionEnum getLimitException() {
    return limitException;
  }
  public void setLimitException(LimitExceptionEnum limitException) {
    this.limitException = limitException;
  }

  
  /**
   * The Power limit in watts. Set to null to disable power capping.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The Power limit in watts. Set to null to disable power capping.")
  @JsonProperty("LimitInWatts")
  public BigDecimal getLimitInWatts() {
    return limitInWatts;
  }
  public void setLimitInWatts(BigDecimal limitInWatts) {
    this.limitInWatts = limitInWatts;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Power100PowerLimit power100PowerLimit = (Power100PowerLimit) o;
    return Objects.equals(correctionInMs, power100PowerLimit.correctionInMs) &&
        Objects.equals(limitException, power100PowerLimit.limitException) &&
        Objects.equals(limitInWatts, power100PowerLimit.limitInWatts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correctionInMs, limitException, limitInWatts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Power100PowerLimit {\n");
    
    sb.append("    correctionInMs: ").append(toIndentedString(correctionInMs)).append("\n");
    sb.append("    limitException: ").append(toIndentedString(limitException)).append("\n");
    sb.append("    limitInWatts: ").append(toIndentedString(limitInWatts)).append("\n");
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

