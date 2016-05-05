package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ServiceRoot100ServiceRoot;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.AccountService100AccountService;
import io.swagger.client.model.ManagerAccountCollectionManagerAccountCollection;
import io.swagger.client.model.ManagerAccount100ManagerAccount;
import io.swagger.client.model.RoleCollectionRoleCollection;
import io.swagger.client.model.Role100Role;
import io.swagger.client.model.ChassisCollectionChassisCollection;
import io.swagger.client.model.Chassis100Chassis;
import io.swagger.client.model.Power100Power;
import io.swagger.client.model.Thermal100Thermal;
import io.swagger.client.model.EventService100EventService;
import io.swagger.client.model.Body;
import io.swagger.client.model.EventDestinationCollectionEventDestinationCollection;
import io.swagger.client.model.EventDestination100EventDestination;
import io.swagger.client.model.ManagerCollectionManagerCollection;
import io.swagger.client.model.Manager100Manager;
import io.swagger.client.model.EthernetInterfaceCollectionEthernetInterfaceCollection;
import io.swagger.client.model.EthernetInterface100EthernetInterface;
import io.swagger.client.model.SerialInterface100SerialInterface;
import io.swagger.client.model.VirtualMedia100VirtualMedia;
import io.swagger.client.model.MessageRegistryFileCollectionMessageRegistryFileCollection;
import io.swagger.client.model.MessageRegistryFile100MessageRegistryFile;
import io.swagger.client.model.JsonSchemaFile100JsonSchemaFile;
import io.swagger.client.model.JsonSchemaFileCollectionJsonSchemaFileCollection;
import io.swagger.client.model.SessionService100SessionService;
import io.swagger.client.model.SessionCollectionSessionCollection;
import io.swagger.client.model.Session100Session;
import io.swagger.client.model.ComputerSystemCollectionComputerSystemCollection;
import io.swagger.client.model.ComputerSystem100ComputerSystem;
import io.swagger.client.model.RackHDResetActionResetAction;
import io.swagger.client.model.RackHDBootImageBootImageList;
import io.swagger.client.model.RackHDBootImageBootImage;
import io.swagger.client.model.LogServiceCollectionLogServiceCollection;
import io.swagger.client.model.LogService100LogService;
import io.swagger.client.model.LogEntryCollectionLogEntryCollection;
import io.swagger.client.model.LogEntry100LogEntry;
import io.swagger.client.model.ProcessorCollectionProcessorCollection;
import io.swagger.client.model.Processor100Processor;
import io.swagger.client.model.SimpleStorageCollectionSimpleStorageCollection;
import io.swagger.client.model.SimpleStorage100SimpleStorage;
import io.swagger.client.model.TaskService100TaskService;
import io.swagger.client.model.TaskCollectionTaskCollection;
import io.swagger.client.model.Task100Task;

import java.util.*;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-05-05T13:18:34.727-04:00")
public class RedfishvApi {
  private ApiClient apiClient;

  public RedfishvApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RedfishvApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * retrieve list of root-level resources
   * This object represents the root Redfish service.  All values for resources described  by this schema shall comply to the requirements as described in the Redfish specification. This object represents the root Redfish service.
   * @return ServiceRoot100ServiceRoot
   */
  public ServiceRoot100ServiceRoot getServiceRoot() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ServiceRoot100ServiceRoot> returnType = new GenericType<ServiceRoot100ServiceRoot>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve account service information
   * 
   * @return AccountService100AccountService
   */
  public AccountService100AccountService getAccountService() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/AccountService".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<AccountService100AccountService> returnType = new GenericType<AccountService100AccountService>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve information about the accounts
   * 
   * @return ManagerAccountCollectionManagerAccountCollection
   */
  public ManagerAccountCollectionManagerAccountCollection getAccounts() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/AccountService/Accounts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ManagerAccountCollectionManagerAccountCollection> returnType = new GenericType<ManagerAccountCollectionManagerAccountCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * create a user with the provided information
   * 
   * @param payload 
   * @return void
   */
  public void createAccount(ManagerAccount100ManagerAccount payload) throws ApiException {
    Object postBody = payload;
    
     // verify the required parameter 'payload' is set
     if (payload == null) {
        throw new ApiException(400, "Missing the required parameter 'payload' when calling createAccount");
     }
     
    // create path and map variables
    String path = "/AccountService/Accounts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * retrieve information about the specified account
   * 
   * @param name 
   * @return ManagerAccount100ManagerAccount
   */
  public ManagerAccount100ManagerAccount getAccount(String name) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'name' is set
     if (name == null) {
        throw new ApiException(400, "Missing the required parameter 'name' when calling getAccount");
     }
     
    // create path and map variables
    String path = "/AccountService/Accounts/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ManagerAccount100ManagerAccount> returnType = new GenericType<ManagerAccount100ManagerAccount>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * delete the specified account
   * 
   * @param name 
   * @return void
   */
  public void removeAccount(String name) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'name' is set
     if (name == null) {
        throw new ApiException(400, "Missing the required parameter 'name' when calling removeAccount");
     }
     
    // create path and map variables
    String path = "/AccountService/Accounts/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * update the user with the provided information
   * 
   * @param name 
   * @param payload 
   * @return void
   */
  public void modifyAccount(String name, ManagerAccount100ManagerAccount payload) throws ApiException {
    Object postBody = payload;
    
     // verify the required parameter 'name' is set
     if (name == null) {
        throw new ApiException(400, "Missing the required parameter 'name' when calling modifyAccount");
     }
     
     // verify the required parameter 'payload' is set
     if (payload == null) {
        throw new ApiException(400, "Missing the required parameter 'payload' when calling modifyAccount");
     }
     
    // create path and map variables
    String path = "/AccountService/Accounts/{name}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "PATCH", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * retrieve list of roles
   * 
   * @return RoleCollectionRoleCollection
   */
  public RoleCollectionRoleCollection listRoles() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/AccountService/Roles".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<RoleCollectionRoleCollection> returnType = new GenericType<RoleCollectionRoleCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve privileges for a role
   * 
   * @param identifier 
   * @return Role100Role
   */
  public Role100Role getRole(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getRole");
     }
     
    // create path and map variables
    String path = "/AccountService/Roles/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Role100Role> returnType = new GenericType<Role100Role>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of physical components
   * Defines a collection of physical components managed by the service
   * @return ChassisCollectionChassisCollection
   */
  public ChassisCollectionChassisCollection listChassis() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Chassis".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ChassisCollectionChassisCollection> returnType = new GenericType<ChassisCollectionChassisCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve specific information for a physical component
   * Retrieves a detailed information catalog for the physical component  specified by identifier
   * @param identifier 
   * @return Chassis100Chassis
   */
  public Chassis100Chassis getChassis(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getChassis");
     }
     
    // create path and map variables
    String path = "/Chassis/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Chassis100Chassis> returnType = new GenericType<Chassis100Chassis>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retrieve power characteristics of a chassis
   * defines a collection of power elements contained within a resource.
   * @param identifier 
   * @return Power100Power
   */
  public Power100Power getPower(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getPower");
     }
     
    // create path and map variables
    String path = "/Chassis/{identifier}/Power".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Power100Power> returnType = new GenericType<Power100Power>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retrieve thermal characteristics of a chassis
   * defines a collection of thermal elements contained within a resource.
   * @param identifier 
   * @return Thermal100Thermal
   */
  public Thermal100Thermal getThermal(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getThermal");
     }
     
    // create path and map variables
    String path = "/Chassis/{identifier}/Thermal".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Thermal100Thermal> returnType = new GenericType<Thermal100Thermal>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of policies used by event service listeners
   * 
   * @return EventService100EventService
   */
  public EventService100EventService eventServiceRoot() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/EventService".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<EventService100EventService> returnType = new GenericType<EventService100EventService>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * submit a test event action
   * 
   * @param body 
   * @return void
   */
  public void testEvent(Body body) throws ApiException {
    Object postBody = body;
    
    // create path and map variables
    String path = "/EventService/Actions/EventService.SubmitTestEvent".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * retrieve collection of subscribed events
   * 
   * @return EventDestinationCollectionEventDestinationCollection
   */
  public EventDestinationCollectionEventDestinationCollection getEventsCollection() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/EventService/Subscriptions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<EventDestinationCollectionEventDestinationCollection> returnType = new GenericType<EventDestinationCollectionEventDestinationCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve collection of subscribed events
   * 
   * @param payload 
   * @return EventDestinationCollectionEventDestinationCollection
   */
  public EventDestinationCollectionEventDestinationCollection createSubscription(EventDestination100EventDestination payload) throws ApiException {
    Object postBody = payload;
    
     // verify the required parameter 'payload' is set
     if (payload == null) {
        throw new ApiException(400, "Missing the required parameter 'payload' when calling createSubscription");
     }
     
    // create path and map variables
    String path = "/EventService/Subscriptions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<EventDestinationCollectionEventDestinationCollection> returnType = new GenericType<EventDestinationCollectionEventDestinationCollection>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve specific event subscription
   * 
   * @param index 
   * @return EventDestination100EventDestination
   */
  public EventDestination100EventDestination getEvent(String index) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'index' is set
     if (index == null) {
        throw new ApiException(400, "Missing the required parameter 'index' when calling getEvent");
     }
     
    // create path and map variables
    String path = "/EventService/Subscriptions/{index}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<EventDestination100EventDestination> returnType = new GenericType<EventDestination100EventDestination>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * delete specific event subscription
   * 
   * @param index 
   * @return void
   */
  public void deleteEvent(String index) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'index' is set
     if (index == null) {
        throw new ApiException(400, "Missing the required parameter 'index' when calling deleteEvent");
     }
     
    // create path and map variables
    String path = "/EventService/Subscriptions/{index}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * retrieve list of management servers
   * 
   * @return ManagerCollectionManagerCollection
   */
  public ManagerCollectionManagerCollection listManagers() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Managers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ManagerCollectionManagerCollection> returnType = new GenericType<ManagerCollectionManagerCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of management servers
   * 
   * @param identifier 
   * @return Manager100Manager
   */
  public Manager100Manager getManager(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getManager");
     }
     
    // create path and map variables
    String path = "/Managers/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Manager100Manager> returnType = new GenericType<Manager100Manager>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve information about the ethernet interfaces
   * 
   * @param identifier 
   * @return EthernetInterfaceCollectionEthernetInterfaceCollection
   */
  public EthernetInterfaceCollectionEthernetInterfaceCollection listManagerEthernetInterfaces(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling listManagerEthernetInterfaces");
     }
     
    // create path and map variables
    String path = "/Managers/{identifier}/EthernetInterfaces".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<EthernetInterfaceCollectionEthernetInterfaceCollection> returnType = new GenericType<EthernetInterfaceCollectionEthernetInterfaceCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve information about the specified ethernet interface
   * 
   * @param identifier 
   * @param index 
   * @return EthernetInterface100EthernetInterface
   */
  public EthernetInterface100EthernetInterface getManagerEthernetInterface(String identifier, String index) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getManagerEthernetInterface");
     }
     
     // verify the required parameter 'index' is set
     if (index == null) {
        throw new ApiException(400, "Missing the required parameter 'index' when calling getManagerEthernetInterface");
     }
     
    // create path and map variables
    String path = "/Managers/{identifier}/EthernetInterfaces/{index}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<EthernetInterface100EthernetInterface> returnType = new GenericType<EthernetInterface100EthernetInterface>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve information about the serial interface
   * 
   * @param identifier 
   * @param index 
   * @return SerialInterface100SerialInterface
   */
  public SerialInterface100SerialInterface unimplemented(String identifier, String index) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented");
     }
     
     // verify the required parameter 'index' is set
     if (index == null) {
        throw new ApiException(400, "Missing the required parameter 'index' when calling unimplemented");
     }
     
    // create path and map variables
    String path = "/Managers/{identifier}/SerialInterfaces/{index}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<SerialInterface100SerialInterface> returnType = new GenericType<SerialInterface100SerialInterface>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve information about the virtual media
   * 
   * @param identifier 
   * @param index 
   * @return VirtualMedia100VirtualMedia
   */
  public VirtualMedia100VirtualMedia unimplemented_0(String identifier, String index) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_0");
     }
     
     // verify the required parameter 'index' is set
     if (index == null) {
        throw new ApiException(400, "Missing the required parameter 'index' when calling unimplemented_0");
     }
     
    // create path and map variables
    String path = "/Managers/{identifier}/VirtualMedia/{index}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<VirtualMedia100VirtualMedia> returnType = new GenericType<VirtualMedia100VirtualMedia>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retrieve list of registries
   * 
   * @return MessageRegistryFileCollectionMessageRegistryFileCollection
   */
  public MessageRegistryFileCollectionMessageRegistryFileCollection listRegistry() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Registries".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<MessageRegistryFileCollectionMessageRegistryFileCollection> returnType = new GenericType<MessageRegistryFileCollectionMessageRegistryFileCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve the content of a specific registry
   * 
   * @param identifier 
   * @return MessageRegistryFile100MessageRegistryFile
   */
  public MessageRegistryFile100MessageRegistryFile getRegistryFileContents(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getRegistryFileContents");
     }
     
    // create path and map variables
    String path = "/Registries/en/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<MessageRegistryFile100MessageRegistryFile> returnType = new GenericType<MessageRegistryFile100MessageRegistryFile>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retrieve information on a specific registry
   * 
   * @param identifier 
   * @return MessageRegistryFile100MessageRegistryFile
   */
  public MessageRegistryFile100MessageRegistryFile getRegistryFile(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getRegistryFile");
     }
     
    // create path and map variables
    String path = "/Registries/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<MessageRegistryFile100MessageRegistryFile> returnType = new GenericType<MessageRegistryFile100MessageRegistryFile>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * display the content of a schema json
   * 
   * @param identifier 
   * @return JsonSchemaFile100JsonSchemaFile
   */
  public JsonSchemaFile100JsonSchemaFile getSchemaContent(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSchemaContent");
     }
     
    // create path and map variables
    String path = "/SchemaStore/en/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<JsonSchemaFile100JsonSchemaFile> returnType = new GenericType<JsonSchemaFile100JsonSchemaFile>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of schemas
   * 
   * @return JsonSchemaFileCollectionJsonSchemaFileCollection
   */
  public JsonSchemaFileCollectionJsonSchemaFileCollection listSchemas() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Schemas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<JsonSchemaFileCollectionJsonSchemaFileCollection> returnType = new GenericType<JsonSchemaFileCollectionJsonSchemaFileCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve information for a specific schema
   * 
   * @param identifier 
   * @return JsonSchemaFile100JsonSchemaFile
   */
  public JsonSchemaFile100JsonSchemaFile getSchema(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSchema");
     }
     
    // create path and map variables
    String path = "/Schemas/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<JsonSchemaFile100JsonSchemaFile> returnType = new GenericType<JsonSchemaFile100JsonSchemaFile>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve a list of sessions
   * 
   * @return SessionService100SessionService
   */
  public SessionService100SessionService getSessionService() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/SessionService".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<SessionService100SessionService> returnType = new GenericType<SessionService100SessionService>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve a sessions description
   * 
   * @return SessionCollectionSessionCollection
   */
  public SessionCollectionSessionCollection getSessions() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/SessionService/Sessions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<SessionCollectionSessionCollection> returnType = new GenericType<SessionCollectionSessionCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * create a new session
   * 
   * @param payload 
   * @return Session100Session
   */
  public Session100Session postSession(Session100Session payload) throws ApiException {
    Object postBody = payload;
    
     // verify the required parameter 'payload' is set
     if (payload == null) {
        throw new ApiException(400, "Missing the required parameter 'payload' when calling postSession");
     }
     
    // create path and map variables
    String path = "/SessionService/Sessions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Session100Session> returnType = new GenericType<Session100Session>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve session information
   * 
   * @param identifier 
   * @return Session100Session
   */
  public Session100Session getSessionInfo(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSessionInfo");
     }
     
    // create path and map variables
    String path = "/SessionService/Sessions/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Session100Session> returnType = new GenericType<Session100Session>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * logout of the session
   * 
   * @param identifier 
   * @return Session100Session
   */
  public Session100Session doLogoutSession(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling doLogoutSession");
     }
     
    // create path and map variables
    String path = "/SessionService/Sessions/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Session100Session> returnType = new GenericType<Session100Session>() {};
    return apiClient.invokeAPI(path, "DELETE", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of computer systems
   * retrieve list of computer systems
   * @return ComputerSystemCollectionComputerSystemCollection
   */
  public ComputerSystemCollectionComputerSystemCollection listSystems() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/Systems".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ComputerSystemCollectionComputerSystemCollection> returnType = new GenericType<ComputerSystemCollectionComputerSystemCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve information for a specific computer systems (physical and/or virtual)
   * defines a computer system and its respective properties.  A computer system represents a  machine (physical or virtual) and the local resources such as memory, cpu and other  devices that can be accessed from that machine.
   * @param identifier node identifier
   * @return ComputerSystem100ComputerSystem
   */
  public ComputerSystem100ComputerSystem getSystem(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSystem");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ComputerSystem100ComputerSystem> returnType = new GenericType<ComputerSystem100ComputerSystem>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve the list of reset types for the specified compute node
   * Retrieve  a list of valid reset types for the system described by identifier
   * @param identifier 
   * @return RackHDResetActionResetAction
   */
  public RackHDResetActionResetAction listResetTypes(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling listResetTypes");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/Actions/ComputerSystem.Reset".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<RackHDResetActionResetAction> returnType = new GenericType<RackHDResetActionResetAction>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * reset a node
   * Perform the reset specified in the post data arguments on the system described by identifier
   * @param identifier 
   * @param payload 
   * @return void
   */
  public void doReset(String identifier, RackHDResetActionResetAction payload) throws ApiException {
    Object postBody = payload;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling doReset");
     }
     
     // verify the required parameter 'payload' is set
     if (payload == null) {
        throw new ApiException(400, "Missing the required parameter 'payload' when calling doReset");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/Actions/ComputerSystem.Reset".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * retrieve the list of boot image types for the specified compute node
   * Retrieve  a list of valid boot image types for the system described by identifier
   * @param identifier 
   * @return RackHDBootImageBootImageList
   */
  public RackHDBootImageBootImageList listBootImage(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling listBootImage");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/Actions/RackHD.BootImage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<RackHDBootImageBootImageList> returnType = new GenericType<RackHDBootImageBootImageList>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * install a boot image on a node
   * Perform the boot image installation specified in the post data arguments on  the system described by identifier
   * @param identifier 
   * @param payload 
   * @return void
   */
  public void doBootImage(String identifier, RackHDBootImageBootImage payload) throws ApiException {
    Object postBody = payload;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling doBootImage");
     }
     
     // verify the required parameter 'payload' is set
     if (payload == null) {
        throw new ApiException(400, "Missing the required parameter 'payload' when calling doBootImage");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/Actions/RackHD.BootImage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, null);
    
  }
  
  /**
   * retrieve the simple storage collection
   * Defines a collection of ethernet interfaces that are present on the system described by identifier
   * @param identifier 
   * @return EthernetInterfaceCollectionEthernetInterfaceCollection
   */
  public EthernetInterfaceCollectionEthernetInterfaceCollection unimplemented_1(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_1");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/EthernetInterfaces".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<EthernetInterfaceCollectionEthernetInterfaceCollection> returnType = new GenericType<EthernetInterfaceCollectionEthernetInterfaceCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retrieve the ethernet interface by device identifier
   * Defines an ethernet interface present on the system described by identifier
   * @param identifier 
   * @param index 
   * @return EthernetInterface100EthernetInterface
   */
  public EthernetInterface100EthernetInterface unimplemented_2(String identifier, String index) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_2");
     }
     
     // verify the required parameter 'index' is set
     if (index == null) {
        throw new ApiException(400, "Missing the required parameter 'index' when calling unimplemented_2");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/EthernetInterfaces/{index}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<EthernetInterface100EthernetInterface> returnType = new GenericType<EthernetInterface100EthernetInterface>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of the logs for a computer system
   * Defines a collection of log services that are available for the system described by identifier
   * @param identifier 
   * @return LogServiceCollectionLogServiceCollection
   */
  public LogServiceCollectionLogServiceCollection listLogService(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling listLogService");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/LogServices".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<LogServiceCollectionLogServiceCollection> returnType = new GenericType<LogServiceCollectionLogServiceCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of the logs for a computer system
   * Defines a collection of SEL entries for the system described by identifier.
   * @param identifier 
   * @return LogService100LogService
   */
  public LogService100LogService getSelLogService(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSelLogService");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/LogServices/sel".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<LogService100LogService> returnType = new GenericType<LogService100LogService>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of the logs entries for associated for log service
   * Defines a collection of entries for the system described by identifier
   * @param identifier 
   * @return LogEntryCollectionLogEntryCollection
   */
  public LogEntryCollectionLogEntryCollection listSelLogServiceEntries(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling listSelLogServiceEntries");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/LogServices/sel/Entries".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<LogEntryCollectionLogEntryCollection> returnType = new GenericType<LogEntryCollectionLogEntryCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve log entry by logId associated for log service
   * Defines a log entry specified by entryId within the LogService of the specified type for the system described by identifier
   * @param identifier 
   * @param entryId 
   * @return LogEntry100LogEntry
   */
  public LogEntry100LogEntry getSelLogServiceEntry(String identifier, String entryId) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSelLogServiceEntry");
     }
     
     // verify the required parameter 'entryId' is set
     if (entryId == null) {
        throw new ApiException(400, "Missing the required parameter 'entryId' when calling getSelLogServiceEntry");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/LogServices/sel/Entries/{entryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<LogEntry100LogEntry> returnType = new GenericType<LogEntry100LogEntry>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve the processor collection for the specified system identifier
   * defines a collection of processors contained within a resource.
   * @param identifier 
   * @return ProcessorCollectionProcessorCollection
   */
  public ProcessorCollectionProcessorCollection listSystemProcessors(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling listSystemProcessors");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/Processors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<ProcessorCollectionProcessorCollection> returnType = new GenericType<ProcessorCollectionProcessorCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve a specified processor for the specified system identifier
   * This represents the properties of a processor attached to a System.
   * @param identifier 
   * @param socket 
   * @return Processor100Processor
   */
  public Processor100Processor getSystemProcessor(String identifier, String socket) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSystemProcessor");
     }
     
     // verify the required parameter 'socket' is set
     if (socket == null) {
        throw new ApiException(400, "Missing the required parameter 'socket' when calling getSystemProcessor");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/Processors/{socket}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "socket" + "\\}", apiClient.escapeString(socket.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Processor100Processor> returnType = new GenericType<Processor100Processor>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve the simple storage collection
   * Defines a collection of simple storage collections that are present on the system described by identifier
   * @param identifier 
   * @return SimpleStorageCollectionSimpleStorageCollection
   */
  public SimpleStorageCollectionSimpleStorageCollection listSimpleStorage(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling listSimpleStorage");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/SimpleStorage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<SimpleStorageCollectionSimpleStorageCollection> returnType = new GenericType<SimpleStorageCollectionSimpleStorageCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Retrieve the simple storage collection by device identifier
   * Defines a collection of storage devices on the device specified by identifier that are present on the system described by identifier
   * @param identifier 
   * @param index 
   * @return SimpleStorage100SimpleStorage
   */
  public SimpleStorage100SimpleStorage getSimpleStorage(String identifier, String index) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSimpleStorage");
     }
     
     // verify the required parameter 'index' is set
     if (index == null) {
        throw new ApiException(400, "Missing the required parameter 'index' when calling getSimpleStorage");
     }
     
    // create path and map variables
    String path = "/Systems/{identifier}/SimpleStorage/{index}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<SimpleStorage100SimpleStorage> returnType = new GenericType<SimpleStorage100SimpleStorage>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of all tasks
   * This object represents the root Redfish service.
   * @return TaskService100TaskService
   */
  public TaskService100TaskService taskServiceRoot() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/TaskService".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<TaskService100TaskService> returnType = new GenericType<TaskService100TaskService>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of tasks per system Id
   * This object represents the root Redfish service.
   * @param identifier 
   * @return TaskCollectionTaskCollection
   */
  public TaskCollectionTaskCollection getSystemTasks(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSystemTasks");
     }
     
    // create path and map variables
    String path = "/TaskService/Oem/Tasks/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<TaskCollectionTaskCollection> returnType = new GenericType<TaskCollectionTaskCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve list of all tasks
   * This object represents the root Redfish service.
   * @return TaskCollectionTaskCollection
   */
  public TaskCollectionTaskCollection listTasks() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/TaskService/Tasks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<TaskCollectionTaskCollection> returnType = new GenericType<TaskCollectionTaskCollection>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * retrieve a task entry by task Id
   * This object represents the root Redfish service.
   * @param identifier 
   * @return Task100Task
   */
  public Task100Task getTask(String identifier) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'identifier' is set
     if (identifier == null) {
        throw new ApiException(400, "Missing the required parameter 'identifier' when calling getTask");
     }
     
    // create path and map variables
    String path = "/TaskService/Tasks/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {  };

    
    GenericType<Task100Task> returnType = new GenericType<Task100Task>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
