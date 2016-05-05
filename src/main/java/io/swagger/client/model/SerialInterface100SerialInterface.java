package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;



/**
 * This schema defines an asynchronous serial interface resource.
 **/

@ApiModel(description = "This schema defines an asynchronous serial interface resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class SerialInterface100SerialInterface   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;


  public enum BitRateEnum {
    _1200("1200"),
    _2400("2400"),
    _4800("4800"),
    _9600("9600"),
    _19200("19200"),
    _38400("38400"),
    _57600("57600"),
    _115200("115200"),
    _230400("230400");

    private String value;

    BitRateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private BitRateEnum bitRate = null;


  public enum ConnectorTypeEnum {
    RJ45("RJ45"),
    RJ11("RJ11"),
    DB9_FEMALE("DB9 Female"),
    DB9_MALE("DB9 Male"),
    DB25_FEMALE("DB25 Female"),
    DB25_MALE("DB25 Male"),
    USB("USB"),
    MUSB("mUSB"),
    UUSB("uUSB");

    private String value;

    ConnectorTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ConnectorTypeEnum connectorType = null;


  public enum DataBitsEnum {
    _5("5"),
    _6("6"),
    _7("7"),
    _8("8");

    private String value;

    DataBitsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DataBitsEnum dataBits = null;
  private String description = null;


  public enum FlowControlEnum {
    NONE("None"),
    SOFTWARE("Software"),
    HARDWARE("Hardware");

    private String value;

    FlowControlEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private FlowControlEnum flowControl = null;
  private String id = null;
  private Boolean interfaceEnabled = null;
  private String name = null;
  private ResourceOem oem = null;


  public enum ParityEnum {
    NONE("None"),
    EVEN("Even"),
    ODD("Odd"),
    MARK("Mark"),
    SPACE("Space");

    private String value;

    ParityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ParityEnum parity = null;


  public enum PinOutEnum {
    CISCO("Cisco"),
    CYCLADES("Cyclades"),
    DIGI("Digi");

    private String value;

    PinOutEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private PinOutEnum pinOut = null;


  public enum SignalTypeEnum {
    RS232("Rs232"),
    RS485("Rs485");

    private String value;

    SignalTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SignalTypeEnum signalType = null;


  public enum StopBitsEnum {
    _1("1"),
    _2("2");

    private String value;

    StopBitsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StopBitsEnum stopBits = null;

  
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
   * The receive and transmit rate of data flow, typically in bits-per-second (bps), over the serial connection.
   **/
  
  @ApiModelProperty(value = "The receive and transmit rate of data flow, typically in bits-per-second (bps), over the serial connection.")
  @JsonProperty("BitRate")
  public BitRateEnum getBitRate() {
    return bitRate;
  }
  public void setBitRate(BitRateEnum bitRate) {
    this.bitRate = bitRate;
  }

  
  /**
   * The type of connector used for this interface.
   **/
  
  @ApiModelProperty(value = "The type of connector used for this interface.")
  @JsonProperty("ConnectorType")
  public ConnectorTypeEnum getConnectorType() {
    return connectorType;
  }
  public void setConnectorType(ConnectorTypeEnum connectorType) {
    this.connectorType = connectorType;
  }

  
  /**
   * The number of data bits that will follow the start bit over the serial connection.
   **/
  
  @ApiModelProperty(value = "The number of data bits that will follow the start bit over the serial connection.")
  @JsonProperty("DataBits")
  public DataBitsEnum getDataBits() {
    return dataBits;
  }
  public void setDataBits(DataBitsEnum dataBits) {
    this.dataBits = dataBits;
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
   * The type of flow control, if any, that will be imposed on the serial connection.
   **/
  
  @ApiModelProperty(value = "The type of flow control, if any, that will be imposed on the serial connection.")
  @JsonProperty("FlowControl")
  public FlowControlEnum getFlowControl() {
    return flowControl;
  }
  public void setFlowControl(FlowControlEnum flowControl) {
    this.flowControl = flowControl;
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
   * This indicates whether this interface is enabled.
   **/
  
  @ApiModelProperty(value = "This indicates whether this interface is enabled.")
  @JsonProperty("InterfaceEnabled")
  public Boolean getInterfaceEnabled() {
    return interfaceEnabled;
  }
  public void setInterfaceEnabled(Boolean interfaceEnabled) {
    this.interfaceEnabled = interfaceEnabled;
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
   * The type of parity used by the sender and receiver in order to detect errors over the serial connection.
   **/
  
  @ApiModelProperty(value = "The type of parity used by the sender and receiver in order to detect errors over the serial connection.")
  @JsonProperty("Parity")
  public ParityEnum getParity() {
    return parity;
  }
  public void setParity(ParityEnum parity) {
    this.parity = parity;
  }

  
  /**
   * The physical pin configuration needed for a serial connector.
   **/
  
  @ApiModelProperty(value = "The physical pin configuration needed for a serial connector.")
  @JsonProperty("PinOut")
  public PinOutEnum getPinOut() {
    return pinOut;
  }
  public void setPinOut(PinOutEnum pinOut) {
    this.pinOut = pinOut;
  }

  
  /**
   * The type of signal used for the communication connection - RS232 or RS485.
   **/
  
  @ApiModelProperty(value = "The type of signal used for the communication connection - RS232 or RS485.")
  @JsonProperty("SignalType")
  public SignalTypeEnum getSignalType() {
    return signalType;
  }
  public void setSignalType(SignalTypeEnum signalType) {
    this.signalType = signalType;
  }

  
  /**
   * The period of time before the next start bit is transmitted.
   **/
  
  @ApiModelProperty(value = "The period of time before the next start bit is transmitted.")
  @JsonProperty("StopBits")
  public StopBitsEnum getStopBits() {
    return stopBits;
  }
  public void setStopBits(StopBitsEnum stopBits) {
    this.stopBits = stopBits;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SerialInterface100SerialInterface serialInterface100SerialInterface = (SerialInterface100SerialInterface) o;
    return Objects.equals(odataContext, serialInterface100SerialInterface.odataContext) &&
        Objects.equals(odataId, serialInterface100SerialInterface.odataId) &&
        Objects.equals(odataType, serialInterface100SerialInterface.odataType) &&
        Objects.equals(bitRate, serialInterface100SerialInterface.bitRate) &&
        Objects.equals(connectorType, serialInterface100SerialInterface.connectorType) &&
        Objects.equals(dataBits, serialInterface100SerialInterface.dataBits) &&
        Objects.equals(description, serialInterface100SerialInterface.description) &&
        Objects.equals(flowControl, serialInterface100SerialInterface.flowControl) &&
        Objects.equals(id, serialInterface100SerialInterface.id) &&
        Objects.equals(interfaceEnabled, serialInterface100SerialInterface.interfaceEnabled) &&
        Objects.equals(name, serialInterface100SerialInterface.name) &&
        Objects.equals(oem, serialInterface100SerialInterface.oem) &&
        Objects.equals(parity, serialInterface100SerialInterface.parity) &&
        Objects.equals(pinOut, serialInterface100SerialInterface.pinOut) &&
        Objects.equals(signalType, serialInterface100SerialInterface.signalType) &&
        Objects.equals(stopBits, serialInterface100SerialInterface.stopBits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, bitRate, connectorType, dataBits, description, flowControl, id, interfaceEnabled, name, oem, parity, pinOut, signalType, stopBits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SerialInterface100SerialInterface {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    bitRate: ").append(toIndentedString(bitRate)).append("\n");
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    dataBits: ").append(toIndentedString(dataBits)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    flowControl: ").append(toIndentedString(flowControl)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    interfaceEnabled: ").append(toIndentedString(interfaceEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    parity: ").append(toIndentedString(parity)).append("\n");
    sb.append("    pinOut: ").append(toIndentedString(pinOut)).append("\n");
    sb.append("    signalType: ").append(toIndentedString(signalType)).append("\n");
    sb.append("    stopBits: ").append(toIndentedString(stopBits)).append("\n");
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

