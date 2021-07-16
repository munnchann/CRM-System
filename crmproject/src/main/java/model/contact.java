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
public class contact {
    int ID;
    String Namecontact, PhoneContact, EmailContact, note;
    private interviewees idin;

    public contact() {
    }

    public contact(int ID, String Namecontact, String PhoneContact, String EmailContact, String note, interviewees idin) {
        this.ID = ID;
        this.Namecontact = Namecontact;
        this.PhoneContact = PhoneContact;
        this.EmailContact = EmailContact;
        this.note = note;
        this.idin = idin;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNamecontact() {
        return Namecontact;
    }

    public void setNamecontact(String Namecontact) {
        this.Namecontact = Namecontact;
    }

    public String getPhoneContact() {
        return PhoneContact;
    }

    public void setPhoneContact(String PhoneContact) {
        this.PhoneContact = PhoneContact;
    }

    public String getEmailContact() {
        return EmailContact;
    }

    public void setEmailContact(String EmailContact) {
        this.EmailContact = EmailContact;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public interviewees getIdin() {
        return idin;
    }

    public void setIdin(interviewees idin) {
        this.idin = idin;
    }
    
}
