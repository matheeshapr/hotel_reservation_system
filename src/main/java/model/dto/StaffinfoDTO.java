package model.dto;

public class StaffinfoDTO {
    private String colid;
    private String colname;
    private String colrole;
    private String colemail;
    private String colphno;
    private double colsalary;

    public StaffinfoDTO(String colid, String colname, String colrole, String colemail, String colphno, double colsalary) {
        this.colid = colid;
        this.colname = colname;
        this.colrole = colrole;
        this.colemail = colemail;
        this.colphno = colphno;
        this.colsalary = colsalary;
    }

    public String getColid() {
        return colid;
    }

    public String getColname() {
        return colname;
    }

    public String getColrole() {
        return colrole;
    }

    public String getColemail() {
        return colemail;
    }

    public String getColphno() {
        return colphno;
    }

    public double getColsalary() {
        return colsalary;
    }

    public void setColid(String colid) {
        this.colid = colid;
    }

    public void setColname(String colname) {
        this.colname = colname;
    }

    public void setColrole(String colrole) {
        this.colrole = colrole;
    }

    public void setColemail(String colemail) {
        this.colemail = colemail;
    }

    public void setColphno(String colphno) {
        this.colphno = colphno;
    }

    public void setColsalary(double colsalary) {
        this.colsalary = colsalary;
    }
}



