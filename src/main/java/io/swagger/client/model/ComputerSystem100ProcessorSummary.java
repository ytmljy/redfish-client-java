package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceStatus;
import java.math.BigDecimal;



/**
 * This object describes the central processors of the system in general detail.
 **/

@ApiModel(description = "This object describes the central processors of the system in general detail.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ComputerSystem100ProcessorSummary   {
  
  private BigDecimal count = null;
  private String model = null;
  private ResourceStatus status = null;

  
  /**
   * The number of processors in the system.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The number of processors in the system.")
  @JsonProperty("Count")
  public BigDecimal getCount() {
    return count;
  }
  public void setCount(BigDecimal count) {
    this.count = count;
  }

  
  /**
   * The processor model for the primary or majority of processors in this system.
   **/
  
  @ApiModelProperty(value = "The processor model for the primary or majority of processors in this system.")
  @JsonProperty("Model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Status")
  public ResourceStatus getStatus() {
    return status;
  }
  public void setStatus(ResourceStatus status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerSystem100ProcessorSummary computerSystem100ProcessorSummary = (ComputerSystem100ProcessorSummary) o;
    return Objects.equals(count, computerSystem100ProcessorSummary.count) &&
        Objects.equals(model, computerSystem100ProcessorSummary.model) &&
        Objects.equals(status, computerSystem100ProcessorSummary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, model, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerSystem100ProcessorSummary {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

