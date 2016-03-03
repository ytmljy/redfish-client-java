package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Power100PowerLimitException;



/**
 * This object contains power limit status and configuration information for the chassis.
 **/

@ApiModel(description = "This object contains power limit status and configuration information for the chassis.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Power100PowerLimit   {
  
  private Power100PowerLimitException limitException = null;

  
  /**
   * The action that is taken if the power cannot be maintained below the LimitInWatts.
   **/
  public Power100PowerLimit limitException(Power100PowerLimitException limitException) {
    this.limitException = limitException;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action that is taken if the power cannot be maintained below the LimitInWatts.")
  @JsonProperty("LimitException")
  public Power100PowerLimitException getLimitException() {
    return limitException;
  }
  public void setLimitException(Power100PowerLimitException limitException) {
    this.limitException = limitException;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Power100PowerLimit power100PowerLimit = (Power100PowerLimit) o;
    return Objects.equals(this.limitException, power100PowerLimit.limitException);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitException);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Power100PowerLimit {\n");
    
    sb.append("    limitException: ").append(toIndentedString(limitException)).append("\n");
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

