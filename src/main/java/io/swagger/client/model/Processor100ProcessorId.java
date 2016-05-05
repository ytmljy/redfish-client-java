package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Processor100ProcessorId   {
  
  private String effectiveFamily = null;
  private String effectiveModel = null;
  private String identificationRegisters = null;
  private String microcodeInfo = null;
  private String step = null;
  private String vendorId = null;

  
  /**
   * The effective Family for this processor
   **/
  
  @ApiModelProperty(value = "The effective Family for this processor")
  @JsonProperty("EffectiveFamily")
  public String getEffectiveFamily() {
    return effectiveFamily;
  }
  public void setEffectiveFamily(String effectiveFamily) {
    this.effectiveFamily = effectiveFamily;
  }

  
  /**
   * The effective Model for this processor
   **/
  
  @ApiModelProperty(value = "The effective Model for this processor")
  @JsonProperty("EffectiveModel")
  public String getEffectiveModel() {
    return effectiveModel;
  }
  public void setEffectiveModel(String effectiveModel) {
    this.effectiveModel = effectiveModel;
  }

  
  /**
   * The contents of the Identification Registers (CPUID) for this processor
   **/
  
  @ApiModelProperty(value = "The contents of the Identification Registers (CPUID) for this processor")
  @JsonProperty("IdentificationRegisters")
  public String getIdentificationRegisters() {
    return identificationRegisters;
  }
  public void setIdentificationRegisters(String identificationRegisters) {
    this.identificationRegisters = identificationRegisters;
  }

  
  /**
   * The Microcode Information for this processor
   **/
  
  @ApiModelProperty(value = "The Microcode Information for this processor")
  @JsonProperty("MicrocodeInfo")
  public String getMicrocodeInfo() {
    return microcodeInfo;
  }
  public void setMicrocodeInfo(String microcodeInfo) {
    this.microcodeInfo = microcodeInfo;
  }

  
  /**
   * The Step value for this processor
   **/
  
  @ApiModelProperty(value = "The Step value for this processor")
  @JsonProperty("Step")
  public String getStep() {
    return step;
  }
  public void setStep(String step) {
    this.step = step;
  }

  
  /**
   * The Vendor Identification for this processor
   **/
  
  @ApiModelProperty(value = "The Vendor Identification for this processor")
  @JsonProperty("VendorId")
  public String getVendorId() {
    return vendorId;
  }
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Processor100ProcessorId processor100ProcessorId = (Processor100ProcessorId) o;
    return Objects.equals(effectiveFamily, processor100ProcessorId.effectiveFamily) &&
        Objects.equals(effectiveModel, processor100ProcessorId.effectiveModel) &&
        Objects.equals(identificationRegisters, processor100ProcessorId.identificationRegisters) &&
        Objects.equals(microcodeInfo, processor100ProcessorId.microcodeInfo) &&
        Objects.equals(step, processor100ProcessorId.step) &&
        Objects.equals(vendorId, processor100ProcessorId.vendorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveFamily, effectiveModel, identificationRegisters, microcodeInfo, step, vendorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Processor100ProcessorId {\n");
    
    sb.append("    effectiveFamily: ").append(toIndentedString(effectiveFamily)).append("\n");
    sb.append("    effectiveModel: ").append(toIndentedString(effectiveModel)).append("\n");
    sb.append("    identificationRegisters: ").append(toIndentedString(identificationRegisters)).append("\n");
    sb.append("    microcodeInfo: ").append(toIndentedString(microcodeInfo)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
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

