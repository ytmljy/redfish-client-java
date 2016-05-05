package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.LogService100ClearLog;



/**
 * The Actions object contains the available custom actions on this resource.
 **/

@ApiModel(description = "The Actions object contains the available custom actions on this resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class LogService100LogServiceActions   {
  
  private LogService100ClearLog logServiceClearLog = null;
  private Object oem = null;

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("#LogService.ClearLog")
  public LogService100ClearLog getLogServiceClearLog() {
    return logServiceClearLog;
  }
  public void setLogServiceClearLog(LogService100ClearLog logServiceClearLog) {
    this.logServiceClearLog = logServiceClearLog;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Oem")
  public Object getOem() {
    return oem;
  }
  public void setOem(Object oem) {
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
    LogService100LogServiceActions logService100LogServiceActions = (LogService100LogServiceActions) o;
    return Objects.equals(logServiceClearLog, logService100LogServiceActions.logServiceClearLog) &&
        Objects.equals(oem, logService100LogServiceActions.oem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logServiceClearLog, oem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogService100LogServiceActions {\n");
    
    sb.append("    logServiceClearLog: ").append(toIndentedString(logServiceClearLog)).append("\n");
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

