package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;


/**
 * This is the schema definition for the Processor metrics.  It represents the properties of a processor attached to a System.
 **/

@ApiModel(description = "This is the schema definition for the Processor metrics.  It represents the properties of a processor attached to a System.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Processor100ProcessorMetrics {
  
  private BigDecimal kernelPercent = null;
  private BigDecimal userPercent = null;

  @ApiModelProperty(value = "KernelPercent")
  @JsonProperty("KernelPercent")
  public BigDecimal getKernelPercent() {
    return kernelPercent;
  }
  public void setKernelPercent(BigDecimal kernelPercent) {
    this.kernelPercent = kernelPercent;
  }

  @ApiModelProperty(value = "UserPercent")
  @JsonProperty("UserPercent")
  public BigDecimal getUserPercent() {
    return userPercent;
  }
  public void setUserPercent(BigDecimal userPercent) {
    this.userPercent = userPercent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Processor100ProcessorMetrics processor100Processor = (Processor100ProcessorMetrics) o;
    return Objects.equals(kernelPercent, processor100Processor.kernelPercent) &&
        Objects.equals(userPercent, processor100Processor.userPercent)
            ;

  }

  @Override
  public int hashCode() {
    return Objects.hash(kernelPercent, userPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Processor100ProcessorMetircs {\n");
    
    sb.append("    kernelPercent: ").append(toIndentedString(kernelPercent)).append("\n");
    sb.append("    userPercent: ").append(toIndentedString(userPercent)).append("\n");
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

