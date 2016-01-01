package org.tempuri;

public class MobileWebServiceProxy implements org.tempuri.MobileWebService {
  private String _endpoint = null;
  private org.tempuri.MobileWebService mobileWebService = null;
  
  public MobileWebServiceProxy() {
    _initMobileWebServiceProxy();
  }
  
  public MobileWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMobileWebServiceProxy();
  }
  
  private void _initMobileWebServiceProxy() {
    try {
      mobileWebService = (new org.tempuri.IC_Mobile_WcfLocator()).getSecureEndpoint();
      if (mobileWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mobileWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mobileWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mobileWebService != null)
      ((javax.xml.rpc.Stub)mobileWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.MobileWebService getMobileWebService() {
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService;
  }
  
  public java.lang.Boolean isConnected() throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.isConnected();
  }
  
  public java.lang.String getAttributesByAttributeID(int[] attributeIDs) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getAttributesByAttributeID(attributeIDs);
  }
  
  public java.lang.Boolean processItemReorder(java.lang.String xmlReorderEmail, java.lang.String userName) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.processItemReorder(xmlReorderEmail, userName);
  }
  
  public java.lang.String getClientsByClientUID(int[] clientUIDs) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getClientsByClientUID(clientUIDs);
  }
  
  public java.lang.String getEmployeesByEmployeeIDs(int[] employeeIDs) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getEmployeesByEmployeeIDs(employeeIDs);
  }
  
  public java.lang.String getLocationsByLocationID(int[] locationIDs) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getLocationsByLocationID(locationIDs);
  }
  
  public java.lang.String getCategoriesByCategoryIDs(int[] categoryIDs) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getCategoriesByCategoryIDs(categoryIDs);
  }
  
  public java.lang.String getOpsOnItemsByItemUIDs(int[] itemUIDs) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getOpsOnItemsByItemUIDs(itemUIDs);
  }
  
  public java.lang.String getItemsAttributesByItemUIDs(int[] itemUIDs) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getItemsAttributesByItemUIDs(itemUIDs);
  }
  
  public java.lang.String getChipsOnItemsByItemUIDs(int[] itemUIDs) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getChipsOnItemsByItemUIDs(itemUIDs);
  }
  
  public java.lang.String getItemsbyItemUIDs(int[] itemUIDs) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getItemsbyItemUIDs(itemUIDs);
  }
  
  public int[] getItemUidsByCasGroup(java.lang.String searchValue, java.lang.Integer clientUID, java.lang.Boolean isChipId) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getItemUidsByCasGroup(searchValue, clientUID, isChipId);
  }
  
  public java.lang.String canConnectToWebService(java.lang.String input) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.canConnectToWebService(input);
  }
  
  public java.lang.Boolean saveUploadDataForRecovery(java.lang.Integer clientUID, java.lang.String deviceID, java.lang.String recoveryID, java.lang.String tableName, java.lang.String compressedContents) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.saveUploadDataForRecovery(clientUID, deviceID, recoveryID, tableName, compressedContents);
  }
  
  public void logErrorFile(java.lang.Integer clientUID, java.lang.String payload) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    mobileWebService.logErrorFile(clientUID, payload);
  }
  
  public java.lang.String getFormsInProgress(java.lang.Integer clientUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getFormsInProgress(clientUID);
  }
  
  public java.lang.String getData(java.lang.Integer value) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getData(value);
  }
  
  public java.lang.String getOnDemandItemData(java.lang.Integer itemUID, java.util.Calendar modifiedSince) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getOnDemandItemData(itemUID, modifiedSince);
  }
  
  public java.lang.String getOperationByOperationID(java.lang.Integer operationID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getOperationByOperationID(operationID);
  }
  
  public java.lang.String getOperationTasksByOperationID(java.lang.Integer operationID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getOperationTasksByOperationID(operationID);
  }
  
  public java.lang.String getTasksByTaskIDs(int[] taskIDs) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getTasksByTaskIDs(taskIDs);
  }
  
  public java.lang.String getOpResultsByItemUID(java.lang.Integer itemUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getOpResultsByItemUID(itemUID);
  }
  
  public java.lang.String getCompletedWorkDataByOpResultsGUID(java.lang.String opResultsGUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getCompletedWorkDataByOpResultsGUID(opResultsGUID);
  }
  
  public java.lang.String searchItemsByItemUIDs(java.lang.String itemUID_CSV) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.searchItemsByItemUIDs(itemUID_CSV);
  }
  
  public java.lang.String getCompleteItemByItemUID(java.lang.Integer itemUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getCompleteItemByItemUID(itemUID);
  }
  
  public java.lang.String getItemUIDsByAssetnumber(java.lang.String assetNumber, java.lang.Integer clientUID, java.lang.Boolean exactMatch) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getItemUIDsByAssetnumber(assetNumber, clientUID, exactMatch);
  }
  
  public org.datacontract.schemas._2004._07.Core_BL.AttributesByItem[] getAttributesByItemUID(java.lang.Integer itemUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getAttributesByItemUID(itemUID);
  }
  
  public java.lang.String getItemUIDbyChipID(java.lang.String chipID, java.lang.Integer clientUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getItemUIDbyChipID(chipID, clientUID);
  }
  
  public org.datacontract.schemas._2004._07.Core_BL.OpResultSummary[] getOpResultSummaryByItemUID(java.lang.String itemUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getOpResultSummaryByItemUID(itemUID);
  }
  
  public org.datacontract.schemas._2004._07.Core_BL.Location[] getClientLocations(java.lang.Integer clientUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getClientLocations(clientUID);
  }
  
  public org.datacontract.schemas._2004._07.Core_BL.Vw_ClientsCustomers[] getClientsCustomers_old(java.lang.Integer clientUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getClientsCustomers_old(clientUID);
  }
  
  public org.datacontract.schemas._2004._07.Core_BL.Vw_ClientsCategories[] getClientsCategories(java.lang.Integer clientUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getClientsCategories(clientUID);
  }
  
  public org.datacontract.schemas._2004._07.Core_BL.File[] getItemsAttachments(java.lang.Integer itemUID, org.datacontract.schemas._2004._07.Core_BL.IC_ToolsAttachmentType type) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getItemsAttachments(itemUID, type);
  }
  
  public java.lang.String getClientsCustomers(java.lang.Integer clientUID, java.util.Calendar modifiedSince) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getClientsCustomers(clientUID, modifiedSince);
  }
  
  public java.lang.Integer authenticateCredentials(java.lang.String username, java.lang.String passwordHashed, java.lang.Integer clientUID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.authenticateCredentials(username, passwordHashed, clientUID);
  }
  
  public java.lang.String syncDownloadClientsContacts(java.lang.Integer clientUID, java.lang.Integer numRecordsToGet, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadClientsContacts(clientUID, numRecordsToGet, startingIndex, modifiedSince, syncStartTime, refresh);
  }
  
  public java.lang.String getSyncStartTimeUtcFromServer() throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.getSyncStartTimeUtcFromServer();
  }
  
  public int[] countRecordsForClientData(java.lang.Integer clientUID, java.util.Calendar modifiedSince) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countRecordsForClientData(clientUID, modifiedSince);
  }
  
  public java.lang.String syncDownloadClients(java.lang.Integer clientUID, java.lang.Integer numRecordsToGet, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadClients(clientUID, numRecordsToGet, startingIndex, modifiedSince, syncStartTime, refresh);
  }
  
  public java.lang.String syncDownloadClientsCustomers(java.lang.Integer clientUID, java.lang.Integer numRecordsToGet, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadClientsCustomers(clientUID, numRecordsToGet, startingIndex, modifiedSince, syncStartTime, refresh);
  }
  
  public java.lang.Integer countItemsRecords(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countItemsRecords(clientUID, customersUidArray, modifiedSince, syncStartTime, refresh);
  }
  
  public java.lang.Integer countItemsAttributesRecords(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countItemsAttributesRecords(clientUID, customersUidArray, modifiedSince, syncStartTime, refresh);
  }
  
  public java.lang.Integer countItemsFilesRecords(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countItemsFilesRecords(clientUID, customersUidArray, modifiedSince, syncStartTime, refresh);
  }
  
  public java.lang.Integer countChipsOnItemsRecords(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countChipsOnItemsRecords(clientUID, customersUidArray, modifiedSince, syncStartTime, refresh);
  }
  
  public java.lang.Integer countFilesForRecords(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countFilesForRecords(clientUID, customersUidArray, modifiedSince, syncStartTime, refresh);
  }
  
  public int[] countRecordsForItemData(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countRecordsForItemData(clientUID, customersUidArray, modifiedSince, syncStartTime);
  }
  
  public int[] countRecordsForLocationData(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countRecordsForLocationData(clientUID, customersUidArray, modifiedSince, syncStartTime);
  }
  
  public int[] countRecordsForCategoryData(java.lang.Integer clientUID, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countRecordsForCategoryData(clientUID, modifiedSince, syncStartTime, refresh);
  }
  
  public int[] countRecordsForOperationData(java.lang.Integer clientUID, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countRecordsForOperationData(clientUID, modifiedSince, syncStartTime);
  }
  
  public int[] countRecordsForOpsOnItemsData(java.lang.Integer clientUID, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countRecordsForOpsOnItemsData(clientUID, modifiedSince, syncStartTime);
  }
  
  public int[] countRecordsForOpResultsData(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.countRecordsForOpResultsData(clientUID, customersUidArray, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadPartialCompletedOpsData(java.lang.Integer clientUID, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadPartialCompletedOpsData(clientUID, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadCommentsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadCommentsData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadAttributeData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadAttributeData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadAttributeDropDownData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadAttributeDropDownData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadCategoriesClientsDefaultsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadCategoriesClientsDefaultsData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadCategoryAttributeData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadCategoryAttributeData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadCategoryData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadCategoryData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadCatsAttribsPrefills(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadCatsAttribsPrefills(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadCatsAttribsPrefillsDetails(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadCatsAttribsPrefillsDetails(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadChipsData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadChipsData(clientUID, customersUidArray, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadMPFAssociationsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadMPFAssociationsData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadClientData(java.lang.Integer clientUID, java.util.Calendar modifiedSince) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadClientData(clientUID, modifiedSince);
  }
  
  public java.lang.String syncDownloadFileData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadFileData(clientUID, customersUidArray, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadItemData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadItemData(clientUID, customersUidArray, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadItemsAttributesData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadItemsAttributesData(clientUID, customersUidArray, numRecords, startingIndex, modifiedSince, syncStartTime, refresh, syncID);
  }
  
  public java.lang.String[] syncDownloadItemsAttributesRefreshData(java.lang.Integer clientUID, java.lang.Integer customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadItemsAttributesRefreshData(clientUID, customersUidArray, numRecords, startingID);
  }
  
  public java.lang.String syncDownloadItemsFilesData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadItemsFilesData(clientUID, customersUidArray, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadLocationsData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadLocationsData(clientUID, customersUidArray, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadOperationsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadOperationsData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadOperationsOnItemsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadOperationsOnItemsData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadOperationsTasksData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadOperationsTasksData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadOpResultsData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadOpResultsData(clientUID, customersUidArray, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadOpResultsDetailsData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadOpResultsDetailsData(clientUID, customersUidArray, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadOpResultsFilesData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadOpResultsFilesData(clientUID, customersUidArray, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadPrefillsFiles(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadPrefillsFiles(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime, refresh);
  }
  
  public java.lang.String syncDownloadSchedulesDetailsData(java.lang.String scheduleDetailsIDs, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadSchedulesDetailsData(scheduleDetailsIDs, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadTasksData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadTasksData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncDownloadTasksDropDownsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncDownloadTasksDropDownsData(clientUID, numRecords, startingIndex, modifiedSince, syncStartTime);
  }
  
  public java.lang.String syncUploadChipsOnItemsHistory(java.lang.String historyXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadChipsOnItemsHistory(historyXml, clientUID, syncID);
  }
  
  public java.lang.String syncUploadChipsOnItemsUpdates(java.lang.String chipsOnItemsXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadChipsOnItemsUpdates(chipsOnItemsXml, clientUID, syncID);
  }
  
  public java.lang.String syncUploadFiles(java.lang.String xml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadFiles(xml, clientUID, syncID);
  }
  
  public void uploadFilestream(byte[] fileByteStream) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    mobileWebService.uploadFilestream(fileByteStream);
  }
  
  public java.lang.Boolean syncUploadFileToClientWebFolder(java.lang.Integer clientUID, java.lang.String fileName, byte[] file) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadFileToClientWebFolder(clientUID, fileName, file);
  }
  
  public java.lang.String syncUploadItemAttributes(java.lang.String xml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadItemAttributes(xml, clientUID, syncID);
  }
  
  public java.lang.String syncUploadItemNew(java.lang.String itemXml, java.lang.String chipIDs, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadItemNew(itemXml, chipIDs, clientUID, syncID);
  }
  
  public java.lang.String syncUploadItemsAttributesHistory(java.lang.String historyXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadItemsAttributesHistory(historyXml, clientUID, syncID);
  }
  
  public java.lang.String syncUploadItemsFilesNew(java.lang.String itemsFilesXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadItemsFilesNew(itemsFilesXml, clientUID, syncID);
  }
  
  public java.lang.String syncUploadItemsHistory(java.lang.String historyXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadItemsHistory(historyXml, clientUID, syncID);
  }
  
  public java.lang.Boolean syncUploadItemUpdates(java.lang.String itemsXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadItemUpdates(itemsXml, clientUID, syncID);
  }
  
  public java.lang.String syncUploadLocation(java.lang.String locationXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadLocation(locationXml, clientUID, syncID);
  }
  
  public java.lang.String syncUploadOpResults(java.lang.String opResult_xml, java.lang.String opResultDetails_xml, java.lang.String opResultFiles_xml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadOpResults(opResult_xml, opResultDetails_xml, opResultFiles_xml, clientUID, syncID);
  }
  
  public java.lang.String syncUploadOpResultsDetailsHistory(java.lang.String historyXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadOpResultsDetailsHistory(historyXml, clientUID, syncID);
  }
  
  public java.lang.String syncUploadOpResultHistory(java.lang.String historyXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.syncUploadOpResultHistory(historyXml, clientUID, syncID);
  }
  
  public java.lang.String deleteRedundantUTIs(java.lang.Integer clientUID, java.lang.String refNums) throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    return mobileWebService.deleteRedundantUTIs(clientUID, refNums);
  }
  
  public void new_Core_Functions_Testing() throws java.rmi.RemoteException{
    if (mobileWebService == null)
      _initMobileWebServiceProxy();
    mobileWebService.new_Core_Functions_Testing();
  }
  
  
}