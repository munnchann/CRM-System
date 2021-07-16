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
public class orderdetail {
    int ID;
    private product idpro;
    private orders idorders;
    Float Total;

    public orderdetail() {
    }

    public orderdetail(int ID, product idpro, orders idorders, Float Total) {
        this.ID = ID;
        this.idpro = idpro;
        this.idorders = idorders;
        this.Total = Total;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public product getIdpro() {
        return idpro;
    }

    public void setIdpro(product idpro) {
        this.idpro = idpro;
    }

    public orders getIdorders() {
        return idorders;
    }

    public void setIdorders(orders idorders) {
        this.idorders = idorders;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }
    
}
