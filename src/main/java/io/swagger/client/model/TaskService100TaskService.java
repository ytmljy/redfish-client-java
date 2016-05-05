package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import io.swagger.client.model.TaskCollectionTaskCollection;
import java.util.Date;



/**
 * This is the schema definition for the Task Service.  It represents the properties for the service itself and has links to the actual list of tasks.
 **/

@ApiModel(description = "This is the schema definition for the Task Service.  It represents the properties for the service itself and has links to the actual list of tasks.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class TaskService100TaskService   {
  
  private String odataContext = null;
  private String odataId = null;
  private String odataType = null;


  public enum CompletedTaskOverWritePolicyEnum {
    MANUAL("Manual"),
    OLDEST("Oldest");

    private String value;

    CompletedTaskOverWritePolicyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CompletedTaskOverWritePolicyEnum completedTaskOverWritePolicy = null;
  private Date dateTime = null;
  private String description = null;
  private String id = null;
  private Boolean lifeCycleEventOnTaskStateChange = null;
  private String name = null;
  private ResourceOem oem = null;
  private Boolean serviceEnabled = null;
  private ResourceStatus status = null;
  private TaskCollectionTaskCollection tasks = null;

  
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
   * Overwrite policy of completed tasks
   **/
  
  @ApiModelProperty(value = "Overwrite policy of completed tasks")
  @JsonProperty("CompletedTaskOverWritePolicy")
  public CompletedTaskOverWritePolicyEnum getCompletedTaskOverWritePolicy() {
    return completedTaskOverWritePolicy;
  }
  public void setCompletedTaskOverWritePolicy(CompletedTaskOverWritePolicyEnum completedTaskOverWritePolicy) {
    this.completedTaskOverWritePolicy = completedTaskOverWritePolicy;
  }

  
  /**
   * The current DateTime (with offset) setting that the task service is using.
   **/
  
  @ApiModelProperty(value = "The current DateTime (with offset) setting that the task service is using.")
  @JsonProperty("DateTime")
  public Date getDateTime() {
    return dateTime;
  }
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
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
   * Send an Event upon Task State Change.
   **/
  
  @ApiModelProperty(value = "Send an Event upon Task State Change.")
  @JsonProperty("LifeCycleEventOnTaskStateChange")
  public Boolean getLifeCycleEventOnTaskStateChange() {
    return lifeCycleEventOnTaskStateChange;
  }
  public void setLifeCycleEventOnTaskStateChange(Boolean lifeCycleEventOnTaskStateChange) {
    this.lifeCycleEventOnTaskStateChange = lifeCycleEventOnTaskStateChange;
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
   * This indicates whether this service is enabled.
   **/
  
  @ApiModelProperty(value = "This indicates whether this service is enabled.")
  @JsonProperty("ServiceEnabled")
  public Boolean getServiceEnabled() {
    return serviceEnabled;
  }
  public void setServiceEnabled(Boolean serviceEnabled) {
    this.serviceEnabled = serviceEnabled;
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
   * References to the Tasks collection.
   **/
  
  @ApiModelProperty(value = "References to the Tasks collection.")
  @JsonProperty("Tasks")
  public TaskCollectionTaskCollection getTasks() {
    return tasks;
  }
  public void setTasks(TaskCollectionTaskCollection tasks) {
    this.tasks = tasks;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskService100TaskService taskService100TaskService = (TaskService100TaskService) o;
    return Objects.equals(odataContext, taskService100TaskService.odataContext) &&
        Objects.equals(odataId, taskService100TaskService.odataId) &&
        Objects.equals(odataType, taskService100TaskService.odataType) &&
        Objects.equals(completedTaskOverWritePolicy, taskService100TaskService.completedTaskOverWritePolicy) &&
        Objects.equals(dateTime, taskService100TaskService.dateTime) &&
        Objects.equals(description, taskService100TaskService.description) &&
        Objects.equals(id, taskService100TaskService.id) &&
        Objects.equals(lifeCycleEventOnTaskStateChange, taskService100TaskService.lifeCycleEventOnTaskStateChange) &&
        Objects.equals(name, taskService100TaskService.name) &&
        Objects.equals(oem, taskService100TaskService.oem) &&
        Objects.equals(serviceEnabled, taskService100TaskService.serviceEnabled) &&
        Objects.equals(status, taskService100TaskService.status) &&
        Objects.equals(tasks, taskService100TaskService.tasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, completedTaskOverWritePolicy, dateTime, description, id, lifeCycleEventOnTaskStateChange, name, oem, serviceEnabled, status, tasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskService100TaskService {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    completedTaskOverWritePolicy: ").append(toIndentedString(completedTaskOverWritePolicy)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lifeCycleEventOnTaskStateChange: ").append(toIndentedString(lifeCycleEventOnTaskStateChange)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    serviceEnabled: ").append(toIndentedString(serviceEnabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

