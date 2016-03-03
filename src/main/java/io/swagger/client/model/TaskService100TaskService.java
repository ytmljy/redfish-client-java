package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceId;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.TaskCollectionTaskCollection;
import io.swagger.client.model.TaskService100OverWritePolicy;



/**
 * This is the schema definition for the Task Service.  It represents the properties for the service itself and has links to the actual list of tasks.
 **/

@ApiModel(description = "This is the schema definition for the Task Service.  It represents the properties for the service itself and has links to the actual list of tasks.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class TaskService100TaskService   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private TaskService100OverWritePolicy completedTaskOverWritePolicy = null;
  private ResourceDescription description = null;
  private ResourceId id = null;
  private Boolean lifeCycleEventOnTaskStateChange = null;
  private ResourceName name = null;
  private ResourceOem oem = null;
  private ResourceStatus status = null;
  private TaskCollectionTaskCollection tasks = null;

  
  /**
   **/
  public TaskService100TaskService odataContext(Odata400Context odataContext) {
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
  public TaskService100TaskService odataId(Odata400Id odataId) {
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
  public TaskService100TaskService odataType(Odata400Type odataType) {
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
   * Overwrite policy of completed tasks
   **/
  public TaskService100TaskService completedTaskOverWritePolicy(TaskService100OverWritePolicy completedTaskOverWritePolicy) {
    this.completedTaskOverWritePolicy = completedTaskOverWritePolicy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overwrite policy of completed tasks")
  @JsonProperty("CompletedTaskOverWritePolicy")
  public TaskService100OverWritePolicy getCompletedTaskOverWritePolicy() {
    return completedTaskOverWritePolicy;
  }
  public void setCompletedTaskOverWritePolicy(TaskService100OverWritePolicy completedTaskOverWritePolicy) {
    this.completedTaskOverWritePolicy = completedTaskOverWritePolicy;
  }

  
  /**
   **/
  public TaskService100TaskService description(ResourceDescription description) {
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
  public TaskService100TaskService id(ResourceId id) {
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

  
  @ApiModelProperty(example = "null", value = "Send an Event upon Task State Change.")
  @JsonProperty("LifeCycleEventOnTaskStateChange")
  public Boolean getLifeCycleEventOnTaskStateChange() {
    return lifeCycleEventOnTaskStateChange;
  }

  
  /**
   **/
  public TaskService100TaskService name(ResourceName name) {
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
  public TaskService100TaskService oem(ResourceOem oem) {
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
   **/
  public TaskService100TaskService status(ResourceStatus status) {
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

  
  /**
   * References to the Tasks collection.
   **/
  public TaskService100TaskService tasks(TaskCollectionTaskCollection tasks) {
    this.tasks = tasks;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "References to the Tasks collection.")
  @JsonProperty("Tasks")
  public TaskCollectionTaskCollection getTasks() {
    return tasks;
  }
  public void setTasks(TaskCollectionTaskCollection tasks) {
    this.tasks = tasks;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskService100TaskService taskService100TaskService = (TaskService100TaskService) o;
    return Objects.equals(this.odataContext, taskService100TaskService.odataContext) &&
        Objects.equals(this.odataId, taskService100TaskService.odataId) &&
        Objects.equals(this.odataType, taskService100TaskService.odataType) &&
        Objects.equals(this.completedTaskOverWritePolicy, taskService100TaskService.completedTaskOverWritePolicy) &&
        Objects.equals(this.description, taskService100TaskService.description) &&
        Objects.equals(this.id, taskService100TaskService.id) &&
        Objects.equals(this.lifeCycleEventOnTaskStateChange, taskService100TaskService.lifeCycleEventOnTaskStateChange) &&
        Objects.equals(this.name, taskService100TaskService.name) &&
        Objects.equals(this.oem, taskService100TaskService.oem) &&
        Objects.equals(this.status, taskService100TaskService.status) &&
        Objects.equals(this.tasks, taskService100TaskService.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, completedTaskOverWritePolicy, description, id, lifeCycleEventOnTaskStateChange, name, oem, status, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskService100TaskService {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    completedTaskOverWritePolicy: ").append(toIndentedString(completedTaskOverWritePolicy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lifeCycleEventOnTaskStateChange: ").append(toIndentedString(lifeCycleEventOnTaskStateChange)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

