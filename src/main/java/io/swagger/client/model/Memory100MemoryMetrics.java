package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;


/**
 * This is the schema definition for the memory metrics.  It represents the properties of a memory attached to a System.
 **/

@ApiModel(description = "This is the schema definition for the memory metrics.  It represents the properties of a memory attached to a System.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Memory100MemoryMetrics {

  private String id = null;
  private String name = null;
  private BigDecimal blockSizeBytes = null;

  private MemoryMetricsHealthData healthData = null;

  @ApiModelProperty(value = "Id")
  @JsonProperty("Id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  @ApiModelProperty(value = "Name")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @ApiModelProperty(value = "BlockSizeBytes")
  @JsonProperty("BlockSizeBytes")
  public BigDecimal getBlockSizeBytes() {
    return blockSizeBytes;
  }
  public void setBlockSizeBytes(BigDecimal blockSizeBytes) {
    this.blockSizeBytes = blockSizeBytes;
  }

  @ApiModelProperty(value = "HealthData")
  @JsonProperty("HealthData")
  public MemoryMetricsHealthData getHealthData() {
    return healthData;
  }
  public void setHealthData(MemoryMetricsHealthData healthData) {
    this.healthData = healthData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Memory100MemoryMetrics memory100MemoryMetrics = (Memory100MemoryMetrics) o;
    return Objects.equals(id, memory100MemoryMetrics.id) &&
            Objects.equals(name, memory100MemoryMetrics.name) &&
            Objects.equals(blockSizeBytes, memory100MemoryMetrics.blockSizeBytes) &&
            Objects.equals(healthData, memory100MemoryMetrics.healthData)
            ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, blockSizeBytes, healthData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Memory100MemoryMetrics {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    blockSizeBytes: ").append(toIndentedString(blockSizeBytes)).append("\n");
    sb.append("    healthData: ").append(toIndentedString(healthData)).append("\n");
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

