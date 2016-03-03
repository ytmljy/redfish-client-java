package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ComputerSystem100BootSource;
import io.swagger.client.model.ComputerSystem100BootSourceOverrideEnabled;



/**
 * This object contains the boot information for the current resource.
 **/

@ApiModel(description = "This object contains the boot information for the current resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ComputerSystem100Boot   {
  
  private ComputerSystem100BootSourceOverrideEnabled bootSourceOverrideEnabled = null;
  private ComputerSystem100BootSource bootSourceOverrideTarget = null;

  
  /**
   * Describes the state of the Boot Source Override feature
   **/
  public ComputerSystem100Boot bootSourceOverrideEnabled(ComputerSystem100BootSourceOverrideEnabled bootSourceOverrideEnabled) {
    this.bootSourceOverrideEnabled = bootSourceOverrideEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes the state of the Boot Source Override feature")
  @JsonProperty("BootSourceOverrideEnabled")
  public ComputerSystem100BootSourceOverrideEnabled getBootSourceOverrideEnabled() {
    return bootSourceOverrideEnabled;
  }
  public void setBootSourceOverrideEnabled(ComputerSystem100BootSourceOverrideEnabled bootSourceOverrideEnabled) {
    this.bootSourceOverrideEnabled = bootSourceOverrideEnabled;
  }

  
  /**
   * The current boot source to be used at next boot instead of the normal boot device, if BootSourceOverrideEnabled is true.
   **/
  public ComputerSystem100Boot bootSourceOverrideTarget(ComputerSystem100BootSource bootSourceOverrideTarget) {
    this.bootSourceOverrideTarget = bootSourceOverrideTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current boot source to be used at next boot instead of the normal boot device, if BootSourceOverrideEnabled is true.")
  @JsonProperty("BootSourceOverrideTarget")
  public ComputerSystem100BootSource getBootSourceOverrideTarget() {
    return bootSourceOverrideTarget;
  }
  public void setBootSourceOverrideTarget(ComputerSystem100BootSource bootSourceOverrideTarget) {
    this.bootSourceOverrideTarget = bootSourceOverrideTarget;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerSystem100Boot computerSystem100Boot = (ComputerSystem100Boot) o;
    return Objects.equals(this.bootSourceOverrideEnabled, computerSystem100Boot.bootSourceOverrideEnabled) &&
        Objects.equals(this.bootSourceOverrideTarget, computerSystem100Boot.bootSourceOverrideTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootSourceOverrideEnabled, bootSourceOverrideTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerSystem100Boot {\n");
    
    sb.append("    bootSourceOverrideEnabled: ").append(toIndentedString(bootSourceOverrideEnabled)).append("\n");
    sb.append("    bootSourceOverrideTarget: ").append(toIndentedString(bootSourceOverrideTarget)).append("\n");
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

