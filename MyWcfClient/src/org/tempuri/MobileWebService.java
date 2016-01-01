/**
 * MobileWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface MobileWebService extends java.rmi.Remote {
    public java.lang.Boolean isConnected() throws java.rmi.RemoteException;
    public java.lang.String getAttributesByAttributeID(int[] attributeIDs) throws java.rmi.RemoteException;
    public java.lang.Boolean processItemReorder(java.lang.String xmlReorderEmail, java.lang.String userName) throws java.rmi.RemoteException;
    public java.lang.String getClientsByClientUID(int[] clientUIDs) throws java.rmi.RemoteException;
    public java.lang.String getEmployeesByEmployeeIDs(int[] employeeIDs) throws java.rmi.RemoteException;
    public java.lang.String getLocationsByLocationID(int[] locationIDs) throws java.rmi.RemoteException;
    public java.lang.String getCategoriesByCategoryIDs(int[] categoryIDs) throws java.rmi.RemoteException;
    public java.lang.String getOpsOnItemsByItemUIDs(int[] itemUIDs) throws java.rmi.RemoteException;
    public java.lang.String getItemsAttributesByItemUIDs(int[] itemUIDs) throws java.rmi.RemoteException;
    public java.lang.String getChipsOnItemsByItemUIDs(int[] itemUIDs) throws java.rmi.RemoteException;
    public java.lang.String getItemsbyItemUIDs(int[] itemUIDs) throws java.rmi.RemoteException;
    public int[] getItemUidsByCasGroup(java.lang.String searchValue, java.lang.Integer clientUID, java.lang.Boolean isChipId) throws java.rmi.RemoteException;
    public java.lang.String canConnectToWebService(java.lang.String input) throws java.rmi.RemoteException;
    public java.lang.Boolean saveUploadDataForRecovery(java.lang.Integer clientUID, java.lang.String deviceID, java.lang.String recoveryID, java.lang.String tableName, java.lang.String compressedContents) throws java.rmi.RemoteException;
    public void logErrorFile(java.lang.Integer clientUID, java.lang.String payload) throws java.rmi.RemoteException;
    public java.lang.String getFormsInProgress(java.lang.Integer clientUID) throws java.rmi.RemoteException;
    public java.lang.String getData(java.lang.Integer value) throws java.rmi.RemoteException;
    public java.lang.String getOnDemandItemData(java.lang.Integer itemUID, java.util.Calendar modifiedSince) throws java.rmi.RemoteException;
    public java.lang.String getOperationByOperationID(java.lang.Integer operationID) throws java.rmi.RemoteException;
    public java.lang.String getOperationTasksByOperationID(java.lang.Integer operationID) throws java.rmi.RemoteException;
    public java.lang.String getTasksByTaskIDs(int[] taskIDs) throws java.rmi.RemoteException;
    public java.lang.String getOpResultsByItemUID(java.lang.Integer itemUID) throws java.rmi.RemoteException;
    public java.lang.String getCompletedWorkDataByOpResultsGUID(java.lang.String opResultsGUID) throws java.rmi.RemoteException;
    public java.lang.String searchItemsByItemUIDs(java.lang.String itemUID_CSV) throws java.rmi.RemoteException;
    public java.lang.String getCompleteItemByItemUID(java.lang.Integer itemUID) throws java.rmi.RemoteException;
    public java.lang.String getItemUIDsByAssetnumber(java.lang.String assetNumber, java.lang.Integer clientUID, java.lang.Boolean exactMatch) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Core_BL.AttributesByItem[] getAttributesByItemUID(java.lang.Integer itemUID) throws java.rmi.RemoteException;
    public java.lang.String getItemUIDbyChipID(java.lang.String chipID, java.lang.Integer clientUID) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Core_BL.OpResultSummary[] getOpResultSummaryByItemUID(java.lang.String itemUID) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Core_BL.Location[] getClientLocations(java.lang.Integer clientUID) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Core_BL.Vw_ClientsCustomers[] getClientsCustomers_old(java.lang.Integer clientUID) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Core_BL.Vw_ClientsCategories[] getClientsCategories(java.lang.Integer clientUID) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Core_BL.File[] getItemsAttachments(java.lang.Integer itemUID, org.datacontract.schemas._2004._07.Core_BL.IC_ToolsAttachmentType type) throws java.rmi.RemoteException;
    public java.lang.String getClientsCustomers(java.lang.Integer clientUID, java.util.Calendar modifiedSince) throws java.rmi.RemoteException;
    public java.lang.Integer authenticateCredentials(java.lang.String username, java.lang.String passwordHashed, java.lang.Integer clientUID) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadClientsContacts(java.lang.Integer clientUID, java.lang.Integer numRecordsToGet, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException;
    public java.lang.String getSyncStartTimeUtcFromServer() throws java.rmi.RemoteException;
    public int[] countRecordsForClientData(java.lang.Integer clientUID, java.util.Calendar modifiedSince) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadClients(java.lang.Integer clientUID, java.lang.Integer numRecordsToGet, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadClientsCustomers(java.lang.Integer clientUID, java.lang.Integer numRecordsToGet, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException;
    public java.lang.Integer countItemsRecords(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException;
    public java.lang.Integer countItemsAttributesRecords(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException;
    public java.lang.Integer countItemsFilesRecords(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException;
    public java.lang.Integer countChipsOnItemsRecords(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException;
    public java.lang.Integer countFilesForRecords(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException;
    public int[] countRecordsForItemData(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public int[] countRecordsForLocationData(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public int[] countRecordsForCategoryData(java.lang.Integer clientUID, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException;
    public int[] countRecordsForOperationData(java.lang.Integer clientUID, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public int[] countRecordsForOpsOnItemsData(java.lang.Integer clientUID, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public int[] countRecordsForOpResultsData(java.lang.Integer clientUID, int[] customersUidArray, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadPartialCompletedOpsData(java.lang.Integer clientUID, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadCommentsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadAttributeData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadAttributeDropDownData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadCategoriesClientsDefaultsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadCategoryAttributeData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadCategoryData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadCatsAttribsPrefills(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadCatsAttribsPrefillsDetails(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadChipsData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadMPFAssociationsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadClientData(java.lang.Integer clientUID, java.util.Calendar modifiedSince) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadFileData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadItemData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadItemsAttributesData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String[] syncDownloadItemsAttributesRefreshData(java.lang.Integer clientUID, java.lang.Integer customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingID) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadItemsFilesData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadLocationsData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadOperationsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadOperationsOnItemsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadOperationsTasksData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadOpResultsData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadOpResultsDetailsData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadOpResultsFilesData(java.lang.Integer clientUID, int[] customersUidArray, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadPrefillsFiles(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime, java.lang.Boolean refresh) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadSchedulesDetailsData(java.lang.String scheduleDetailsIDs, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadTasksData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncDownloadTasksDropDownsData(java.lang.Integer clientUID, java.lang.Integer numRecords, java.lang.Integer startingIndex, java.util.Calendar modifiedSince, java.util.Calendar syncStartTime) throws java.rmi.RemoteException;
    public java.lang.String syncUploadChipsOnItemsHistory(java.lang.String historyXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String syncUploadChipsOnItemsUpdates(java.lang.String chipsOnItemsXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String syncUploadFiles(java.lang.String xml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public void uploadFilestream(byte[] fileByteStream) throws java.rmi.RemoteException;
    public java.lang.Boolean syncUploadFileToClientWebFolder(java.lang.Integer clientUID, java.lang.String fileName, byte[] file) throws java.rmi.RemoteException;
    public java.lang.String syncUploadItemAttributes(java.lang.String xml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String syncUploadItemNew(java.lang.String itemXml, java.lang.String chipIDs, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String syncUploadItemsAttributesHistory(java.lang.String historyXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String syncUploadItemsFilesNew(java.lang.String itemsFilesXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String syncUploadItemsHistory(java.lang.String historyXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.Boolean syncUploadItemUpdates(java.lang.String itemsXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String syncUploadLocation(java.lang.String locationXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String syncUploadOpResults(java.lang.String opResult_xml, java.lang.String opResultDetails_xml, java.lang.String opResultFiles_xml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String syncUploadOpResultsDetailsHistory(java.lang.String historyXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String syncUploadOpResultHistory(java.lang.String historyXml, java.lang.Integer clientUID, java.lang.String syncID) throws java.rmi.RemoteException;
    public java.lang.String deleteRedundantUTIs(java.lang.Integer clientUID, java.lang.String refNums) throws java.rmi.RemoteException;
    public void new_Core_Functions_Testing() throws java.rmi.RemoteException;
}
