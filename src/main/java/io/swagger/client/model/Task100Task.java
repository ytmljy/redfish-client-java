package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Message100Message;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceHealth;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.Task100TaskState;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 * This is the schema definition for a Task resource.
 **/

@ApiModel(description = "This is the schema definition for a Task resource.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Task100Task   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private ResourceDescription description = null;
  private Date endTime = null;
  private ResourceId id = null;
  private List<Message100Message> messages = new ArrayList<Message100Message>();
  private ResourceName name = null;
  private ResourceOem oem = null;
  private Date startTime = null;
  private Task100TaskState taskState = null;
  private ResourceHealth taskStatus = null;

  
  /**
   **/
  public Task100Task odataContext(Odata400Context odataContext) {
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
  public Task100Task odataId(Odata400Id odataId) {
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
  public Task100Task odataType(Odata400Type odataType) {
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
  public Task100Task description(ResourceDescription description) {
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

  
  @ApiModelProperty(example = "null", value = "The date-time stamp that the task was last completed.")
  @JsonProperty("EndTime")
  public Date getEndTime() {
    return endTime;
  }

  
  /**
   **/
  public Task100Task id(ResourceId id) {
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
   * This is an array of messages associated with the task.
   **/
  public Task100Task messages(List<Message100Message> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is an array of messages associated with the task.")
  @JsonProperty("Messages")
  public List<Message100Message> getMessages() {
    return messages;
  }
  public void setMessages(List<Message100Message> messages) {
    this.messages = messages;
  }

  
  /**
   **/
  public Task100Task name(ResourceName name) {
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
  public Task100Task oem(ResourceOem oem) {
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

  
  @ApiModelProperty(example = "null", value = "The date-time stamp that the task was last started.")
  @JsonProperty("StartTime")
  public Date getStartTime() {
    return startTime;
  }

  
  /**
   * The state of the task.
   **/
  public Task100Task taskState(Task100TaskState taskState) {
    this.taskState = taskState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The state of the task.")
  @JsonProperty("TaskState")
  public Task100TaskState getTaskState() {
    return taskState;
  }
  public void setTaskState(Task100TaskState taskState) {
    this.taskState = taskState;
  }

  
  /**
   * This is the completion status of the task.
   **/
  public Task100Task taskStatus(ResourceHealth taskStatus) {
    this.taskStatus = taskStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the completion status of the task.")
  @JsonProperty("TaskStatus")
  public ResourceHealth getTaskStatus() {
    return taskStatus;
  }
  public void setTaskStatus(ResourceHealth taskStatus) {
    this.taskStatus = taskStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task100Task task100Task = (Task100Task) o;
    return Objects.equals(this.odataContext, task100Task.odataContext) &&
        Objects.equals(this.odataId, task100Task.odataId) &&
        Objects.equals(this.odataType, task100Task.odataType) &&
        Objects.equals(this.description, task100Task.description) &&
        Objects.equals(this.endTime, task100Task.endTime) &&
        Objects.equals(this.id, task100Task.id) &&
        Objects.equals(this.messages, task100Task.messages) &&
        Objects.equals(this.name, task100Task.name) &&
        Objects.equals(this.oem, task100Task.oem) &&
        Objects.equals(this.startTime, task100Task.startTime) &&
        Objects.equals(this.taskState, task100Task.taskState) &&
        Objects.equals(this.taskStatus, task100Task.taskStatus);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

