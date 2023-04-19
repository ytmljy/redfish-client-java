package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Processor100ProcessorId;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import java.math.BigDecimal;



/**
 * This is the schema definition for the Processor resource.  It represents the properties of a processor attached to a System.
 **/

@ApiModel(description = "This is the schema definition for the Processor resource.  It represents the properties of a processor attached to a System.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Processor100Processor   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private String id = null;


  public enum InstructionSetEnum {
    X86("x86"),
    X86_64("x86-64"),
    IA_64("IA-64"),
    ARM_A32("ARM-A32"),
    ARM_A64("ARM-A64"),
    MIPS32("MIPS32"),
    MIPS64("MIPS64"),
    OEM("OEM");

    private String value;

    InstructionSetEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private InstructionSetEnum instructionSet = null;
  private String manufacturer = null;
  private BigDecimal maxSpeedMHz = null;
  private String model = null;
  private String name = null;
  private ResourceOem oem = null;


  public enum ProcessorArchitectureEnum {
    X86("x86"),
    IA_64("IA-64"),
    ARM("ARM"),
    MIPS("MIPS"),
    OEM("OEM");

    private String value;

    ProcessorArchitectureEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ProcessorArchitectureEnum processorArchitecture = null;
  private Processor100ProcessorId processorId = null;


  public enum ProcessorTypeEnum {
    CPU("CPU"),
    GPU("GPU"),
    FPGA("FPGA"),
    DSP("DSP"),
    ACCELERATOR("Accelerator"),
    OEM("OEM");

    private String value;

    ProcessorTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ProcessorTypeEnum processorType = null;
  private String socket = null;
  private ResourceStatus status = null;
  private BigDecimal totalCores = null;
  private BigDecimal totalThreads = null;
  private Odata400IdRef metrics = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.context")
  public String getOdataContext() {
    return odataContext;
  }
  public void setOdataContext(String odataContext) {
    this.odataContext = odataContext;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.id")
  public String getOdataId() {
    return odataId;
  }
  public void setOdataId(String odataId) {
    this.odataId = odataId;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("@odata.type")
  public String getOdataType() {
    return odataType;
  }
  public void setOdataType(String odataType) {
    this.odataType = odataType;
  }

  
  /**
   * Provides a description of this resource and is used for commonality  in the schema definitions.
   **/
  
  @ApiModelProperty(value = "Provides a description of this resource and is used for commonality  in the schema definitions.")
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Uniquely identifies the resource within the collection of like resources.
   **/
  
  @ApiModelProperty(value = "Uniquely identifies the resource within the collection of like resources.")
  @JsonProperty("Id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The instruction set of the processor
   **/
  
  @ApiModelProperty(value = "The instruction set of the processor")
  @JsonProperty("InstructionSet")
  public InstructionSetEnum getInstructionSet() {
    return instructionSet;
  }
  public void setInstructionSet(InstructionSetEnum instructionSet) {
    this.instructionSet = instructionSet;
  }

  
  /**
   * The processor manufacturer
   **/
  
  @ApiModelProperty(value = "The processor manufacturer")
  @JsonProperty("Manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  
  /**
   * The maximum clock speed of the processor
   **/
  
  @ApiModelProperty(value = "The maximum clock speed of the processor")
  @JsonProperty("MaxSpeedMHz")
  public BigDecimal getMaxSpeedMHz() {
    return maxSpeedMHz;
  }
  public void setMaxSpeedMHz(BigDecimal maxSpeedMHz) {
    this.maxSpeedMHz = maxSpeedMHz;
  }

  
  /**
   * The product model number of this device
   **/
  
  @ApiModelProperty(value = "The product model number of this device")
  @JsonProperty("Model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   * The name of the resource or array element.
   **/
  
  @ApiModelProperty(value = "The name of the resource or array element.")
  @JsonProperty("Name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.
   **/
  
  @ApiModelProperty(value = "This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.")
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
  
  @ApiModelProperty(value = "The architecture of the processor")
  @JsonProperty("ProcessorArchitecture")
  public ProcessorArchitectureEnum getProcessorArchitecture() {
    return processorArchitecture;
  }
  public void setProcessorArchitecture(ProcessorArchitectureEnum processorArchitecture) {
    this.processorArchitecture = processorArchitecture;
  }

  
  /**
   * Identification information for this processor.
   **/
  
  @ApiModelProperty(value = "Identification information for this processor.")
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
  
  @ApiModelProperty(value = "The type of processor")
  @JsonProperty("ProcessorType")
  public ProcessorTypeEnum getProcessorType() {
    return processorType;
  }
  public void setProcessorType(ProcessorTypeEnum processorType) {
    this.processorType = processorType;
  }

  
  /**
   * The socket or location of the processor
   **/
  
  @ApiModelProperty(value = "The socket or location of the processor")
  @JsonProperty("Socket")
  public String getSocket() {
    return socket;
  }
  public void setSocket(String socket) {
    this.socket = socket;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Status")
  public ResourceStatus getStatus() {
    return status;
  }
  public void setStatus(ResourceStatus status) {
    this.status = status;
  }

  
  /**
   * The total number of cores contained in this processor
   **/
  
  @ApiModelProperty(value = "The total number of cores contained in this processor")
  @JsonProperty("TotalCores")
  public BigDecimal getTotalCores() {
    return totalCores;
  }
  public void setTotalCores(BigDecimal totalCores) {
    this.totalCores = totalCores;
  }

  
  /**
   * The total number of execution threads supported by this processor
   **/
  
  @ApiModelProperty(value = "The total number of execution threads supported by this processor")
  @JsonProperty("TotalThreads")
  public BigDecimal getTotalThreads() {
    return totalThreads;
  }
  public void setTotalThreads(BigDecimal totalThreads) {
    this.totalThreads = totalThreads;
  }

  @ApiModelProperty(value = "The metrics of processor")
  @JsonProperty("Metrics")
  public Odata400IdRef getMetrics() {
    return metrics;
  }
  public void setMetrics(Odata400IdRef metrics) {
    this.metrics = metrics;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Processor100Processor processor100Processor = (Processor100Processor) o;
    return Objects.equals(odataContext, processor100Processor.odataContext) &&
        Objects.equals(odataId, processor100Processor.odataId) &&
        Objects.equals(odataType, processor100Processor.odataType) &&
        Objects.equals(description, processor100Processor.description) &&
        Objects.equals(id, processor100Processor.id) &&
        Objects.equals(instructionSet, processor100Processor.instructionSet) &&
        Objects.equals(manufacturer, processor100Processor.manufacturer) &&
        Objects.equals(maxSpeedMHz, processor100Processor.maxSpeedMHz) &&
        Objects.equals(model, processor100Processor.model) &&
        Objects.equals(name, processor100Processor.name) &&
        Objects.equals(oem, processor100Processor.oem) &&
        Objects.equals(processorArchitecture, processor100Processor.processorArchitecture) &&
        Objects.equals(processorId, processor100Processor.processorId) &&
        Objects.equals(processorType, processor100Processor.processorType) &&
        Objects.equals(socket, processor100Processor.socket) &&
        Objects.equals(status, processor100Processor.status) &&
        Objects.equals(totalCores, processor100Processor.totalCores) &&
        Objects.equals(totalThreads, processor100Processor.totalThreads) &&
            Objects.equals(metrics, processor100Processor.metrics)
            ;

  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, id, instructionSet, manufacturer, maxSpeedMHz, model, name, oem, processorArchitecture, processorId, processorType, socket, status, totalCores, totalThreads);
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
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    maxSpeedMHz: ").append(toIndentedString(maxSpeedMHz)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    processorArchitecture: ").append(toIndentedString(processorArchitecture)).append("\n");
    sb.append("    processorId: ").append(toIndentedString(processorId)).append("\n");
    sb.append("    processorType: ").append(toIndentedString(processorType)).append("\n");
    sb.append("    socket: ").append(toIndentedString(socket)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalCores: ").append(toIndentedString(totalCores)).append("\n");
    sb.append("    totalThreads: ").append(toIndentedString(totalThreads)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

