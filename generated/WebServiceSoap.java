
package org.example.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServiceSoap {


    /**
     * 
     * @param tableIndex
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetRows", action = "http://tempuri.org/GetRows")
    @WebResult(name = "GetRowsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetRows", targetNamespace = "http://tempuri.org/", className = "org.example.generated.GetRows")
    @ResponseWrapper(localName = "GetRowsResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.GetRowsResponse")
    public String getRows(
        @WebParam(name = "tableIndex", targetNamespace = "http://tempuri.org/")
        int tableIndex);

    /**
     * 
     * @param tableIndex
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetColumns", action = "http://tempuri.org/GetColumns")
    @WebResult(name = "GetColumnsResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetColumns", targetNamespace = "http://tempuri.org/", className = "org.example.generated.GetColumns")
    @ResponseWrapper(localName = "GetColumnsResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.GetColumnsResponse")
    public String getColumns(
        @WebParam(name = "tableIndex", targetNamespace = "http://tempuri.org/")
        int tableIndex);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetTablesData", action = "http://tempuri.org/GetTablesData")
    @WebResult(name = "GetTablesDataResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetTablesData", targetNamespace = "http://tempuri.org/", className = "org.example.generated.GetTablesData")
    @ResponseWrapper(localName = "GetTablesDataResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.GetTablesDataResponse")
    public String getTablesData();

    /**
     * 
     * @param name
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CreateTable", action = "http://tempuri.org/CreateTable")
    @WebResult(name = "CreateTableResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreateTable", targetNamespace = "http://tempuri.org/", className = "org.example.generated.CreateTable")
    @ResponseWrapper(localName = "CreateTableResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.CreateTableResponse")
    public boolean createTable(
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name);

    /**
     * 
     * @param tableIndex
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "AddRow", action = "http://tempuri.org/AddRow")
    @WebResult(name = "AddRowResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddRow", targetNamespace = "http://tempuri.org/", className = "org.example.generated.AddRow")
    @ResponseWrapper(localName = "AddRowResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.AddRowResponse")
    public boolean addRow(
        @WebParam(name = "tableIndex", targetNamespace = "http://tempuri.org/")
        int tableIndex);

    /**
     * 
     * @param columnType
     * @param name
     * @param tableIndex
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "AddColumn", action = "http://tempuri.org/AddColumn")
    @WebResult(name = "AddColumnResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "AddColumn", targetNamespace = "http://tempuri.org/", className = "org.example.generated.AddColumn")
    @ResponseWrapper(localName = "AddColumnResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.AddColumnResponse")
    public boolean addColumn(
        @WebParam(name = "tableIndex", targetNamespace = "http://tempuri.org/")
        int tableIndex,
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        String name,
        @WebParam(name = "columnType", targetNamespace = "http://tempuri.org/")
        TypeColumn columnType);

    /**
     * 
     * @param tableIndex
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DeleteTable", action = "http://tempuri.org/DeleteTable")
    @WebResult(name = "DeleteTableResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteTable", targetNamespace = "http://tempuri.org/", className = "org.example.generated.DeleteTable")
    @ResponseWrapper(localName = "DeleteTableResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.DeleteTableResponse")
    public boolean deleteTable(
        @WebParam(name = "tableIndex", targetNamespace = "http://tempuri.org/")
        int tableIndex);

    /**
     * 
     * @param columnIndex
     * @param tableIndex
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DeleteColumn", action = "http://tempuri.org/DeleteColumn")
    @WebResult(name = "DeleteColumnResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteColumn", targetNamespace = "http://tempuri.org/", className = "org.example.generated.DeleteColumn")
    @ResponseWrapper(localName = "DeleteColumnResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.DeleteColumnResponse")
    public boolean deleteColumn(
        @WebParam(name = "tableIndex", targetNamespace = "http://tempuri.org/")
        int tableIndex,
        @WebParam(name = "columnIndex", targetNamespace = "http://tempuri.org/")
        int columnIndex);

    /**
     * 
     * @param rowIndex
     * @param tableIndex
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "DeleteRow", action = "http://tempuri.org/DeleteRow")
    @WebResult(name = "DeleteRowResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "DeleteRow", targetNamespace = "http://tempuri.org/", className = "org.example.generated.DeleteRow")
    @ResponseWrapper(localName = "DeleteRowResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.DeleteRowResponse")
    public boolean deleteRow(
        @WebParam(name = "tableIndex", targetNamespace = "http://tempuri.org/")
        int tableIndex,
        @WebParam(name = "rowIndex", targetNamespace = "http://tempuri.org/")
        int rowIndex);

    /**
     * 
     * @param rowIndex
     * @param columnIndex
     * @param value
     * @param tableIndex
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "EditCell", action = "http://tempuri.org/EditCell")
    @WebResult(name = "EditCellResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "EditCell", targetNamespace = "http://tempuri.org/", className = "org.example.generated.EditCell")
    @ResponseWrapper(localName = "EditCellResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.EditCellResponse")
    public boolean editCell(
        @WebParam(name = "tableIndex", targetNamespace = "http://tempuri.org/")
        int tableIndex,
        @WebParam(name = "rowIndex", targetNamespace = "http://tempuri.org/")
        int rowIndex,
        @WebParam(name = "columnIndex", targetNamespace = "http://tempuri.org/")
        int columnIndex,
        @WebParam(name = "value", targetNamespace = "http://tempuri.org/")
        String value);

    /**
     * 
     */
    @WebMethod(operationName = "CreateTestTable", action = "http://tempuri.org/CreateTestTable")
    @RequestWrapper(localName = "CreateTestTable", targetNamespace = "http://tempuri.org/", className = "org.example.generated.CreateTestTable")
    @ResponseWrapper(localName = "CreateTestTableResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.CreateTestTableResponse")
    public void createTestTable();

    /**
     * 
     * @param columnIndex
     * @param tableIndex
     * @param columnName
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ChangeColumnName", action = "http://tempuri.org/ChangeColumnName")
    @WebResult(name = "ChangeColumnNameResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ChangeColumnName", targetNamespace = "http://tempuri.org/", className = "org.example.generated.ChangeColumnName")
    @ResponseWrapper(localName = "ChangeColumnNameResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.ChangeColumnNameResponse")
    public boolean changeColumnName(
        @WebParam(name = "tableIndex", targetNamespace = "http://tempuri.org/")
        int tableIndex,
        @WebParam(name = "columnIndex", targetNamespace = "http://tempuri.org/")
        int columnIndex,
        @WebParam(name = "columnName", targetNamespace = "http://tempuri.org/")
        String columnName);

    /**
     * 
     * @param name2
     * @param name1
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "MergeTables", action = "http://tempuri.org/MergeTables")
    @WebResult(name = "MergeTablesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "MergeTables", targetNamespace = "http://tempuri.org/", className = "org.example.generated.MergeTables")
    @ResponseWrapper(localName = "MergeTablesResponse", targetNamespace = "http://tempuri.org/", className = "org.example.generated.MergeTablesResponse")
    public boolean mergeTables(
        @WebParam(name = "name1", targetNamespace = "http://tempuri.org/")
        String name1,
        @WebParam(name = "name2", targetNamespace = "http://tempuri.org/")
        String name2);

}
