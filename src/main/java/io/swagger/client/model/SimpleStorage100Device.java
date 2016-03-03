package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class SimpleStorage100Device   {
  
  private String name = null;
  private ResourceOem oem = null;
  private ResourceStatus status = null;

  
  @ApiModelProperty(example = "null", required = true, value = "The name of the resource or array element.")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  
  /**
   **/
  public SimpleStorage100Device oem(ResourceOem oem) {
    this.oem = oem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Oem")
  public ResourceOem getOem() {
    return oem;
  }
  public void setOem(ResourceOem oem) {
    this.oem = oem;
  }

  
  /**
   **/
  public SimpleStorage100Device status(ResourceStatus status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Status")
  public ResourceStatus getStatus() {
    return status;
  }
  public void setStatus(ResourceStatus status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleStorage100Device simpleStorage100Device = (SimpleStorage100Device) o;
    return Objects.equals(this.name, simpleStorage100Device.name) &&
        Objects.equals(this.oem, simpleStorage100Device.oem) &&
        Objects.equals(this.status, simpleStorage100Device.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, oem, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleStorage100Device {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

