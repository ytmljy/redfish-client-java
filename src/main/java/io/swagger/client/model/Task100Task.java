package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Message100Message;
import io.swagger.client.model.ResourceOem;
import java.util.*;
import java.util.Date;



/**
 * This is the schema definition for a Task resource.
 **/

@ApiModel(description = "This is the schema definition for a Task resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class Task100Task   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;
  private String description = null;
  private Date endTime = null;
  private String id = null;
  private List<Message100Message> messages = new ArrayList<Message100Message>();
  private String name = null;
  private ResourceOem oem = null;
  private Date startTime = null;


  public enum TaskStateEnum {
    NEW("New"),
    STARTING("Starting"),
    RUNNING("Running"),
    SUSPENDED("Suspended"),
    INTERRUPTED("Interrupted"),
    PENDING("Pending"),
    STOPPING("Stopping"),
    COMPLETED("Completed"),
    KILLED("Killed"),
    EXCEPTION("Exception"),
    SERVICE("Service");

    private String value;

    TaskStateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TaskStateEnum taskState = null;


  public enum TaskStatusEnum {
    OK("OK"),
    WARNING("Warning"),
    CRITICAL("Critical");

    private String value;

    TaskStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TaskStatusEnum taskStatus = null;

  
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
   * The date-time stamp that the task was last completed.
   **/
  
  @ApiModelProperty(value = "The date-time stamp that the task was last completed.")
  @JsonProperty("EndTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
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
   * This is an array of messages associated with the task.
   **/
  
  @ApiModelProperty(value = "This is an array of messages associated with the task.")
  @JsonProperty("Messages")
  public List<Message100Message> getMessages() {
    return messages;
  }
  public void setMessages(List<Message100Message> messages) {
    this.messages = messages;
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
   * The date-time stamp that the task was last started.
   **/
  
  @ApiModelProperty(value = "The date-time stamp that the task was last started.")
  @JsonProperty("StartTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The state of the task.
   **/
  
  @ApiModelProperty(value = "The state of the task.")
  @JsonProperty("TaskState")
  public TaskStateEnum getTaskState() {
    return taskState;
  }
  public void setTaskState(TaskStateEnum taskState) {
    this.taskState = taskState;
  }

  
  /**
   * This is the completion status of the task.
   **/
  
  @ApiModelProperty(value = "This is the completion status of the task.")
  @JsonProperty("TaskStatus")
  public TaskStatusEnum getTaskStatus() {
    return taskStatus;
  }
  public void setTaskStatus(TaskStatusEnum taskStatus) {
    this.taskStatus = taskStatus;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task100Task task100Task = (Task100Task) o;
    return Objects.equals(odataContext, task100Task.odataContext) &&
        Objects.equals(odataId, task100Task.odataId) &&
        Objects.equals(odataType, task100Task.odataType) &&
        Objects.equals(description, task100Task.description) &&
        Objects.equals(endTime, task100Task.endTime) &&
        Objects.equals(id, task100Task.id) &&
        Objects.equals(messages, task100Task.messages) &&
        Objects.equals(name, task100Task.name) &&
        Objects.equals(oem, task100Task.oem) &&
        Objects.equals(startTime, task100Task.startTime) &&
        Objects.equals(taskState, task100Task.taskState) &&
        Objects.equals(taskStatus, task100Task.taskStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, endTime, id, messages, name, oem, startTime, taskState, taskStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task100Task {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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

