package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * This object contains the boot information for the current resource.
 **/

@ApiModel(description = "This object contains the boot information for the current resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ComputerSystem100Boot   {
  


  public enum BootSourceOverrideEnabledEnum {
    DISABLED("Disabled"),
    ONCE("Once"),
    CONTINUOUS("Continuous");

    private String value;

    BootSourceOverrideEnabledEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private BootSourceOverrideEnabledEnum bootSourceOverrideEnabled = null;


  public enum BootSourceOverrideTargetEnum {
    NONE("None"),
    PXE("Pxe"),
    FLOPPY("Floppy"),
    CD("Cd"),
    USB("Usb"),
    HDD("Hdd"),
    BIOSSETUP("BiosSetup"),
    UTILITIES("Utilities"),
    DIAGS("Diags"),
    UEFISHELL("UefiShell"),
    UEFITARGET("UefiTarget");

    private String value;

    BootSourceOverrideTargetEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private BootSourceOverrideTargetEnum bootSourceOverrideTarget = null;
  private String uefiTargetBootSourceOverride = null;

  
  /**
   * Describes the state of the Boot Source Override feature
   **/
  
  @ApiModelProperty(value = "Describes the state of the Boot Source Override feature")
  @JsonProperty("BootSourceOverrideEnabled")
  public BootSourceOverrideEnabledEnum getBootSourceOverrideEnabled() {
    return bootSourceOverrideEnabled;
  }
  public void setBootSourceOverrideEnabled(BootSourceOverrideEnabledEnum bootSourceOverrideEnabled) {
    this.bootSourceOverrideEnabled = bootSourceOverrideEnabled;
  }

  
  /**
   * The current boot source to be used at next boot instead of the normal boot device, if BootSourceOverrideEnabled is true.
   **/
  
  @ApiModelProperty(value = "The current boot source to be used at next boot instead of the normal boot device, if BootSourceOverrideEnabled is true.")
  @JsonProperty("BootSourceOverrideTarget")
  public BootSourceOverrideTargetEnum getBootSourceOverrideTarget() {
    return bootSourceOverrideTarget;
  }
  public void setBootSourceOverrideTarget(BootSourceOverrideTargetEnum bootSourceOverrideTarget) {
    this.bootSourceOverrideTarget = bootSourceOverrideTarget;
  }

  
  /**
   * This property is the Uefi Device Path of the device to boot from when BootSourceOverrideSupported is UefiTarget.
   **/
  
  @ApiModelProperty(value = "This property is the Uefi Device Path of the device to boot from when BootSourceOverrideSupported is UefiTarget.")
  @JsonProperty("UefiTargetBootSourceOverride")
  public String getUefiTargetBootSourceOverride() {
    return uefiTargetBootSourceOverride;
  }
  public void setUefiTargetBootSourceOverride(String uefiTargetBootSourceOverride) {
    this.uefiTargetBootSourceOverride = uefiTargetBootSourceOverride;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerSystem100Boot computerSystem100Boot = (ComputerSystem100Boot) o;
    return Objects.equals(bootSourceOverrideEnabled, computerSystem100Boot.bootSourceOverrideEnabled) &&
        Objects.equals(bootSourceOverrideTarget, computerSystem100Boot.bootSourceOverrideTarget) &&
        Objects.equals(uefiTargetBootSourceOverride, computerSystem100Boot.uefiTargetBootSourceOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bootSourceOverrideEnabled, bootSourceOverrideTarget, uefiTargetBootSourceOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerSystem100Boot {\n");
    
    sb.append("    bootSourceOverrideEnabled: ").append(toIndentedString(bootSourceOverrideEnabled)).append("\n");
    sb.append("    bootSourceOverrideTarget: ").append(toIndentedString(bootSourceOverrideTarget)).append("\n");
    sb.append("    uefiTargetBootSourceOverride: ").append(toIndentedString(uefiTargetBootSourceOverride)).append("\n");
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

