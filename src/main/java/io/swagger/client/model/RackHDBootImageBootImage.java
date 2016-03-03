package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.RackHDBootImageNetworkDevice;
import io.swagger.client.model.RackHDBootImageUsers;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class RackHDBootImageBootImage   {
  
  private String rootSshKey = null;
  private String domain = null;
  private List<RackHDBootImageUsers> users = new ArrayList<RackHDBootImageUsers>();
  private String hostname = null;


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
  private String version = null;
  private List<RackHDBootImageNetworkDevice> networkDevices = new ArrayList<RackHDBootImageNetworkDevice>();
  private String rootPassword = null;
  private List<String> dnsServers = new ArrayList<String>();
  private String installDisk = null;

  
  /**
   * This is the SshKey for the OS root account.
   **/
  public RackHDBootImageBootImage rootSshKey(String rootSshKey) {
    this.rootSshKey = rootSshKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the SshKey for the OS root account.")
  @JsonProperty("rootSshKey")
  public String getRootSshKey() {
    return rootSshKey;
  }
  public void setRootSshKey(String rootSshKey) {
    this.rootSshKey = rootSshKey;
  }

  
  /**
   * This is the domain for the target OS
   **/
  public RackHDBootImageBootImage domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is the domain for the target OS")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   * This is a list of user account information that will created after OS installation
   **/
  public RackHDBootImageBootImage users(List<RackHDBootImageUsers> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is a list of user account information that will created after OS installation")
  @JsonProperty("users")
  public List<RackHDBootImageUsers> getUsers() {
    return users;
  }
  public void setUsers(List<RackHDBootImageUsers> users) {
    this.users = users;
  }

  
  /**
   * The hostname for target OS.
   **/
  public RackHDBootImageBootImage hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The hostname for target OS.")
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  
  /**
   * Name of the target OS to be installed
   **/
  public RackHDBootImageBootImage osName(OsNameEnum osName) {
    this.osName = osName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the target OS to be installed")
  @JsonProperty("osName")
  public OsNameEnum getOsName() {
    return osName;
  }
  public void setOsName(OsNameEnum osName) {
    this.osName = osName;
  }

  
  /**
   * The external OS repository address, currently only supports HTTP
   **/
  public RackHDBootImageBootImage repo(String repo) {
    this.repo = repo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The external OS repository address, currently only supports HTTP")
  @JsonProperty("repo")
  public String getRepo() {
    return repo;
  }
  public void setRepo(String repo) {
    this.repo = repo;
  }

  
  /**
   * The version number of target OS that needs to install.
   **/
  public RackHDBootImageBootImage version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The version number of target OS that needs to install.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   * List of device names and static IP settings for network devices after OS installation.
   **/
  public RackHDBootImageBootImage networkDevices(List<RackHDBootImageNetworkDevice> networkDevices) {
    this.networkDevices = networkDevices;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of device names and static IP settings for network devices after OS installation.")
  @JsonProperty("networkDevices")
  public List<RackHDBootImageNetworkDevice> getNetworkDevices() {
    return networkDevices;
  }
  public void setNetworkDevices(List<RackHDBootImageNetworkDevice> networkDevices) {
    this.networkDevices = networkDevices;
  }

  
  /**
   * The password for the OS root account.
   **/
  public RackHDBootImageBootImage rootPassword(String rootPassword) {
    this.rootPassword = rootPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The password for the OS root account.")
  @JsonProperty("rootPassword")
  public String getRootPassword() {
    return rootPassword;
  }
  public void setRootPassword(String rootPassword) {
    this.rootPassword = rootPassword;
  }

  
  /**
   * This is a list of Domain Name Servers.
   **/
  public RackHDBootImageBootImage dnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "This is a list of Domain Name Servers.")
  @JsonProperty("dnsServers")
  public List<String> getDnsServers() {
    return dnsServers;
  }
  public void setDnsServers(List<String> dnsServers) {
    this.dnsServers = dnsServers;
  }

  
  /**
   **/
  public RackHDBootImageBootImage installDisk(String installDisk) {
    this.installDisk = installDisk;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("installDisk")
  public String getInstallDisk() {
    return installDisk;
  }
  public void setInstallDisk(String installDisk) {
    this.installDisk = installDisk;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RackHDBootImageBootImage rackHDBootImageBootImage = (RackHDBootImageBootImage) o;
    return Objects.equals(this.rootSshKey, rackHDBootImageBootImage.rootSshKey) &&
        Objects.equals(this.domain, rackHDBootImageBootImage.domain) &&
        Objects.equals(this.users, rackHDBootImageBootImage.users) &&
        Objects.equals(this.hostname, rackHDBootImageBootImage.hostname) &&
        Objects.equals(this.osName, rackHDBootImageBootImage.osName) &&
        Objects.equals(this.repo, rackHDBootImageBootImage.repo) &&
        Objects.equals(this.version, rackHDBootImageBootImage.version) &&
        Objects.equals(this.networkDevices, rackHDBootImageBootImage.networkDevices) &&
        Objects.equals(this.rootPassword, rackHDBootImageBootImage.rootPassword) &&
        Objects.equals(this.dnsServers, rackHDBootImageBootImage.dnsServers) &&
        Objects.equals(this.installDisk, rackHDBootImageBootImage.installDisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootSshKey, domain, users, hostname, osName, repo, version, networkDevices, rootPassword, dnsServers, installDisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RackHDBootImageBootImage {\n");
    
    sb.append("    rootSshKey: ").append(toIndentedString(rootSshKey)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
    sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    networkDevices: ").append(toIndentedString(networkDevices)).append("\n");
    sb.append("    rootPassword: ").append(toIndentedString(rootPassword)).append("\n");
    sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
    sb.append("    installDisk: ").append(toIndentedString(installDisk)).append("\n");
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

