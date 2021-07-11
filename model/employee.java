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
public class employee {
    int ID;
    String AccoutEmployee, PassEmployee, NameEmployee, Phone, EmailEmployee, SexEmployee;
    Double Salary;
    private category_employee cate_emp;

    public employee() {
    }

    public employee(int ID, String AccoutEmployee, String PassEmployee, String NameEmployee, String Phone, String EmailEmployee, String SexEmployee, Double Salary, category_employee cate_emp) {
        this.ID = ID;
        this.AccoutEmployee = AccoutEmployee;
        this.PassEmployee = PassEmployee;
        this.NameEmployee = NameEmployee;
        this.Phone = Phone;
        this.EmailEmployee = EmailEmployee;
        this.SexEmployee = SexEmployee;
        this.Salary = Salary;
        this.cate_emp = cate_emp;
    }

    public employee(String AccoutEmployee, String PassEmployee, String NameEmployee, String Phone, String EmailEmployee, String SexEmployee, Double Salary, category_employee cate_emp) {
        this.AccoutEmployee = AccoutEmployee;
        this.PassEmployee = PassEmployee;
        this.NameEmployee = NameEmployee;
        this.Phone = Phone;
        this.EmailEmployee = EmailEmployee;
        this.SexEmployee = SexEmployee;
        this.Salary = Salary;
        this.cate_emp = cate_emp;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAccoutEmployee() {
        return AccoutEmployee;
    }

    public void setAccoutEmployee(String AccoutEmployee) {
        this.AccoutEmployee = AccoutEmployee;
    }

    public String getPassEmployee() {
        return PassEmployee;
    }

    public void setPassEmployee(String PassEmployee) {
        this.PassEmployee = PassEmployee;
    }

    public String getNameEmployee() {
        return NameEmployee;
    }

    public void setNameEmployee(String NameEmployee) {
        this.NameEmployee = NameEmployee;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmailEmployee() {
        return EmailEmployee;
    }

    public void setEmailEmployee(String EmailEmployee) {
        this.EmailEmployee = EmailEmployee;
    }

    public String getSexEmployee() {
        return SexEmployee;
    }

    public void setSexEmployee(String SexEmployee) {
        this.SexEmployee = SexEmployee;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double Salary) {
        this.Salary = Salary;
    }

    public category_employee getCate_emp() {
        return cate_emp;
    }

    public void setCate_emp(category_employee cate_emp) {
        this.cate_emp = cate_emp;
    }
    
}
