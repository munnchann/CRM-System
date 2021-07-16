/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mun Chan
 */
public class orders {
    int ID;
    String Dat;
    private customer idcus;
    Double Total;

    public orders() {
    }

    public orders(int ID, String Dat, customer idcus, Double Total) {
        this.ID = ID;
        this.Dat = Dat;
        this.idcus = idcus;
        this.Total = Total;
    }

    public orders(String Dat, customer idcus, Double Total) {
        this.Dat = Dat;
        this.idcus = idcus;
        this.Total = Total;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDat() {
        return Dat;
    }

    public void setDat(String Dat) {
        this.Dat = Dat;
    }

    public customer getIdcus() {
        return idcus;
    }

    public void setIdcus(customer idcus) {
        this.idcus = idcus;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }
    
}
