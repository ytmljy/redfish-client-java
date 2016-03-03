package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.Processor100InstructionSet;
import io.swagger.client.model.Processor100ProcessorArchitecture;
import io.swagger.client.model.Processor100ProcessorId;
import io.swagger.client.model.Processor100ProcessorType;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;



/**
 * This is the schema definition for the Processor resource.  It represents the properties of a processor attached to a System.
 **/

@ApiModel(description = "This is the schema definition for the Processor resource.  It represents the properties of a processor attached to a System.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Processor100Processor   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private ResourceDescription description = null;
  private ResourceId id = null;
  private Processor100InstructionSet instructionSet = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private Processor100ProcessorArchitecture processorArchitecture = null;
  private Processor100ProcessorId processorId = null;
  private Processor100ProcessorType processorType = null;
  private ResourceStatus status = null;

  
  /**
   **/
  public Processor100Processor odataContext(Odata400Context odataContext) {
    this.odataContext = odataContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("@odata.context")
  public Odata400Context getOdataContext() {
    return odataContext;
  }
  public void setOdataContext(Odata400Context odataContext) {
    this.odataContext = odataContext;
  }

  
  /**
   **/
  public Processor100Processor odataId(Odata400Id odataId) {
    this.odataId = odataId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("@odata.id")
  public Odata400Id getOdataId() {
    return odataId;
  }
  public void setOdataId(Odata400Id odataId) {
    this.odataId = odataId;
  }

  
  /**
   **/
  public Processor100Processor odataType(Odata400Type odataType) {
    this.odataType = odataType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("@odata.type")
  public Odata400Type getOdataType() {
    return odataType;
  }
  public void setOdataType(Odata400Type odataType) {
    this.odataType = odataType;
  }

  
  /**
   **/
  public Processor100Processor description(ResourceDescription description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Description")
  public ResourceDescription getDescription() {
    return description;
  }
  public void setDescription(ResourceDescription description) {
    this.description = description;
  }

  
  /**
   **/
  public Processor100Processor id(ResourceId id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Id")
  public ResourceId getId() {
    return id;
  }
  public void setId(ResourceId id) {
    this.id = id;
  }

  
  /**
   * The instruction set of the processor
   **/
  public Processor100Processor instructionSet(Processor100InstructionSet instructionSet) {
    this.instructionSet = instructionSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The instruction set of the processor")
  @JsonProperty("InstructionSet")
  public Processor100InstructionSet getInstructionSet() {
    return instructionSet;
  }
  public void setInstructionSet(Processor100InstructionSet instructionSet) {
    this.instructionSet = instructionSet;
  }

  
  /**
   **/
  public Processor100Processor name(ResourceName name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Name")
  public ResourceName getName() {
    return name;
  }
  public void setName(ResourceName name) {
    this.name = name;
  }

  
  /**
   * This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.
   **/
  public Processor100Processor oem(ResourceOem oem) {
    this.oem = oem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.")
  @JsonProperty("Oem")
  public ResourceOem getOem() {
    return oem;
  }
  public void setOem(ResourceOem oem) {
    this.oem = oem;
  }

  
  /**
   * The architecture of the processor
   **/
  public Processor100Processor processorArchitecture(Processor100ProcessorArchitecture processorArchitecture) {
    this.processorArchitecture = processorArchitecture;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The architecture of the processor")
  @JsonProperty("ProcessorArchitecture")
  public Processor100ProcessorArchitecture getProcessorArchitecture() {
    return processorArchitecture;
  }
  public void setProcessorArchitecture(Processor100ProcessorArchitecture processorArchitecture) {
    this.processorArchitecture = processorArchitecture;
  }

  
  /**
   * Identification information for this processor.
   **/
  public Processor100Processor processorId(Processor100ProcessorId processorId) {
    this.processorId = processorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Identification information for this processor.")
  @JsonProperty("ProcessorId")
  public Processor100ProcessorId getProcessorId() {
    return processorId;
  }
  public void setProcessorId(Processor100ProcessorId processorId) {
    this.processorId = processorId;
  }

  
  /**
   * The type of processor
   **/
  public Processor100Processor processorType(Processor100ProcessorType processorType) {
    this.processorType = processorType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of processor")
  @JsonProperty("ProcessorType")
  public Processor100ProcessorType getProcessorType() {
    return processorType;
  }
  public void setProcessorType(Processor100ProcessorType processorType) {
    this.processorType = processorType;
  }

  
  /**
   **/
  public Processor100Processor status(ResourceStatus status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Status")
  public ResourceStatus getStatus() {
    return status;
  }
  public void setStatus(ResourceStatus status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Processor100Processor processor100Processor = (Processor100Processor) o;
    return Objects.equals(this.odataContext, processor100Processor.odataContext) &&
        Objects.equals(this.odataId, processor100Processor.odataId) &&
        Objects.equals(this.odataType, processor100Processor.odataType) &&
        Objects.equals(this.description, processor100Processor.description) &&
        Objects.equals(this.id, processor100Processor.id) &&
        Objects.equals(this.instructionSet, processor100Processor.instructionSet) &&
        Objects.equals(this.name, processor100Processor.name) &&
        Objects.equals(this.oem, processor100Processor.oem) &&
        Objects.equals(this.processorArchitecture, processor100Processor.processorArchitecture) &&
        Objects.equals(this.processorId, processor100Processor.processorId) &&
        Objects.equals(this.processorType, processor100Processor.processorType) &&
        Objects.equals(this.status, processor100Processor.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, id, instructionSet, name, oem, processorArchitecture, processorId, processorType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Processor100Processor {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instructionSet: ").append(toIndentedString(instructionSet)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    processorArchitecture: ").append(toIndentedString(processorArchitecture)).append("\n");
    sb.append("    processorId: ").append(toIndentedString(processorId)).append("\n");
    sb.append("    processorType: ").append(toIndentedString(processorType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

