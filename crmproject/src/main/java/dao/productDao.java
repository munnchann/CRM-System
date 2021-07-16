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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.categoryPro;
import model.product;
import util.DBConnection;

/**
 *
 * @author Mun Chan
 */
public class productDao {

    private static productDao instance = null;

    public productDao() {
    }

    public static productDao GetInstance() {
        if (instance == null) {
            instance = new productDao();
        }
        return instance;
    }

    public boolean insert(product pro)
            throws Exception {
        String sql = "INSERT INTO product(`id`, codePro, namePro, price, descriptionPro, amount, `cate_pro` )"
                + "values(?,?,?,?,?,?,?)";
        try (
                Connection con = DBConnection.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, pro.getId());
            pstmt.setString(2, pro.getCodePro());
            pstmt.setString(3, pro.getNamePro());
            pstmt.setDouble(4, pro.getPrice());
            pstmt.setString(5, pro.getDescriptionPro());
            pstmt.setInt(6, pro.getAmount());
            pstmt.setInt(7, pro.getCate_pro().getIdcateproduct());
            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean update(product pro)
            throws Exception {
        String sql = "update product"
                + " set  codePro=?, namePro=?, price=?, descriptionPro=?, amount=?, `cate_pro=?` "
                + " where id= ?";
        try (
                Connection con = DBConnection.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(7, pro.getId());
            pstmt.setString(1, pro.getCodePro());
            pstmt.setString(2, pro.getNamePro());
            pstmt.setDouble(3, pro.getPrice());
            pstmt.setString(4, pro.getDescriptionPro());
            pstmt.setInt(5, pro.getAmount());
            pstmt.setInt(6, pro.getCate_pro().getIdcateproduct());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean delete(product pro)
            throws Exception {
        String sql = "delete from product"
                + " where id= ?";
        try (
                Connection con = DBConnection.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, pro.getId());
            return pstmt.executeUpdate() > 0;
        }
    }

    public product findById(int id)
            throws Exception {
        String sql = "SELECT product.id, codePro, namePro, price, descriptionPro, amount, `cate_pro`, categoryPro.namecateproduct  FROM product INNER JOIN categoryPro ON product.cate_pro= categoryPro.idcateproduct where product.id='" + id + "'";
        try (
                Connection con = DBConnection.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    product pro = new product();
                    pro.setId(rs.getInt("Id"));
                    pro.setCodePro(rs.getString("codePro"));
                    pro.setNamePro(rs.getString("namePro"));
                    pro.setPrice(rs.getDouble("price"));
                    pro.setDescriptionPro(rs.getString("descriptionPro"));
                    pro.setAmount(rs.getInt("amount"));
                    pro.setCate_pro(new categoryPro(rs.getInt("cate_pro"), rs.getString("namecatepro")));
                    return pro;
                }
            }

        }
        return null;
    }
//
//    private employee createEmp(final ResultSet rs) throws SQLException {
//        employee emp = new employee();
//        emp.setID(rs.getInt("ID"));
//        emp.setAccoutEmployee(rs.getString("AccoutEmployee"));
//        emp.setPassEmployee(rs.getString("PassEmployee"));
//        emp.setNameEmployee(rs.getString("NameEmployee"));
//        emp.setEmailEmployee(rs.getString("EmailEmployee"));
//        emp.setSexEmployee(rs.getString("SexEmployee"));
//        emp.setSalary(rs.getDouble("Salary"));
//        emp.setCate_emp(new category_employee(rs.getInt("IDCateEmp"), rs.getString("Postion")));
//        return emp;
//    }

    public List<product> findAll() throws Exception {
        List<product> listpro = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT product.id, codePro, namePro, price, descriptionPro, amount, `cate_pro`, categoryPro.namecateproduct  FROM product INNER JOIN categoryPro ON product.cate_pro= categoryPro.idcateproduct where product.id=";
            Connection con = DBConnection.openConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                product pro = new product();
                pro.setId(rs.getInt("Id"));
                pro.setCodePro(rs.getString("codePro"));
                pro.setNamePro(rs.getString("namePro"));
                pro.setPrice(rs.getDouble("price"));
                pro.setDescriptionPro(rs.getString("descriptionPro"));
                pro.setAmount(rs.getInt("amount"));
                pro.setCate_pro(new categoryPro(rs.getInt("cate_pro"), rs.getString("namecatepro")));
                listpro.add(pro);
            }
//                return listbook;
        } catch (SQLException e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                stmt.close();
            } catch (Exception e) {
            }
        }
        return listpro;
    }
}
