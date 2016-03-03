package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ManagerNetworkProtocol100NotifyIPv6Scope;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ManagerNetworkProtocol100SSDProtocol   {
  
  private ManagerNetworkProtocol100NotifyIPv6Scope notifyIPv6Scope = null;

  
  /**
   * Indicates the scope for the IPv6 Notify messages for SSDP.
   **/
  public ManagerNetworkProtocol100SSDProtocol notifyIPv6Scope(ManagerNetworkProtocol100NotifyIPv6Scope notifyIPv6Scope) {
    this.notifyIPv6Scope = notifyIPv6Scope;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the scope for the IPv6 Notify messages for SSDP.")
  @JsonProperty("NotifyIPv6Scope")
  public ManagerNetworkProtocol100NotifyIPv6Scope getNotifyIPv6Scope() {
    return notifyIPv6Scope;
  }
  public void setNotifyIPv6Scope(ManagerNetworkProtocol100NotifyIPv6Scope notifyIPv6Scope) {
    this.notifyIPv6Scope = notifyIPv6Scope;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagerNetworkProtocol100SSDProtocol managerNetworkProtocol100SSDProtocol = (ManagerNetworkProtocol100SSDProtocol) o;
    return Objects.equals(this.notifyIPv6Scope, managerNetworkProtocol100SSDProtocol.notifyIPv6Scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyIPv6Scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerNetworkProtocol100SSDProtocol {\n");
    
    sb.append("    notifyIPv6Scope: ").append(toIndentedString(notifyIPv6Scope)).append("\n");
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

