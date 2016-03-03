package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceHealth;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceState;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ResourceStatus   {
  
  private ResourceHealth health = null;
  private ResourceHealth healthRollup = null;
  private ResourceOem oem = null;
  private ResourceState state = null;

  
  /**
   * This represents the health state of this resource in the absence of its dependent resources.
   **/
  public ResourceStatus health(ResourceHealth health) {
    this.health = health;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This represents the health state of this resource in the absence of its dependent resources.")
  @JsonProperty("Health")
  public ResourceHealth getHealth() {
    return health;
  }
  public void setHealth(ResourceHealth health) {
    this.health = health;
  }

  
  /**
   * This represents the overall health state from the view of this resource.
   **/
  public ResourceStatus healthRollup(ResourceHealth healthRollup) {
    this.healthRollup = healthRollup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This represents the overall health state from the view of this resource.")
  @JsonProperty("HealthRollup")
  public ResourceHealth getHealthRollup() {
    return healthRollup;
  }
  public void setHealthRollup(ResourceHealth healthRollup) {
    this.healthRollup = healthRollup;
  }

  
  /**
   **/
  public ResourceStatus oem(ResourceOem oem) {
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
   * This indicates the known state of the resource, such as if it is enabled.
   **/
  public ResourceStatus state(ResourceState state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This indicates the known state of the resource, such as if it is enabled.")
  @JsonProperty("State")
  public ResourceState getState() {
    return state;
  }
  public void setState(ResourceState state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceStatus resourceStatus = (ResourceStatus) o;
    return Objects.equals(this.health, resourceStatus.health) &&
        Objects.equals(this.healthRollup, resourceStatus.healthRollup) &&
        Objects.equals(this.oem, resourceStatus.oem) &&
        Objects.equals(this.state, resourceStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(health, healthRollup, oem, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceStatus {\n");
    
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    healthRollup: ").append(toIndentedString(healthRollup)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

