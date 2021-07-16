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
public class leads {
    int IDLead;
    String NameLead, PhoneLead, EmailLead, note;
    private interviewees idin;

    public leads() {
    }

    public leads(int IDLead, String NameLead, String PhoneLead, String EmailLead, String note, interviewees idin) {
        this.IDLead = IDLead;
        this.NameLead = NameLead;
        this.PhoneLead = PhoneLead;
        this.EmailLead = EmailLead;
        this.note = note;
        this.idin = idin;
    }

    public int getIDLead() {
        return IDLead;
    }

    public void setIDLead(int IDLead) {
        this.IDLead = IDLead;
    }

    public String getNameLead() {
        return NameLead;
    }

    public void setNameLead(String NameLead) {
        this.NameLead = NameLead;
    }

    public String getPhoneLead() {
        return PhoneLead;
    }

    public void setPhoneLead(String PhoneLead) {
        this.PhoneLead = PhoneLead;
    }

    public String getEmailLead() {
        return EmailLead;
    }

    public void setEmailLead(String EmailLead) {
        this.EmailLead = EmailLead;
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
