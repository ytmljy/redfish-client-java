package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.SessionCollectionSessionCollection;



/**
 * The links object contains the links to other resources that are related to this resource.
 **/

@ApiModel(description = "The links object contains the links to other resources that are related to this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ServiceRoot100ServiceRootLinks   {
  
  private SessionCollectionSessionCollection sessions = null;
  private ResourceOem oem = null;

  
  /**
   * Link to a collection of Sessions
   **/
  
  @ApiModelProperty(value = "Link to a collection of Sessions")
  @JsonProperty("Sessions")
  public SessionCollectionSessionCollection getSessions() {
    return sessions;
  }
  public void setSessions(SessionCollectionSessionCollection sessions) {
    this.sessions = sessions;
  }

  
  /**
   * Oem extension object.
   **/
  
  @ApiModelProperty(value = "Oem extension object.")
  @JsonProperty("Oem")
  public ResourceOem getOem() {
    return oem;
  }
  public void setOem(ResourceOem oem) {
    this.oem = oem;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceRoot100ServiceRootLinks serviceRoot100ServiceRootLinks = (ServiceRoot100ServiceRootLinks) o;
    return Objects.equals(sessions, serviceRoot100ServiceRootLinks.sessions) &&
        Objects.equals(oem, serviceRoot100ServiceRootLinks.oem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessions, oem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceRoot100ServiceRootLinks {\n");
    
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
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

