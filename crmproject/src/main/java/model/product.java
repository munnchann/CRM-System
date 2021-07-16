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
public class product {
    int id;
    String codePro;
    String namePro;
    Double price;
    String descriptionPro;
    int amount;
    private categoryPro cate_pro;

    public product() {
    }
    
    public product(int id,String codePro, String namePro, Double price, String descriptionPro, int amount, categoryPro cate_pro) {
        this.id = id;
        this.codePro = codePro;
        this.namePro = namePro;
        this.price = price;
        this.descriptionPro = descriptionPro;
        this.amount = amount;
        this.cate_pro = cate_pro;
    }

    public product(String codePro,String namePro, Double price, String descriptionPro, int amount, categoryPro cate_pro) {
         this.codePro = codePro;
        this.namePro = namePro;
        this.price = price;
        this.descriptionPro = descriptionPro;
        this.amount = amount;
        this.cate_pro = cate_pro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodePro() {
        return codePro;
    }

    public void setCodePro(String codePro) {
        this.codePro = codePro;
    }
    
    public String getNamePro() {
        return namePro;
    }

    public void setNamePro(String namePro) {
        this.namePro = namePro;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescriptionPro() {
        return descriptionPro;
    }

    public void setDescriptionPro(String descriptionPro) {
        this.descriptionPro = descriptionPro;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public categoryPro getCate_pro() {
        return cate_pro;
    }

    public void setCate_pro(categoryPro cate_pro) {
        this.cate_pro = cate_pro;
    }
}
