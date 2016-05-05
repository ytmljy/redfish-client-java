package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * This is the base type for the reset action.
 **/

@ApiModel(description = "This is the base type for the reset action.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class RackHDResetActionResetAction   {
  


  public enum ResetTypeEnum {
    ON("On"),
    FORCEOFF("ForceOff"),
    GRACEFULSHUTDOWN("GracefulShutdown"),
    GRACEFULRESTART("GracefulRestart"),
    FORCERESTART("ForceRestart"),
    NMI("Nmi"),
    FORCEON("ForceOn"),
    PUSHPOWERBUTTON("PushPowerButton");

    private String value;

    ResetTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ResetTypeEnum resetType = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("reset_type")
  public ResetTypeEnum getResetType() {
    return resetType;
  }
  public void setResetType(ResetTypeEnum resetType) {
    this.resetType = resetType;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDResetActionResetAction rackHDResetActionResetAction = (RackHDResetActionResetAction) o;
    return Objects.equals(resetType, rackHDResetActionResetAction.resetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDResetActionResetAction {\n");
    
    sb.append("    resetType: ").append(toIndentedString(resetType)).append("\n");
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

