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
public class categoryPro {
     int idcateproduct;
    String namecateproduct;

    public categoryPro() {
    }

    public categoryPro(int idcateproduct, String namecateproduct) {
        this.idcateproduct = idcateproduct;
        this.namecateproduct = namecateproduct;
    }

    public categoryPro(String namecateproduct) {
        this.namecateproduct = namecateproduct;
    }

    public int getIdcateproduct() {
        return idcateproduct;
    }

    public void setIdcateproduct(int idcateproduct) {
        this.idcateproduct = idcateproduct;
    }

    public String getNamecateproduct() {
        return namecateproduct;
    }

    public void setNamecateproduct(String namecateproduct) {
        this.namecateproduct = namecateproduct;
    }
}
