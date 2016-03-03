package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ComputerSystem100Reset;



/**
 * The Actions object contains the available custom actions on this resource.
 **/

@ApiModel(description = "The Actions object contains the available custom actions on this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ComputerSystem100ComputerSystemActions   {
  
  private Object oem = null;
  private ComputerSystem100Reset computerSystemReset = null;

  
  /**
   **/
  public ComputerSystem100ComputerSystemActions oem(Object oem) {
    this.oem = oem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Oem")
  public Object getOem() {
    return oem;
  }
  public void setOem(Object oem) {
    this.oem = oem;
  }

  
  /**
   **/
  public ComputerSystem100ComputerSystemActions computerSystemReset(ComputerSystem100Reset computerSystemReset) {
    this.computerSystemReset = computerSystemReset;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("#ComputerSystem.Reset")
  public ComputerSystem100Reset getComputerSystemReset() {
    return computerSystemReset;
  }
  public void setComputerSystemReset(ComputerSystem100Reset computerSystemReset) {
    this.computerSystemReset = computerSystemReset;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerSystem100ComputerSystemActions computerSystem100ComputerSystemActions = (ComputerSystem100ComputerSystemActions) o;
    return Objects.equals(this.oem, computerSystem100ComputerSystemActions.oem) &&
        Objects.equals(this.computerSystemReset, computerSystem100ComputerSystemActions.computerSystemReset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oem, computerSystemReset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerSystem100ComputerSystemActions {\n");
    
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    computerSystemReset: ").append(toIndentedString(computerSystemReset)).append("\n");
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

