/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.category_employee;
import util.DBConnection;

/**
 *
 * @author Mun Chan
 */
public class categoryemp {

    public class categorydao {

        public boolean insert(category_employee catemp)
                throws Exception {
            String sql = "INSERT INTO categoryemployee(IDCateEmp, Position, RankEmployee) values(?,?,?)";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(1, catemp.getIDCateEmp());
                pstmt.setString(2, catemp.getPosition());
                pstmt.setInt(3, catemp.getRankEmployee());
                return pstmt.executeUpdate() > 0;
            }
        }

        public boolean update(category_employee catemp)
                throws Exception {
            String sql = "update categoryemployee"
                    + " set Position= ?, RankEmployee = ?"
                    + " where IDCateEmp= ?";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(3, catemp.getIDCateEmp());
                pstmt.setString(1, catemp.getPosition());
                pstmt.setInt(2, catemp.getRankEmployee());
                return pstmt.executeUpdate() > 0;
            }
        }

        public boolean delete(category_employee catemp)
                throws Exception {
            String sql = "delete from categoryemployee"
                    + " where IDCateEmp= ?";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(1, catemp.getIDCateEmp());
                return pstmt.executeUpdate() > 0;
            }
        }

        public category_employee findById(int id)
                throws Exception {
            String sql = "select* from categoryemployee where IDCateEmp= ?";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(1, id);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        category_employee catemp = createCategory(rs);
                        return catemp;
                    }
                }

            }
            return null;
        }

        public category_employee findByName(String Position)
                throws Exception {
            String sql = "select* from categoryemployee where Position='" + Position + "'";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        category_employee catemp = createCategory(rs);
                        return catemp;
                    }
                }

            }
            return null;
        }

        private category_employee createCategory(final ResultSet rs) throws SQLException {
            category_employee catemp = new category_employee();
            catemp.setIDCateEmp(rs.getInt("IDCateEmp"));
            catemp.setPosition(rs.getString("Position"));
            catemp.setRankEmployee(rs.getInt("RankEmploye"));
            return catemp;
        }

        public List<category_employee> findAll()
                throws Exception {
            String sql = "select * from categoryemployee";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    List<category_employee> listcate = new ArrayList<>();
                    while (rs.next()) {
                        category_employee catemp = createCategory(rs);
                        listcate.add(catemp);
                    }
                    return listcate;
                }

            }

        }
    }
}
