package model.dto;

public class CustomerinfoDTO {
    private String colId;

    private String colName;

    private String colPhno;

    private String colAddress;

    private String colCity;

    public CustomerinfoDTO(String colId, String colName, String colPhno, String colAddress, String colCity) {
        this.colId = colId;
        this.colName = colName;
        this.colPhno = colPhno;
        this.colAddress = colAddress;
        this.colCity = colCity;
    }

    @Override
    public String toString() {
        return "CustomerinfoDTO{" +
                "colId='" + colId + '\'' +
                ", colName='" + colName + '\'' +
                ", colPhno='" + colPhno + '\'' +
                ", colAddress='" + colAddress + '\'' +
                ", colCity='" + colCity + '\'' +
                '}';
    }

    public String getColId() {
        return colId;
    }

    public String getColName() {
        return colName;
    }

    public String getColPhno() {
        return colPhno;
    }

    public String getColAddress() {
        return colAddress;
    }

    public String getColCity() {
        return colCity;
    }

    public void setColId(String colId) {
        this.colId = colId;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public void setColPhno(String colPhno) {
        this.colPhno = colPhno;
    }

    public void setColAddress(String colAddress) {
        this.colAddress = colAddress;
    }

    public void setColCity(String colCity) {
        this.colCity = colCity;
    }
}
