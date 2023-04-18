package com.dayone.redfish;

import io.swagger.client.ApiClient;
import io.swagger.client.api.RedfishvApi;
import io.swagger.client.model.*;
import lombok.extern.flogger.Flogger;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class CPUTest {

    /*
        Description : cpu ino
        URL         : /redfish/v1/System/{SystemId}
        데이터       : 응답 데이터 중 ProcessorSummary 참조
     */
    @Test
    public void testGetCPUInfo() throws Exception {
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

        apiClient.setBasePath(basePath + "/redfish/v1");

        ComputerSystemCollectionComputerSystemCollection computerSystemCollectionComputerSystemCollection = redfishvApi.listSystems();
        List<Odata400IdRef> members = computerSystemCollectionComputerSystemCollection.getMembers();
        for( int i=0; i<members.size(); i++ ) {
            String oid = members.get(i).getOdataId();
            log.debug("Member OID[{}]:{}", i, oid);

            String systemId = oid.substring(oid.lastIndexOf("/")+1);
            ComputerSystem100ComputerSystem computerSystem100ComputerSystem = redfishvApi.getSystem(systemId);
        }


    }

    /*
        Description : cpu metrics
        URL         : /redfish/v1/System/{SystemId}/Processor/{ProcessorID}/ProcessorMetrics
        데이터       : 응답 데이터 중 KernelPercent, UserPercent 참조
     */
    @Test
    public void testGetCPUMetric() throws Exception {
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
    }


}
