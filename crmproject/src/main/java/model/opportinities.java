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
public class opportinities {
    int IDOppor;
    String NameOpoprtunities, Detail_Oppor, note;

    public opportinities() {
    }

    public opportinities(int IDOppor, String NameOpoprtunities, String Detail_Oppor, String note) {
        this.IDOppor = IDOppor;
        this.NameOpoprtunities = NameOpoprtunities;
        this.Detail_Oppor = Detail_Oppor;
        this.note = note;
    }

    public int getIDOppor() {
        return IDOppor;
    }

    public void setIDOppor(int IDOppor) {
        this.IDOppor = IDOppor;
    }

    public String getNameOpoprtunities() {
        return NameOpoprtunities;
    }

    public void setNameOpoprtunities(String NameOpoprtunities) {
        this.NameOpoprtunities = NameOpoprtunities;
    }

    public String getDetail_Oppor() {
        return Detail_Oppor;
    }

    public void setDetail_Oppor(String Detail_Oppor) {
        this.Detail_Oppor = Detail_Oppor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
}
