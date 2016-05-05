package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceStatus;
import java.math.BigDecimal;



/**
 * This object describes the memory of the system in general detail.
 **/

@ApiModel(description = "This object describes the memory of the system in general detail.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ComputerSystem100MemorySummary   {
  
  private ResourceStatus status = null;
  private BigDecimal totalSystemMemoryGiB = null;

  
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

  
  /**
   * The total installed, operating system-accessible memory (RAM), measured in GiB.
   * minimum: 0.0
   **/
  
  @ApiModelProperty(value = "The total installed, operating system-accessible memory (RAM), measured in GiB.")
  @JsonProperty("TotalSystemMemoryGiB")
  public BigDecimal getTotalSystemMemoryGiB() {
    return totalSystemMemoryGiB;
  }
  public void setTotalSystemMemoryGiB(BigDecimal totalSystemMemoryGiB) {
    this.totalSystemMemoryGiB = totalSystemMemoryGiB;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerSystem100MemorySummary computerSystem100MemorySummary = (ComputerSystem100MemorySummary) o;
    return Objects.equals(status, computerSystem100MemorySummary.status) &&
        Objects.equals(totalSystemMemoryGiB, computerSystem100MemorySummary.totalSystemMemoryGiB);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, totalSystemMemoryGiB);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerSystem100MemorySummary {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalSystemMemoryGiB: ").append(toIndentedString(totalSystemMemoryGiB)).append("\n");
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

