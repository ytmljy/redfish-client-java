package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Objects;


/**
 * This is the schema definition for the Memory resource.  It represents the properties of a Memory attached to a System.
 **/

@ApiModel(description = "This is the schema definition for the Memory resource.  It represents the properties of a Memory attached to a System.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Memory100Memory {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private String id = null;

  private Odata400IdRef metrics = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.context")
  public String getOdataContext() {
    return odataContext;
  }
  public void setOdataContext(String odataContext) {
    this.odataContext = odataContext;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.id")
  public String getOdataId() {
    return odataId;
  }
  public void setOdataId(String odataId) {
    this.odataId = odataId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.type")
  public String getOdataType() {
    return odataType;
  }
  public void setOdataType(String odataType) {
    this.odataType = odataType;
  }

  
  /**
   * Provides a description of this resource and is used for commonality  in the schema definitions.
   **/
  
  @ApiModelProperty(value = "Provides a description of this resource and is used for commonality  in the schema definitions.")
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Uniquely identifies the resource within the collection of like resources.
   **/
  
  @ApiModelProperty(value = "Uniquely identifies the resource within the collection of like resources.")
  @JsonProperty("Id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  @ApiModelProperty(value = "The metrics of Memory")
  @JsonProperty("Metrics")
  public Odata400IdRef getMetrics() {
    return metrics;
  }
  public void setMetrics(Odata400IdRef metrics) {
    this.metrics = metrics;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Memory100Memory Memory100Memory = (Memory100Memory) o;
    return Objects.equals(odataContext, Memory100Memory.odataContext) &&
        Objects.equals(odataId, Memory100Memory.odataId) &&
        Objects.equals(odataType, Memory100Memory.odataType) &&
        Objects.equals(description, Memory100Memory.description) &&
        Objects.equals(id, Memory100Memory.id) &&
        Objects.equals(metrics, Memory100Memory.metrics)
            ;

  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, id, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Memory100Memory {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

