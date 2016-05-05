package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class VLanNetworkInterface100VLAN   {
  
  private Boolean vLANEnable = null;
  private BigDecimal vLANId = null;

  
  /**
   * This indicates if this VLAN is enabled.
   **/
  
  @ApiModelProperty(value = "This indicates if this VLAN is enabled.")
  @JsonProperty("VLANEnable")
  public Boolean getVLANEnable() {
    return vLANEnable;
  }
  public void setVLANEnable(Boolean vLANEnable) {
    this.vLANEnable = vLANEnable;
  }

  
  /**
   * This indicates the VLAN identifier for this VLAN.
   * minimum: 0.0
   * maximum: 4095.0
   **/
  
  @ApiModelProperty(value = "This indicates the VLAN identifier for this VLAN.")
  @JsonProperty("VLANId")
  public BigDecimal getVLANId() {
    return vLANId;
  }
  public void setVLANId(BigDecimal vLANId) {
    this.vLANId = vLANId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VLanNetworkInterface100VLAN vLanNetworkInterface100VLAN = (VLanNetworkInterface100VLAN) o;
    return Objects.equals(vLANEnable, vLanNetworkInterface100VLAN.vLANEnable) &&
        Objects.equals(vLANId, vLanNetworkInterface100VLAN.vLANId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vLANEnable, vLANId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VLanNetworkInterface100VLAN {\n");
    
    sb.append("    vLANEnable: ").append(toIndentedString(vLANEnable)).append("\n");
    sb.append("    vLANId: ").append(toIndentedString(vLANId)).append("\n");
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

