package io.swagger.client.api;

import com.sun.jersey.api.client.GenericType;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import io.swagger.client.model.ServiceRoot100ServiceRoot;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.AccountService100AccountService;
import io.swagger.client.model.ChassisCollectionChassisCollection;
import io.swagger.client.model.Chassis100Chassis;
import io.swagger.client.model.Power100Power;
import io.swagger.client.model.Thermal100Thermal;
import io.swagger.client.model.ManagerAccountCollectionManagerAccountCollection;
import io.swagger.client.model.ManagerAccount100ManagerAccount;
import io.swagger.client.model.ManagerCollectionManagerCollection;
import io.swagger.client.model.Manager100Manager;
import io.swagger.client.model.MessageRegistryMessageRegistry;
import io.swagger.client.model.RoleCollectionRoleCollection;
import io.swagger.client.model.Role100Role;
import io.swagger.client.model.JsonSchemaFileCollectionJsonSchemaFileCollection;
import io.swagger.client.model.SessionService100SessionService;
import io.swagger.client.model.ComputerSystemCollectionComputerSystemCollection;
import io.swagger.client.model.ComputerSystem100ComputerSystem;
import io.swagger.client.model.RackHDResetAction;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
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
   * @throws ApiException if fails to make API call
   */
  public ServiceRoot100ServiceRoot getServiceRoot() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ServiceRoot100ServiceRoot> localVarReturnType = new GenericType<ServiceRoot100ServiceRoot>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve account service information
   * 
   * @return AccountService100AccountService
   * @throws ApiException if fails to make API call
   */
  public AccountService100AccountService unimplemented() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/AccountService".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<AccountService100AccountService> localVarReturnType = new GenericType<AccountService100AccountService>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of physical components
   * Defines a collection of physical components managed by the service
   * @return ChassisCollectionChassisCollection
   * @throws ApiException if fails to make API call
   */
  public ChassisCollectionChassisCollection listChassis() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Chassis".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ChassisCollectionChassisCollection> localVarReturnType = new GenericType<ChassisCollectionChassisCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve specific information for a physical component
   * Retrieves a detailed information catalog for the physical component  specified by identifier
   * @param identifier 
   * @return Chassis100Chassis
   * @throws ApiException if fails to make API call
   */
  public Chassis100Chassis getChassis(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getChassis");
    }
    
    // create path and map variables
    String localVarPath = "/Chassis/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Chassis100Chassis> localVarReturnType = new GenericType<Chassis100Chassis>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve power characteristics of a chassis
   * defines a collection of power elements contained within a resource.
   * @param identifier 
   * @return Power100Power
   * @throws ApiException if fails to make API call
   */
  public Power100Power getPower(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getPower");
    }
    
    // create path and map variables
    String localVarPath = "/Chassis/{identifier}/Power".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Power100Power> localVarReturnType = new GenericType<Power100Power>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve thermal characteristics of a chassis
   * defines a collection of thermal elements contained within a resource.
   * @param identifier 
   * @return Thermal100Thermal
   * @throws ApiException if fails to make API call
   */
  public Thermal100Thermal getThermal(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getThermal");
    }
    
    // create path and map variables
    String localVarPath = "/Chassis/{identifier}/Thermal".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Thermal100Thermal> localVarReturnType = new GenericType<Thermal100Thermal>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of policies used by event service listeners
   * 
   * @return AccountService100AccountService
   * @throws ApiException if fails to make API call
   */
  public AccountService100AccountService unimplemented_0() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/EventService".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<AccountService100AccountService> localVarReturnType = new GenericType<AccountService100AccountService>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of manager accounts
   * 
   * @return ManagerAccountCollectionManagerAccountCollection
   * @throws ApiException if fails to make API call
   */
  public ManagerAccountCollectionManagerAccountCollection unimplemented_1() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/ManagerAccounts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ManagerAccountCollectionManagerAccountCollection> localVarReturnType = new GenericType<ManagerAccountCollectionManagerAccountCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve a manager account by name
   * 
   * @param identifier 
   * @return ManagerAccount100ManagerAccount
   * @throws ApiException if fails to make API call
   */
  public ManagerAccount100ManagerAccount unimplemented_2(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_2");
    }
    
    // create path and map variables
    String localVarPath = "/ManagerAccounts/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ManagerAccount100ManagerAccount> localVarReturnType = new GenericType<ManagerAccount100ManagerAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of management servers
   * 
   * @return ManagerCollectionManagerCollection
   * @throws ApiException if fails to make API call
   */
  public ManagerCollectionManagerCollection unimplemented_3() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Managers".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ManagerCollectionManagerCollection> localVarReturnType = new GenericType<ManagerCollectionManagerCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of management servers
   * 
   * @param identifier 
   * @return Manager100Manager
   * @throws ApiException if fails to make API call
   */
  public Manager100Manager unimplemented_4(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_4");
    }
    
    // create path and map variables
    String localVarPath = "/Managers/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Manager100Manager> localVarReturnType = new GenericType<Manager100Manager>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Unspecified
   * 
   * @return MessageRegistryMessageRegistry
   * @throws ApiException if fails to make API call
   */
  public MessageRegistryMessageRegistry unimplemented_5() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Registries".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<MessageRegistryMessageRegistry> localVarReturnType = new GenericType<MessageRegistryMessageRegistry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of roles for use in ManagerAccounts
   * 
   * @return RoleCollectionRoleCollection
   * @throws ApiException if fails to make API call
   */
  public RoleCollectionRoleCollection unimplemented_6() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Roles".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<RoleCollectionRoleCollection> localVarReturnType = new GenericType<RoleCollectionRoleCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve a manager account role by name
   * 
   * @param identifier 
   * @return Role100Role
   * @throws ApiException if fails to make API call
   */
  public Role100Role unimplemented_7(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling unimplemented_7");
    }
    
    // create path and map variables
    String localVarPath = "/Roles/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Role100Role> localVarReturnType = new GenericType<Role100Role>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Unspecified
   * 
   * @return JsonSchemaFileCollectionJsonSchemaFileCollection
   * @throws ApiException if fails to make API call
   */
  public JsonSchemaFileCollectionJsonSchemaFileCollection unimplemented_8() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Schemas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<JsonSchemaFileCollectionJsonSchemaFileCollection> localVarReturnType = new GenericType<JsonSchemaFileCollectionJsonSchemaFileCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve a list of sessions
   * 
   * @return SessionService100SessionService
   * @throws ApiException if fails to make API call
   */
  public SessionService100SessionService unimplemented_9() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Sessions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<SessionService100SessionService> localVarReturnType = new GenericType<SessionService100SessionService>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of computer systems
   * retrieve list of computer systems
   * @return ComputerSystemCollectionComputerSystemCollection
   * @throws ApiException if fails to make API call
   */
  public ComputerSystemCollectionComputerSystemCollection listSystems() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/Systems".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ComputerSystemCollectionComputerSystemCollection> localVarReturnType = new GenericType<ComputerSystemCollectionComputerSystemCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve information for a specific computer systems (physical and/or virtual)
   * defines a computer system and its respective properties.  A computer system represents a  machine (physical or virtual) and the local resources such as memory, cpu and other  devices that can be accessed from that machine.
   * @param identifier node identifier
   * @return ComputerSystem100ComputerSystem
   * @throws ApiException if fails to make API call
   */
  public ComputerSystem100ComputerSystem getSystem(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSystem");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ComputerSystem100ComputerSystem> localVarReturnType = new GenericType<ComputerSystem100ComputerSystem>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve the list of reset types for the specified compute node
   * Retrieve  a list of valid reset types for the system described by identifier
   * @param identifier 
   * @return RackHDResetAction
   * @throws ApiException if fails to make API call
   */
  public RackHDResetAction listResetTypes(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling listResetTypes");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/Actions/ComputerSystem.Reset".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<RackHDResetAction> localVarReturnType = new GenericType<RackHDResetAction>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * reset a node
   * Perform the reset specified in the post data arguments on the system described by identifier
   * @param identifier 
   * @param payload 
   * @throws ApiException if fails to make API call
   */
  public void doReset(String identifier, RackHDResetAction payload) throws ApiException {
    Object localVarPostBody = payload;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling doReset");
    }
    
    // verify the required parameter 'payload' is set
    if (payload == null) {
      throw new ApiException(400, "Missing the required parameter 'payload' when calling doReset");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/Actions/ComputerSystem.Reset".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * retrieve the list of boot image types for the specified compute node
   * Retrieve  a list of valid boot image types for the system described by identifier
   * @param identifier 
   * @return RackHDBootImageBootImageList
   * @throws ApiException if fails to make API call
   */
  public RackHDBootImageBootImageList listBootImage(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling listBootImage");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/Actions/RackHD.BootImage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<RackHDBootImageBootImageList> localVarReturnType = new GenericType<RackHDBootImageBootImageList>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * install a boot image on a node
   * Perform the boot image installation specified in the post data arguments on  the system described by identifier
   * @param identifier 
   * @param payload 
   * @throws ApiException if fails to make API call
   */
  public void doBootImage(String identifier, RackHDBootImageBootImage payload) throws ApiException {
    Object localVarPostBody = payload;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling doBootImage");
    }
    
    // verify the required parameter 'payload' is set
    if (payload == null) {
      throw new ApiException(400, "Missing the required parameter 'payload' when calling doBootImage");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/Actions/RackHD.BootImage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * retrieve list of the logs for a computer system
   * Defines a collection of log services that are available for the system described by identifier
   * @param identifier 
   * @return LogServiceCollectionLogServiceCollection
   * @throws ApiException if fails to make API call
   */
  public LogServiceCollectionLogServiceCollection listLogService(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling listLogService");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/LogServices".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<LogServiceCollectionLogServiceCollection> localVarReturnType = new GenericType<LogServiceCollectionLogServiceCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of the logs for a computer system
   * Defines a collection of SEL entries for the system described by identifier.
   * @param identifier 
   * @return LogService100LogService
   * @throws ApiException if fails to make API call
   */
  public LogService100LogService getSelLogService(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSelLogService");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/LogServices/sel".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<LogService100LogService> localVarReturnType = new GenericType<LogService100LogService>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of the logs entries for associated for log service
   * Defines a collection of entries for the system described by identifier
   * @param identifier 
   * @return LogEntryCollectionLogEntryCollection
   * @throws ApiException if fails to make API call
   */
  public LogEntryCollectionLogEntryCollection listSelLogServiceEntries(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling listSelLogServiceEntries");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/LogServices/sel/Entries".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<LogEntryCollectionLogEntryCollection> localVarReturnType = new GenericType<LogEntryCollectionLogEntryCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve log entry by logId associated for log service
   * Defines a log entry specified by entryId within the LogService of the specified type for the system described by identifier
   * @param identifier 
   * @param entryId 
   * @return LogEntry100LogEntry
   * @throws ApiException if fails to make API call
   */
  public LogEntry100LogEntry getSelLogServiceEntry(String identifier, String entryId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSelLogServiceEntry");
    }
    
    // verify the required parameter 'entryId' is set
    if (entryId == null) {
      throw new ApiException(400, "Missing the required parameter 'entryId' when calling getSelLogServiceEntry");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/LogServices/sel/Entries/{entryId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "entryId" + "\\}", apiClient.escapeString(entryId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<LogEntry100LogEntry> localVarReturnType = new GenericType<LogEntry100LogEntry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve the processor collection for the specified system identifier
   * defines a collection of processors contained within a resource.
   * @param identifier 
   * @return ProcessorCollectionProcessorCollection
   * @throws ApiException if fails to make API call
   */
  public ProcessorCollectionProcessorCollection listSystemProcessors(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling listSystemProcessors");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/Processors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ProcessorCollectionProcessorCollection> localVarReturnType = new GenericType<ProcessorCollectionProcessorCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve a specified processor for the specified system identifier
   * This represents the properties of a processor attached to a System.
   * @param identifier 
   * @param socket 
   * @return Processor100Processor
   * @throws ApiException if fails to make API call
   */
  public Processor100Processor getSystemProcessor(String identifier, String socket) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSystemProcessor");
    }
    
    // verify the required parameter 'socket' is set
    if (socket == null) {
      throw new ApiException(400, "Missing the required parameter 'socket' when calling getSystemProcessor");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/Processors/{socket}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "socket" + "\\}", apiClient.escapeString(socket.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Processor100Processor> localVarReturnType = new GenericType<Processor100Processor>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve the simple storage collection
   * Defines a collection of simple storage collections that are present on the system described by identifier
   * @param identifier 
   * @return SimpleStorageCollectionSimpleStorageCollection
   * @throws ApiException if fails to make API call
   */
  public SimpleStorageCollectionSimpleStorageCollection listSimpleStorage(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling listSimpleStorage");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/SimpleStorage".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<SimpleStorageCollectionSimpleStorageCollection> localVarReturnType = new GenericType<SimpleStorageCollectionSimpleStorageCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Retrieve the simple storage collection by device identifier
   * Defines a collection of storage devices on the device specified by identifier that are present on the system described by identifier
   * @param identifier 
   * @param index 
   * @return SimpleStorage100SimpleStorage
   * @throws ApiException if fails to make API call
   */
  public SimpleStorage100SimpleStorage getSimpleStorage(String identifier, String index) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSimpleStorage");
    }
    
    // verify the required parameter 'index' is set
    if (index == null) {
      throw new ApiException(400, "Missing the required parameter 'index' when calling getSimpleStorage");
    }
    
    // create path and map variables
    String localVarPath = "/Systems/{identifier}/SimpleStorage/{index}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()))
      .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<SimpleStorage100SimpleStorage> localVarReturnType = new GenericType<SimpleStorage100SimpleStorage>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of all tasks
   * This object represents the root Redfish service.
   * @return TaskService100TaskService
   * @throws ApiException if fails to make API call
   */
  public TaskService100TaskService taskServiceRoot() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/TaskService".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<TaskService100TaskService> localVarReturnType = new GenericType<TaskService100TaskService>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of tasks per system Id
   * This object represents the root Redfish service.
   * @param identifier 
   * @return TaskCollectionTaskCollection
   * @throws ApiException if fails to make API call
   */
  public TaskCollectionTaskCollection getSystemTasks(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getSystemTasks");
    }
    
    // create path and map variables
    String localVarPath = "/TaskService/Oem/Tasks/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<TaskCollectionTaskCollection> localVarReturnType = new GenericType<TaskCollectionTaskCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve list of all tasks
   * This object represents the root Redfish service.
   * @return TaskCollectionTaskCollection
   * @throws ApiException if fails to make API call
   */
  public TaskCollectionTaskCollection listTasks() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/TaskService/Tasks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<TaskCollectionTaskCollection> localVarReturnType = new GenericType<TaskCollectionTaskCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * retrieve a task entry by task Id
   * This object represents the root Redfish service.
   * @param identifier 
   * @return Task100Task
   * @throws ApiException if fails to make API call
   */
  public Task100Task getTask(String identifier) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'identifier' is set
    if (identifier == null) {
      throw new ApiException(400, "Missing the required parameter 'identifier' when calling getTask");
    }
    
    // create path and map variables
    String localVarPath = "/TaskService/Tasks/{identifier}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "identifier" + "\\}", apiClient.escapeString(identifier.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Task100Task> localVarReturnType = new GenericType<Task100Task>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
