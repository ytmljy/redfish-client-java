package com.dayone.redfish;

import static org.junit.Assert.*;

import io.swagger.client.ApiClient;
import io.swagger.client.api.RedfishvApi;
import io.swagger.client.model.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RootTest {

    @Test
    public void testGetServiceRoot() throws Exception {
        ApiClient apiClient = new ApiClient();

        String basePath = "http://15.164.189.57:8000";

        Map<String, String> headerParams = new HashMap<>();
        headerParams.put("Host", "127.0.0.1:8000");
        headerParams.put("User-Agent", "python-requests/2.27.1");
        headerParams.put("Accept-Encoding", "gzip, deflate");
        headerParams.put("Accept", "*");
        headerParams.put("Connection", "keep-alive");
        headerParams.put("OData-Version", "4.0");

        RedfishvApi redfishvApi = new RedfishvApi();
        redfishvApi.setApiClient(apiClient);

        // /redfish/v1/
        apiClient.setBasePath(basePath + "/redfish/v1");

        ServiceRoot100ServiceRoot serviceRoot100ServiceRoot = redfishvApi.getServiceRoot();
//        assertNotNull(serviceRoot100ServiceRoot);

        // /redfish/v1/SessionService/Sessions
        Session100Session session100Session = new Session100Session();
        session100Session.setId("root");
        session100Session.setPassword("root1");

//        session100Session = redfishvApi.postSession(session100Session);
//        assertNotNull(session100Session);

        // /redfish/v1/odata
        apiClient.setBasePath(basePath + "/redfish/v1");

        // /redfish/v1/AccountService
        AccountService100AccountService accountService100AccountService = redfishvApi.getAccountService();
        System.out.println("accountService100AccountService.getAccounts().getOdataId():" + accountService100AccountService.getAccounts().getOdataId());
        ManagerAccountCollectionManagerAccountCollection managerAccountCollectionManagerAccountCollection = redfishvApi.getAccounts();

        for( int i=0; i<managerAccountCollectionManagerAccountCollection.getMembers().size(); i++) {
            System.out.println("managerAccountCollectionManagerAccountCollection.getMembers().get(i).getOdataId():" + managerAccountCollectionManagerAccountCollection.getMembers().get(i).getOdataId());
            String oid = managerAccountCollectionManagerAccountCollection.getMembers().get(i).getOdataId();
            ManagerAccount100ManagerAccount managerAccount100ManagerAccount = redfishvApi.getAccount(oid.substring(oid.lastIndexOf("/")+1));
        }
    }
}
