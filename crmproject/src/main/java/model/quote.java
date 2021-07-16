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
public class quote {
    int IDQuote;
    String NameQuote, Detail_quote, note;
    private product id;
    private opportinities idop;

    public quote() {
    }

    public quote(int IDQuote, String NameQuote, String Detail_quote, String note, product id, opportinities idop) {
        this.IDQuote = IDQuote;
        this.NameQuote = NameQuote;
        this.Detail_quote = Detail_quote;
        this.note = note;
        this.id = id;
        this.idop = idop;
    }

    public int getIDQuote() {
        return IDQuote;
    }

    public void setIDQuote(int IDQuote) {
        this.IDQuote = IDQuote;
    }

    public String getNameQuote() {
        return NameQuote;
    }

    public void setNameQuote(String NameQuote) {
        this.NameQuote = NameQuote;
    }

    public String getDetail_quote() {
        return Detail_quote;
    }

    public void setDetail_quote(String Detail_quote) {
        this.Detail_quote = Detail_quote;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public product getId() {
        return id;
    }

    public void setId(product id) {
        this.id = id;
    }

    public opportinities getIdop() {
        return idop;
    }

    public void setIdop(opportinities idop) {
        this.idop = idop;
    }

    
    
}
