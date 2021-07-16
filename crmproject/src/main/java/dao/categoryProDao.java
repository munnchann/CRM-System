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
import model.categoryPro;
import util.DBConnection;

/**
 *
 * @author Mun Chan
 */
public class categoryProDao {
    
        public boolean insert(categoryPro catePro)
                throws Exception {
            String sql = "INSERT INTO categoryPro(idcateproduct,  namecateproduct) values(?,?)";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(1, catePro.getIdcateproduct());
                pstmt.setString(2, catePro.getNamecateproduct());
                return pstmt.executeUpdate() > 0;
            }
        }

        public boolean update(categoryPro catePro)
                throws Exception {
            String sql = "update categoryPro"
                    + " set namecateproduct = ?"
                    + " where idcateproduct= ?";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(2, catePro.getIdcateproduct());
                pstmt.setString(1, catePro.getNamecateproduct());
                return pstmt.executeUpdate() > 0;
            }
        }

        public boolean delete(categoryPro catePro)
                throws Exception {
            String sql = "delete from categoryPro"
                    + " where idcateproduct= ?";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(1, catePro.getIdcateproduct());
                return pstmt.executeUpdate() > 0;
            }
        }

        public categoryPro  findById(int id)
                throws Exception {
            String sql = "select* from categoryPro where idcateproduct= ?";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(1, id);
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        categoryPro catePro = createCategory(rs);
                        return catePro;
                    }
                }

            }
            return null;
        }

        public categoryPro findByName(String namecateproduct)
                throws Exception {
            String sql = "select* from categoryPro where namecateproduct='" + namecateproduct + "'";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        categoryPro catePro = createCategory(rs);
                        return catePro;
                    }
                }

            }
            return null;
        }

        private categoryPro createCategory(final ResultSet rs) throws SQLException {
            categoryPro catePro = new categoryPro();
            catePro.setIdcateproduct(rs.getInt("idcateproduct"));
            catePro.setNamecateproduct(rs.getString("namecateproduct"));
            return catePro;
        }

        public List<categoryPro> findAll()
                throws Exception {
            String sql = "select * from categoryPro";
            try (
                    Connection con = DBConnection.openConnection();
                    PreparedStatement pstmt = con.prepareStatement(sql);) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    List<categoryPro> listPro = new ArrayList<>();
                    while (rs.next()) {
                        categoryPro catePro = createCategory(rs);
                        listPro.add(catePro);
                    }
                    return listPro;
                }

            }

        }
}
