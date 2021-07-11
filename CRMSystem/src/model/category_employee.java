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
public class category_employee {
    int IDCateEmp;
    String Position;
    int RankEmployee;

    public category_employee() {
    }

    public category_employee(int IDCateEmp, String Position, int RankEmployee) {
        this.IDCateEmp = IDCateEmp;
        this.Position = Position;
        this.RankEmployee = RankEmployee;
    }

    public category_employee(String Position, int RankEmployee) {
        this.Position = Position;
        this.RankEmployee = RankEmployee;
    }

    public category_employee(int IDCateEmp, String Position) {
        this.IDCateEmp = IDCateEmp;
        this.Position = Position;
    }
    
    public int getIDCateEmp() {
        return IDCateEmp;
    }

    public void setIDCateEmp(int IDCateEmp) {
        this.IDCateEmp = IDCateEmp;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public int getRankEmployee() {
        return RankEmployee;
    }

    public void setRankEmployee(int RankEmployee) {
        this.RankEmployee = RankEmployee;
    }
    
}
