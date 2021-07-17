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
    int IDCateProduct;
    String NameCateProduct;

    public categoryPro() {
    }

    public categoryPro(int IDCateProduct, String NameCateProduct) {
        this.IDCateProduct = IDCateProduct;
        this.NameCateProduct = NameCateProduct;
    }

    public categoryPro(String namecateproduct) {
        this.NameCateProduct = namecateproduct;
    }

    public int getIDCateProduct() {
        return IDCateProduct;
    }

    public void setIDCateProduct(int IDCateProduct) {
        this.IDCateProduct = IDCateProduct;
    }

    public String getNameCateProduct() {
        return NameCateProduct;
    }

    public void setNameCateProduct(String namecateproduct) {
        this.NameCateProduct = namecateproduct;
    }
}
