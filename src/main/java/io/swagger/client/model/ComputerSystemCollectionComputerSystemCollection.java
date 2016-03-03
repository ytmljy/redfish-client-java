package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ComputerSystemComputerSystem;
import io.swagger.client.model.Odata400Context;
import io.swagger.client.model.Odata400Count;
import io.swagger.client.model.Odata400Id;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.Odata400Type;
import io.swagger.client.model.ResourceDescription;
import io.swagger.client.model.ResourceName;
import io.swagger.client.model.ResourceOem;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class ComputerSystemCollectionComputerSystemCollection   {
  
  private Odata400Context odataContext = null;
  private Odata400Id odataId = null;
  private Odata400Type odataType = null;
  private ResourceDescription description = null;
  private List<ComputerSystemComputerSystem> members = new ArrayList<ComputerSystemComputerSystem>();
  private Odata400Count membersodataCount = null;
  private Odata400IdRef membersodataNavigationLink = null;
  private ResourceName name = null;
  private ResourceOem oem = null;

  
  /**
   **/
  public ComputerSystemCollectionComputerSystemCollection odataContext(Odata400Context odataContext) {
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
  public ComputerSystemCollectionComputerSystemCollection odataId(Odata400Id odataId) {
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
  public ComputerSystemCollectionComputerSystemCollection odataType(Odata400Type odataType) {
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
  public ComputerSystemCollectionComputerSystemCollection description(ResourceDescription description) {
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
   * Contains the members of this collection.
   **/
  public ComputerSystemCollectionComputerSystemCollection members(List<ComputerSystemComputerSystem> members) {
    this.members = members;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains the members of this collection.")
  @JsonProperty("Members")
  public List<ComputerSystemComputerSystem> getMembers() {
    return members;
  }
  public void setMembers(List<ComputerSystemComputerSystem> members) {
    this.members = members;
  }

  
  /**
   **/
  public ComputerSystemCollectionComputerSystemCollection membersodataCount(Odata400Count membersodataCount) {
    this.membersodataCount = membersodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Members@odata.count")
  public Odata400Count getMembersodataCount() {
    return membersodataCount;
  }
  public void setMembersodataCount(Odata400Count membersodataCount) {
    this.membersodataCount = membersodataCount;
  }

  
  /**
   **/
  public ComputerSystemCollectionComputerSystemCollection membersodataNavigationLink(Odata400IdRef membersodataNavigationLink) {
    this.membersodataNavigationLink = membersodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Members@odata.navigationLink")
  public Odata400IdRef getMembersodataNavigationLink() {
    return membersodataNavigationLink;
  }
  public void setMembersodataNavigationLink(Odata400IdRef membersodataNavigationLink) {
    this.membersodataNavigationLink = membersodataNavigationLink;
  }

  
  /**
   **/
  public ComputerSystemCollectionComputerSystemCollection name(ResourceName name) {
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
  public ComputerSystemCollectionComputerSystemCollection oem(ResourceOem oem) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputerSystemCollectionComputerSystemCollection computerSystemCollectionComputerSystemCollection = (ComputerSystemCollectionComputerSystemCollection) o;
    return Objects.equals(this.odataContext, computerSystemCollectionComputerSystemCollection.odataContext) &&
        Objects.equals(this.odataId, computerSystemCollectionComputerSystemCollection.odataId) &&
        Objects.equals(this.odataType, computerSystemCollectionComputerSystemCollection.odataType) &&
        Objects.equals(this.description, computerSystemCollectionComputerSystemCollection.description) &&
        Objects.equals(this.members, computerSystemCollectionComputerSystemCollection.members) &&
        Objects.equals(this.membersodataCount, computerSystemCollectionComputerSystemCollection.membersodataCount) &&
        Objects.equals(this.membersodataNavigationLink, computerSystemCollectionComputerSystemCollection.membersodataNavigationLink) &&
        Objects.equals(this.name, computerSystemCollectionComputerSystemCollection.name) &&
        Objects.equals(this.oem, computerSystemCollectionComputerSystemCollection.oem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(odataContext, odataId, odataType, description, members, membersodataCount, membersodataNavigationLink, name, oem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputerSystemCollectionComputerSystemCollection {\n");
    
    sb.append("    odataContext: ").append(toIndentedString(odataContext)).append("\n");
    sb.append("    odataId: ").append(toIndentedString(odataId)).append("\n");
    sb.append("    odataType: ").append(toIndentedString(odataType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    membersodataCount: ").append(toIndentedString(membersodataCount)).append("\n");
    sb.append("    membersodataNavigationLink: ").append(toIndentedString(membersodataNavigationLink)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
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

