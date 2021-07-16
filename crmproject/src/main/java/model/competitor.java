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
public class competitor {
    int IDCompetitor;
    String NameCompetitor;
    String Oppor_Competitor, Detail_Oppor;

    public competitor() {
    }

    public competitor(int IDCompetitor, String NameCompetitor, String Oppor_Competitor, String Detail_Oppor) {
        this.IDCompetitor = IDCompetitor;
        this.NameCompetitor = NameCompetitor;
        this.Oppor_Competitor = Oppor_Competitor;
        this.Detail_Oppor = Detail_Oppor;
    }

    public int getIDCompetitor() {
        return IDCompetitor;
    }

    public void setIDCompetitor(int IDCompetitor) {
        this.IDCompetitor = IDCompetitor;
    }

    public String getNameCompetitor() {
        return NameCompetitor;
    }

    public void setNameCompetitor(String NameCompetitor) {
        this.NameCompetitor = NameCompetitor;
    }

    public String getOppor_Competitor() {
        return Oppor_Competitor;
    }

    public void setOppor_Competitor(String Oppor_Competitor) {
        this.Oppor_Competitor = Oppor_Competitor;
    }

    public String getDetail_Oppor() {
        return Detail_Oppor;
    }

    public void setDetail_Oppor(String Detail_Oppor) {
        this.Detail_Oppor = Detail_Oppor;
    }
    
}
