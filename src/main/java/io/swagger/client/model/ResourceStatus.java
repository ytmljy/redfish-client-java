package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ResourceStatus   {
  


  public enum HealthEnum {
    OK("OK"),
    WARNING("Warning"),
    CRITICAL("Critical");

    private String value;

    HealthEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private HealthEnum health = null;


  public enum HealthRollupEnum {
    OK("OK"),
    WARNING("Warning"),
    CRITICAL("Critical");

    private String value;

    HealthRollupEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private HealthRollupEnum healthRollup = null;
  private ResourceOem oem = null;


  public enum StateEnum {
    ENABLED("Enabled"),
    DISABLED("Disabled"),
    STANDBYOFFLINE("StandbyOffline"),
    STANDBYSPARE("StandbySpare"),
    INTEST("InTest"),
    STARTING("Starting"),
    ABSENT("Absent");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StateEnum state = null;

  
  /**
   * This represents the health state of this resource in the absence of its dependent resources.
   **/
  
  @ApiModelProperty(value = "This represents the health state of this resource in the absence of its dependent resources.")
  @JsonProperty("Health")
  public HealthEnum getHealth() {
    return health;
  }
  public void setHealth(HealthEnum health) {
    this.health = health;
  }

  
  /**
   * This represents the overall health state from the view of this resource.
   **/
  
  @ApiModelProperty(value = "This represents the overall health state from the view of this resource.")
  @JsonProperty("HealthRollup")
  public HealthRollupEnum getHealthRollup() {
    return healthRollup;
  }
  public void setHealthRollup(HealthRollupEnum healthRollup) {
    this.healthRollup = healthRollup;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
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
  
  @ApiModelProperty(value = "This indicates the known state of the resource, such as if it is enabled.")
  @JsonProperty("State")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceStatus resourceStatus = (ResourceStatus) o;
    return Objects.equals(health, resourceStatus.health) &&
        Objects.equals(healthRollup, resourceStatus.healthRollup) &&
        Objects.equals(oem, resourceStatus.oem) &&
        Objects.equals(state, resourceStatus.state);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

