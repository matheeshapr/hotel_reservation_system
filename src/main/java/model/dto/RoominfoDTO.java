package model.dto;

import javafx.collections.ObservableArray;
import lombok.*;

public class RoominfoDTO {

    private String colno;

    private  String coltype;

    private String coldisc;

    private double colprice;

    public RoominfoDTO(String colno, String coltype, String coldisc, double colprice) {
        this.colno = colno;
        this.coltype = coltype;
        this.coldisc = coldisc;
        this.colprice = colprice;
    }

    @Override
    public String toString() {
        return "RoominfoDTO{" +
                "colno='" + colno + '\'' +
                ", coltype='" + coltype + '\'' +
                ", coldisc='" + coldisc + '\'' +
                ", colprice=" + colprice +
                '}';
    }

    public String getColno() {
        return colno;
    }

    public String getColtype() {
        return coltype;
    }

    public String getColdisc() {
        return coldisc;
    }

    public double getColprice() {
        return colprice;
    }

    public void setColno(String colno) {
        this.colno = colno;
    }

    public void setColtype(String coltype) {
        this.coltype = coltype;
    }

    public void setColdisc(String coldisc) {
        this.coldisc = coldisc;
    }

    public void setColprice(double colprice) {
        this.colprice = colprice;
    }
}
