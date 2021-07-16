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
public class customer {
    int ID;
    String NameCustomer, PhoneCustomer, EmailCustomer;
    String SetCustomer;
    private interviewees idin;

    public customer() {
    }

    public customer(int ID, String NameCustomer, String PhoneCustomer, String EmailCustomer, String SetCustomer, interviewees idin) {
        this.ID = ID;
        this.NameCustomer = NameCustomer;
        this.PhoneCustomer = PhoneCustomer;
        this.EmailCustomer = EmailCustomer;
        this.SetCustomer = SetCustomer;
        this.idin = idin;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameCustomer() {
        return NameCustomer;
    }

    public void setNameCustomer(String NameCustomer) {
        this.NameCustomer = NameCustomer;
    }

    public String getPhoneCustomer() {
        return PhoneCustomer;
    }

    public void setPhoneCustomer(String PhoneCustomer) {
        this.PhoneCustomer = PhoneCustomer;
    }

    public String getEmailCustomer() {
        return EmailCustomer;
    }

    public void setEmailCustomer(String EmailCustomer) {
        this.EmailCustomer = EmailCustomer;
    }

    public String getSetCustomer() {
        return SetCustomer;
    }

    public void setSetCustomer(String SetCustomer) {
        this.SetCustomer = SetCustomer;
    }

    public interviewees getIdin() {
        return idin;
    }

    public void setIdin(interviewees idin) {
        this.idin = idin;
    }
    
}
