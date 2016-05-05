package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RackHDBootImageNetworkDevice;
import io.swagger.client.model.RackHDBootImageUsers;
import java.util.*;



/**
 * This is the base type for the boot image installation action.
 **/

@ApiModel(description = "This is the base type for the boot image installation action.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class RackHDBootImageBootImage   {
  
  private List<String> dnsServers = new ArrayList<String>();
  private String domain = null;
  private String hostname = null;
  private String installDisk = null;
  private List<RackHDBootImageNetworkDevice> networkDevices = new ArrayList<RackHDBootImageNetworkDevice>();


  public enum OsNameEnum {
    CENTOS("CentOS"),
    CENTOS_KVM("CentOS+KVM"),
    ESXI("ESXi"),
    RHEL("RHEL"),
    RHEL_KVM("RHEL+KVM");

    private String value;

    OsNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OsNameEnum osName = null;
  private String repo = null;
  private String rootPassword = null;
  private String rootSshKey = null;
  private List<RackHDBootImageUsers> users = new ArrayList<RackHDBootImageUsers>();
  private String version = null;

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("dnsServers")
  public List<String> getDnsServers() {
    return dnsServers;
  }
  public void setDnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("installDisk")
  public String getInstallDisk() {
    return installDisk;
  }
  public void setInstallDisk(String installDisk) {
    this.installDisk = installDisk;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("networkDevices")
  public List<RackHDBootImageNetworkDevice> getNetworkDevices() {
    return networkDevices;
  }
  public void setNetworkDevices(List<RackHDBootImageNetworkDevice> networkDevices) {
    this.networkDevices = networkDevices;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("osName")
  public OsNameEnum getOsName() {
    return osName;
  }
  public void setOsName(OsNameEnum osName) {
    this.osName = osName;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("repo")
  public String getRepo() {
    return repo;
  }
  public void setRepo(String repo) {
    this.repo = repo;
  }

  
  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("rootPassword")
  public String getRootPassword() {
    return rootPassword;
  }
  public void setRootPassword(String rootPassword) {
    this.rootPassword = rootPassword;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rootSshKey")
  public String getRootSshKey() {
    return rootSshKey;
  }
  public void setRootSshKey(String rootSshKey) {
    this.rootSshKey = rootSshKey;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("users")
  public List<RackHDBootImageUsers> getUsers() {
    return users;
  }
  public void setUsers(List<RackHDBootImageUsers> users) {
    this.users = users;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDBootImageBootImage rackHDBootImageBootImage = (RackHDBootImageBootImage) o;
    return Objects.equals(dnsServers, rackHDBootImageBootImage.dnsServers) &&
        Objects.equals(domain, rackHDBootImageBootImage.domain) &&
        Objects.equals(hostname, rackHDBootImageBootImage.hostname) &&
        Objects.equals(installDisk, rackHDBootImageBootImage.installDisk) &&
        Objects.equals(networkDevices, rackHDBootImageBootImage.networkDevices) &&
        Objects.equals(osName, rackHDBootImageBootImage.osName) &&
        Objects.equals(repo, rackHDBootImageBootImage.repo) &&
        Objects.equals(rootPassword, rackHDBootImageBootImage.rootPassword) &&
        Objects.equals(rootSshKey, rackHDBootImageBootImage.rootSshKey) &&
        Objects.equals(users, rackHDBootImageBootImage.users) &&
        Objects.equals(version, rackHDBootImageBootImage.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dnsServers, domain, hostname, installDisk, networkDevices, osName, repo, rootPassword, rootSshKey, users, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDBootImageBootImage {\n");
    
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    installDisk: ").append(toIndentedString(installDisk)).append("\n");
    sb.append("    networkDevices: ").append(toIndentedString(networkDevices)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    rootPassword: ").append(toIndentedString(rootPassword)).append("\n");
    sb.append("    rootSshKey: ").append(toIndentedString(rootSshKey)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

