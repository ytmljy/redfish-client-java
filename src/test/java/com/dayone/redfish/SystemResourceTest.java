package com.dayone.redfish;

import io.swagger.client.ApiClient;
import io.swagger.client.api.RedfishvApi;
import io.swagger.client.model.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class SystemResourceTest {

    /*
        Description : cpu, memory, disk ino
        URL         : /redfish/v1/System/{SystemId}
        데이터       : 응답 데이터 중 ProcessorSummary 참조
     */
    @Test
    public void testGetSystemnfo() throws Exception {
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
//            log.info("Member OID[{}]:{}", i, oid);

            String systemId = oid.substring(oid.lastIndexOf("/")+1);
            ComputerSystem100ComputerSystem computerSystem100ComputerSystem = redfishvApi.getSystem(systemId);

//            log.info("ComputerSystem100ComputerSystem:({})", computerSystem100ComputerSystem);

            ComputerSystem100ProcessorSummary computerSystem100ProcessorSummary = computerSystem100ComputerSystem.getProcessorSummary();
            log.info("computerSystem100ProcessorSummary:({})", computerSystem100ProcessorSummary);

            ComputerSystem100MemorySummary computerSystem100MemorySummary = computerSystem100ComputerSystem.getMemorySummary();
            log.info("computerSystem100MemorySummary:({})", computerSystem100MemorySummary);

            SimpleStorageCollectionSimpleStorageCollection simpleStorageCollectionSimpleStorageCollection = redfishvApi.listSimpleStorage(systemId);
            List<Odata400IdRef> simpleStorageList = simpleStorageCollectionSimpleStorageCollection.getMembers();
            for( int j=0; j<simpleStorageList.size(); j++ ) {
                String storageOid = simpleStorageList.get(i).getOdataId();
                String storageId =  storageOid.substring(storageOid.lastIndexOf("/")+1);
                SimpleStorage100SimpleStorage simpleStorage100SimpleStorage = redfishvApi.getSimpleStorage(systemId, storageId);
                log.info("simpleStorageList({}) : ({})", j, simpleStorage100SimpleStorage);
            }
        }


    }

    /*
        Description : cpu metrics
        URL         : /redfish/v1/System/{SystemId}/Processor/{ProcessorID}/ProcessorMetrics
        데이터       : 응답 데이터 중 KernelPercent, UserPercent 참조
     */
//    @Test
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

        apiClient.setBasePath(basePath + "/redfish/v1");

        ComputerSystemCollectionComputerSystemCollection computerSystemCollectionComputerSystemCollection = redfishvApi.listSystems();
        List<Odata400IdRef> systemMembers = computerSystemCollectionComputerSystemCollection.getMembers();
        for( int i=0; i<systemMembers.size(); i++ ) {
            String systemOid = systemMembers.get(i).getOdataId();

            String systemId = systemOid.substring(systemOid.lastIndexOf("/")+1);
            ProcessorCollectionProcessorCollection processorCollectionProcessorCollection = redfishvApi.listSystemProcessors(systemId);
            List<Odata400IdRef> processorMembers = processorCollectionProcessorCollection.getMembers();
            for( int j=0; j<processorMembers.size(); j++ ) {
                String processOId = processorMembers.get(j).getOdataId();
                String processId = processOId.substring(processOId.lastIndexOf("/")+1);
                Processor100Processor processor100Processor = redfishvApi.getSystemProcessor(systemId, processId);

                log.info("processor100Processor ID[{}]:{}", j, processor100Processor.getMetrics());
                if( processor100Processor.getMetrics() != null ) {
                    Processor100ProcessorMetrics processor100ProcessorMetrics = redfishvApi.getSystemProcessorMetrics(systemId, processId);
                    log.info("processor100ProcessorMetrics ID[{}]:{}", j, processor100ProcessorMetrics);
                }
            }
        }
    }


}
