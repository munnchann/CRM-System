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
public class bill {
    int ID;
    private customer idcustomer;
    String dateBill;
    private orders idorder;

    public bill() {
    }

    public bill(int ID, customer idcustomer, String dateBill, orders idorder) {
        this.ID = ID;
        this.idcustomer = idcustomer;
        this.dateBill = dateBill;
        this.idorder = idorder;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public customer getIdcustomer() {
        return idcustomer;
    }

    public void setIdcustomer(customer idcustomer) {
        this.idcustomer = idcustomer;
    }

    public String getDateBill() {
        return dateBill;
    }

    public void setDateBill(String dateBill) {
        this.dateBill = dateBill;
    }

    public orders getIdorder() {
        return idorder;
    }

    public void setIdorder(orders idorder) {
        this.idorder = idorder;
    }
    
}
