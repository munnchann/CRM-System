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
public class interviewees {
    int IDInterviewees;
    String NameInterviewees, PhoneInterviewees, EmailInterviewees;

    public interviewees() {
    }

    public interviewees(int IDInterviewees, String NameInterviewees, String PhoneInterviewees, String EmailInterviewees) {
        this.IDInterviewees = IDInterviewees;
        this.NameInterviewees = NameInterviewees;
        this.PhoneInterviewees = PhoneInterviewees;
        this.EmailInterviewees = EmailInterviewees;
    }

    public int getIDInterviewees() {
        return IDInterviewees;
    }

    public void setIDInterviewees(int IDInterviewees) {
        this.IDInterviewees = IDInterviewees;
    }

    public String getNameInterviewees() {
        return NameInterviewees;
    }

    public void setNameInterviewees(String NameInterviewees) {
        this.NameInterviewees = NameInterviewees;
    }

    public String getPhoneInterviewees() {
        return PhoneInterviewees;
    }

    public void setPhoneInterviewees(String PhoneInterviewees) {
        this.PhoneInterviewees = PhoneInterviewees;
    }

    public String getEmailInterviewees() {
        return EmailInterviewees;
    }

    public void setEmailInterviewees(String EmailInterviewees) {
        this.EmailInterviewees = EmailInterviewees;
    }
    
}
