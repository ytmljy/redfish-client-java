package io.swagger.client;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.datatype.joda.*;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.client.WebResource.Builder;

import com.sun.jersey.multipart.FormDataMultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;

import javax.ws.rs.core.Response.Status.Family;
import javax.ws.rs.core.MediaType;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

import java.net.URLEncoder;

import java.io.File;
import java.io.UnsupportedEncodingException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import io.swagger.client.auth.Authentication;
import io.swagger.client.auth.HttpBasicAuth;
import io.swagger.client.auth.ApiKeyAuth;
import io.swagger.client.auth.OAuth;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class ApiClient {
  private Map<String, Client> hostMap = new HashMap<String, Client>();
  private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
  private boolean debugging = false;
  private String basePath = "http://localhost/redfish/v1";
  private ObjectMapper mapper;

  private Map<String, Authentication> authentications;

  private int statusCode;
  private Map<String, List<String>> responseHeaders;

  private DateFormat dateFormat;

  public ApiClient() {
    mapper = new ObjectMapper();
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
    mapper.registerModule(new JodaModule());
  
    // Use RFC3339 format for date and datetime.
    // See http://xml2rfc.ietf.org/public/rfc/html/rfc3339.html#anchor14
    this.dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    // Use UTC as the default time zone.
    this.dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));

    this.mapper.setDateFormat((DateFormat) dateFormat.clone());

    // Set default User-Agent.
    setUserAgent("Java-Swagger");

    // Setup authentications (key: authentication name, value: authentication).
    authentications = new HashMap<String, Authentication>();
    // Prevent the authentications from being modified.
    authentications = Collections.unmodifiableMap(authentications);
  }

  public String getBasePath() {
    return basePath;
  }

  public ApiClient setBasePath(String basePath) {
    this.basePath = basePath;
    return this;
  }

  /**
   * Gets the status code of the previous request
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Gets the response headers of the previous request
   */
  public Map<String, List<String>> getResponseHeaders() {
    return responseHeaders;
  }

  /**
   * Get authentications (key: authentication name, value: authentication).
   */
  public Map<String, Authentication> getAuthentications() {
    return authentications;
  }

  /**
   * Get authentication for the given name.
   *
   * @param authName The authentication name
   * @return The authentication, null if not found
   */
  public Authentication getAuthentication(String authName) {
    return authentications.get(authName);
  }

  /**
   * Helper method to set username for the first HTTP basic authentication.
   */
  public void setUsername(String username) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setUsername(username);
        return;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set password for the first HTTP basic authentication.
   */
  public void setPassword(String password) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof HttpBasicAuth) {
        ((HttpBasicAuth) auth).setPassword(password);
        return;
      }
    }
    throw new RuntimeException("No HTTP basic authentication configured!");
  }

  /**
   * Helper method to set API key value for the first API key authentication.
   */
  public void setApiKey(String apiKey) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKey(apiKey);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to set API key prefix for the first API key authentication.
   */
  public void setApiKeyPrefix(String apiKeyPrefix) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof ApiKeyAuth) {
        ((ApiKeyAuth) auth).setApiKeyPrefix(apiKeyPrefix);
        return;
      }
    }
    throw new RuntimeException("No API key authentication configured!");
  }

  /**
   * Helper method to set access token for the first OAuth2 authentication.
   */
  public void setAccessToken(String accessToken) {
    for (Authentication auth : authentications.values()) {
      if (auth instanceof OAuth) {
        ((OAuth) auth).setAccessToken(accessToken);
        return;
      }
    }
    throw new RuntimeException("No OAuth2 authentication configured!");
  }

  /**
   * Set the User-Agent header's value (by adding to the default header map).
   */
  public ApiClient setUserAgent(String userAgent) {
    addDefaultHeader("User-Agent", userAgent);
    return this;
  }

  /**
   * Add a default header.
   *
   * @param key The header's key
   * @param value The header's value
   */
  public ApiClient addDefaultHeader(String key, String value) {
    defaultHeaderMap.put(key, value);
    return this;
  }

  /**
   * Check that whether debugging is enabled for this API client.
   */
  public boolean isDebugging() {
    return debugging;
  }

  /**
   * Enable/disable debugging for this API client.
   *
   * @param debugging To enable (true) or disable (false) debugging
   */
  public ApiClient setDebugging(boolean debugging) {
    this.debugging = debugging;
    return this;
  }

  /**
   * Get the date format used to parse/format date parameters.
   */
  public DateFormat getDateFormat() {
    return dateFormat;
  }

  /**
   * Set the date format used to parse/format date parameters.
   */
  public ApiClient setDateFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
    // also set the date format for model (de)serialization with Date properties
    this.mapper.setDateFormat((DateFormat) dateFormat.clone());
    return this;
  }

  /**
   * Parse the given string into Date object.
   */
  public Date parseDate(String str) {
    try {
      return dateFormat.parse(str);
    } catch (java.text.ParseException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Format the given Date object into string.
   */
  public String formatDate(Date date) {
    return dateFormat.format(date);
  }

  /**
   * Format the given parameter object into string.
   */
  public String parameterToString(Object param) {
    if (param == null) {
      return "";
    } else if (param instanceof Date) {
      return formatDate((Date) param);
    } else if (param instanceof Collection) {
      StringBuilder b = new StringBuilder();
      for(Object o : (Collection<?>)param) {
        if(b.length() > 0) {
          b.append(",");
        }
        b.append(String.valueOf(o));
      }
      return b.toString();
    } else {
      return String.valueOf(param);
    }
  }

  /*
    Format to {@code Pair} objects.
  */
  public List<Pair> parameterToPairs(String collectionFormat, String name, Object value){
    List<Pair> params = new ArrayList<Pair>();

    // preconditions
    if (name == null || name.isEmpty() || value == null) return params;

    Collection<?> valueCollection = null;
    if (value instanceof Collection<?>) {
      valueCollection = (Collection<?>) value;
    } else {
      params.add(new Pair(name, parameterToString(value)));
      return params;
    }

    if (valueCollection.isEmpty()){
      return params;
    }

    // get the collection format
    collectionFormat = (collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat); // default: csv

    // create the params based on the collection format
    if (collectionFormat.equals("multi")) {
      for (Object item : valueCollection) {
        params.add(new Pair(name, parameterToString(item)));
      }

      return params;
    }

    String delimiter = ",";

    if (collectionFormat.equals("csv")) {
      delimiter = ",";
    } else if (collectionFormat.equals("ssv")) {
      delimiter = " ";
    } else if (collectionFormat.equals("tsv")) {
      delimiter = "\t";
    } else if (collectionFormat.equals("pipes")) {
      delimiter = "|";
    }

    StringBuilder sb = new StringBuilder() ;
    for (Object item : valueCollection) {
      sb.append(delimiter);
      sb.append(parameterToString(item));
    }

    params.add(new Pair(name, sb.substring(1)));

    return params;
  }

  /**
   * Check if the given MIME is a JSON MIME.
   * JSON MIME examples:
   *   application/json
   *   application/json; charset=UTF8
   *   APPLICATION/JSON
   */
  public boolean isJsonMime(String mime) {
    return mime != null && mime.matches("(?i)application\\/json(;.*)?");
  }

  /**
   * Select the Accept header's value from the given accepts array:
   *   if JSON exists in the given array, use it;
   *   otherwise use all of them (joining into a string)
   *
   * @param accepts The accepts array to select from
   * @return The Accept header to use. If the given array is empty,
   *   null will be returned (not to set the Accept header explicitly).
   */
  public String selectHeaderAccept(String[] accepts) {
    if (accepts.length == 0) {
      return null;
    }
    for (String accept : accepts) {
      if (isJsonMime(accept)) {
        return accept;
      }
    }
    return StringUtil.join(accepts, ",");
  }

  /**
   * Select the Content-Type header's value from the given array:
   *   if JSON exists in the given array, use it;
   *   otherwise use the first one of the array.
   *
   * @param contentTypes The Content-Type array to select from
   * @return The Content-Type header to use. If the given array is empty,
   *   JSON will be used.
   */
  public String selectHeaderContentType(String[] contentTypes) {
    if (contentTypes.length == 0) {
      return "application/json";
    }
    for (String contentType : contentTypes) {
      if (isJsonMime(contentType)) {
        return contentType;
      }
    }
    return contentTypes[0];
  }

  /**
   * Escape the given string to be used as URL query value.
   */
  public String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }

  /**
   * Serialize the given Java object into string according the given
   * Content-Type (only JSON is supported for now).
   */
  public Object serialize(Object obj, String contentType, Map<String, Object> formParams) throws ApiException {
    if (contentType.startsWith("multipart/form-data")) {
      FormDataMultiPart mp = new FormDataMultiPart();
      for (Entry<String, Object> param: formParams.entrySet()) {
        if (param.getValue() instanceof File) {
          File file = (File) param.getValue();
          mp.bodyPart(new FileDataBodyPart(param.getKey(), file, MediaType.MULTIPART_FORM_DATA_TYPE));
        } else {
          mp.field(param.getKey(), parameterToString(param.getValue()), MediaType.MULTIPART_FORM_DATA_TYPE);
        }
      }
      return mp;
    } else if (contentType.startsWith("application/x-www-form-urlencoded")) {
      return this.getXWWWFormUrlencodedParams(formParams);
    } else {
      // We let Jersey attempt to serialize the body
      return obj;
    }
  }

  private ClientResponse getAPIResponse(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames) throws ApiException {

    if (body != null && !formParams.isEmpty()){
      throw new ApiException(500, "Cannot have body and form params");
    }

    updateParamsForAuth(authNames, queryParams, headerParams);

    Client client = getClient();

    StringBuilder b = new StringBuilder();
    b.append("?");
    if (queryParams != null){
      for (Pair queryParam : queryParams){
        if (!queryParam.getName().isEmpty()) {
          b.append(escapeString(queryParam.getName()));
          b.append("=");
          b.append(escapeString(queryParam.getValue()));
          b.append("&");
        }
      }
    }

    String querystring = b.substring(0, b.length() - 1);

    Builder builder;
    if (accept == null)
      builder = client.resource(basePath + path + querystring).getRequestBuilder();
    else
      builder = client.resource(basePath + path + querystring).accept(accept);

    for (String key : headerParams.keySet()) {
      builder = builder.header(key, headerParams.get(key));
    }
    for (String key : defaultHeaderMap.keySet()) {
      if (!headerParams.containsKey(key)) {
        builder = builder.header(key, defaultHeaderMap.get(key));
      }
    }

    ClientResponse response = null;

    if ("GET".equals(method)) {
      response = (ClientResponse) builder.get(ClientResponse.class);
    } else if ("POST".equals(method)) {
      response = builder.type(contentType).post(ClientResponse.class, serialize(body, contentType, formParams));
    } else if ("PUT".equals(method)) {
      response = builder.type(contentType).put(ClientResponse.class, serialize(body, contentType, formParams));
    } else if ("DELETE".equals(method)) {
      response = builder.type(contentType).delete(ClientResponse.class, serialize(body, contentType, formParams));
    } else {
      throw new ApiException(500, "unknown method type " + method);
    }
    return response;
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param path The sub-path of the HTTP URL
   * @param method The request method, one of "GET", "POST", "PUT", and "DELETE"
   * @param queryParams The query parameters
   * @param body The request body object - if it is not binary, otherwise null
   * @param headerParams The header parameters
   * @param formParams The form parameters
   * @param accept The request's Accept header
   * @param contentType The request's Content-Type header
   * @param authNames The authentications to apply
   * @return The response body in type of string
   */
   public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames, GenericType<T> returnType)
           throws ApiException {
    ClientResponse response = getAPIResponse(path, method, queryParams, body, headerParams, formParams, accept, contentType, authNames);

    statusCode = response.getStatusInfo().getStatusCode();
    responseHeaders = response.getHeaders();

//    System.out.println(response);
/*
    if( response.getEntityInputStream() != null ) {
      try {
        byte[] responseData = IOUtils.readFully(response.getEntityInputStream(), response.getLength());
        System.out.println("======================================================================================");
        System.out.println(new String(responseData));
        System.out.println("======================================================================================");
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
*/
    if(response.getStatusInfo() == ClientResponse.Status.NO_CONTENT) {
      return null;
    } else if (response.getStatusInfo().getFamily() == Family.SUCCESSFUL) {
      if (returnType == null)
        return null;
      else
        return response.getEntity(returnType);
    } else {
      String message = "error";
      String respBody = null;
      if (response.hasEntity()) {
        try {
          respBody = response.getEntity(String.class);
          message = respBody;
        } catch (RuntimeException e) {
          // e.printStackTrace();
        }
      }
      throw new ApiException(
        response.getStatusInfo().getStatusCode(),
        message,
        response.getHeaders(),
        respBody);
    }
  }

  /**
   * Update query and header parameters based on authentication settings.
   *
   * @param authNames The authentications to apply
   */
  private void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams) {
    for (String authName : authNames) {
      Authentication auth = authentications.get(authName);
      if (auth == null) throw new RuntimeException("Authentication undefined: " + authName);
      auth.applyToParams(queryParams, headerParams);
    }
  }

  /**
   * Encode the given form parameters as request body.
   */
  private String getXWWWFormUrlencodedParams(Map<String, Object> formParams) {
    StringBuilder formParamBuilder = new StringBuilder();

    for (Entry<String, Object> param : formParams.entrySet()) {
      String valueStr = parameterToString(param.getValue());
      try {
        formParamBuilder.append(URLEncoder.encode(param.getKey(), "utf8"))
            .append("=")
            .append(URLEncoder.encode(valueStr, "utf8"));
        formParamBuilder.append("&");
      } catch (UnsupportedEncodingException e) {
        // move on to next
      }
    }

    String encodedFormParams = formParamBuilder.toString();
    if (encodedFormParams.endsWith("&")) {
      encodedFormParams = encodedFormParams.substring(0, encodedFormParams.length() - 1);
    }

    return encodedFormParams;
  }

  /**
   * Get an existing client or create a new client to handle HTTP request.
   */
  private Client getClient() {
    if(!hostMap.containsKey(basePath)) {
      // Add the JSON serialization support to Jersey
      JacksonJsonProvider jsonProvider = new JacksonJsonProvider(mapper);
      DefaultClientConfig conf = new DefaultClientConfig();
      conf.getSingletons().add(jsonProvider);
      Client client = Client.create(conf);
      if (debugging)
        client.addFilter(new LoggingFilter());
      hostMap.put(basePath, client);
    }
    return hostMap.get(basePath);
  }
}
