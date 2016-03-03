package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Manager100ModifyRedundancySet   {
  
  private String target = null;
  private String title = null;

  
  /**
   * Link to invoke action
   **/
  public Manager100ModifyRedundancySet target(String target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Link to invoke action")
  @JsonProperty("target")
  public String getTarget() {
    return target;
  }
  public void setTarget(String target) {
    this.target = target;
  }

  
  /**
   * Friendly action name
   **/
  public Manager100ModifyRedundancySet title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Friendly action name")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Manager100ModifyRedundancySet manager100ModifyRedundancySet = (Manager100ModifyRedundancySet) o;
    return Objects.equals(this.target, manager100ModifyRedundancySet.target) &&
        Objects.equals(this.title, manager100ModifyRedundancySet.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Manager100ModifyRedundancySet {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

