package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceResetType;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class RackHDResetAction   {
  
  private ResourceResetType resetType = null;

  
  /**
   **/
  public RackHDResetAction resetType(ResourceResetType resetType) {
    this.resetType = resetType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reset_type")
  public ResourceResetType getResetType() {
    return resetType;
  }
  public void setResetType(ResourceResetType resetType) {
    this.resetType = resetType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDResetAction rackHDResetAction = (RackHDResetAction) o;
    return Objects.equals(this.resetType, rackHDResetAction.resetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDResetAction {\n");
    
    sb.append("    resetType: ").append(toIndentedString(resetType)).append("\n");
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

