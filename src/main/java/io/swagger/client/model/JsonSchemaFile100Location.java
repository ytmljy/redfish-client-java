package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class JsonSchemaFile100Location   {
  
  private String archiveFile = null;
  private String archiveUri = null;
  private String language = null;
  private String publicationUri = null;
  private String uri = null;

  
  /**
   * If the schema is hosted on the service in an archive file, this is the name of the file within the archive.
   **/
  
  @ApiModelProperty(value = "If the schema is hosted on the service in an archive file, this is the name of the file within the archive.")
  @JsonProperty("ArchiveFile")
  public String getArchiveFile() {
    return archiveFile;
  }
  public void setArchiveFile(String archiveFile) {
    this.archiveFile = archiveFile;
  }

  
  /**
   * If the schema is hosted on the service in an archive file, this is the link to the archive file.
   **/
  
  @ApiModelProperty(value = "If the schema is hosted on the service in an archive file, this is the link to the archive file.")
  @JsonProperty("ArchiveUri")
  public String getArchiveUri() {
    return archiveUri;
  }
  public void setArchiveUri(String archiveUri) {
    this.archiveUri = archiveUri;
  }

  
  /**
   * The language code for the file the schema is in.
   **/
  
  @ApiModelProperty(value = "The language code for the file the schema is in.")
  @JsonProperty("Language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  
  /**
   * Link to publicly available (canonical) URI for schema.
   **/
  
  @ApiModelProperty(value = "Link to publicly available (canonical) URI for schema.")
  @JsonProperty("PublicationUri")
  public String getPublicationUri() {
    return publicationUri;
  }
  public void setPublicationUri(String publicationUri) {
    this.publicationUri = publicationUri;
  }

  
  /**
   * Link to locally available URI for schema.
   **/
  
  @ApiModelProperty(value = "Link to locally available URI for schema.")
  @JsonProperty("Uri")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaFile100Location jsonSchemaFile100Location = (JsonSchemaFile100Location) o;
    return Objects.equals(archiveFile, jsonSchemaFile100Location.archiveFile) &&
        Objects.equals(archiveUri, jsonSchemaFile100Location.archiveUri) &&
        Objects.equals(language, jsonSchemaFile100Location.language) &&
        Objects.equals(publicationUri, jsonSchemaFile100Location.publicationUri) &&
        Objects.equals(uri, jsonSchemaFile100Location.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveFile, archiveUri, language, publicationUri, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaFile100Location {\n");
    
    sb.append("    archiveFile: ").append(toIndentedString(archiveFile)).append("\n");
    sb.append("    archiveUri: ").append(toIndentedString(archiveUri)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    publicationUri: ").append(toIndentedString(publicationUri)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

