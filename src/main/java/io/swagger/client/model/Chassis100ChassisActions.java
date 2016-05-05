package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Chassis100Reset;



/**
 * The Actions object contains the available custom actions on this resource.
 **/

@ApiModel(description = "The Actions object contains the available custom actions on this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Chassis100ChassisActions   {
  
  private Object oem = null;
  private Chassis100Reset chassisReset = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Oem")
  public Object getOem() {
    return oem;
  }
  public void setOem(Object oem) {
    this.oem = oem;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("#Chassis.Reset")
  public Chassis100Reset getChassisReset() {
    return chassisReset;
  }
  public void setChassisReset(Chassis100Reset chassisReset) {
    this.chassisReset = chassisReset;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Chassis100ChassisActions chassis100ChassisActions = (Chassis100ChassisActions) o;
    return Objects.equals(oem, chassis100ChassisActions.oem) &&
        Objects.equals(chassisReset, chassis100ChassisActions.chassisReset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(oem, chassisReset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Chassis100ChassisActions {\n");
    
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    chassisReset: ").append(toIndentedString(chassisReset)).append("\n");
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

