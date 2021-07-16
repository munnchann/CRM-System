/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.employee;
import util.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import model.category_employee;

/**
 *
 * @author Mun Chan
 */
public class employeeDao {

    private static employeeDao instance = null;

    public employeeDao() {
    }

    public static employeeDao GetInstance() {
        if (instance == null) {
            instance = new employeeDao();
        }
        return instance;
    }

    public boolean insert(employee emp)
            throws Exception {
        String sql = "INSERT INTO employee(`ID`, `AccountEmployee`, `PassEmployee`, `NameEmployee`, `Phone`, `EmailEmployee`, `SexEmployee`, `Salary`, `IDCateEmp` )"
                + "values(?,?,?,?,?,?,?,?,?)";
        try (
                Connection con = DBConnection.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, emp.getID());
            pstmt.setString(2, emp.getAccoutEmployee());
            pstmt.setString(3, emp.getPassEmployee());
            pstmt.setString(4, emp.getNameEmployee());
            pstmt.setString(5, emp.getPhone());
            pstmt.setString(6, emp.getEmailEmployee());
            pstmt.setString(7, emp.getSexEmployee());
            pstmt.setDouble(8, emp.getSalary());
            pstmt.setInt(9, emp.getCate_emp().getIDCateEmp());
            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean update(employee emp)
            throws Exception {
        String sql = "update employee"
                + " set `AccountEmployee`=?, `PassEmployee`=?, `NameEmployee`=?, `Phone`=?, `EmailEmployee`=?, `SexEmployee`=?, `Salary`=?, `IDCateEmp`=? "
                + " where ID= ?";
        try (
                Connection con = DBConnection.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(9, emp.getID());
            pstmt.setString(1, emp.getAccoutEmployee());
            pstmt.setString(2, emp.getPassEmployee());
            pstmt.setString(3, emp.getNameEmployee());
            pstmt.setString(4, emp.getPhone());
            pstmt.setString(5, emp.getEmailEmployee());
            pstmt.setString(6, emp.getSexEmployee());
            pstmt.setDouble(7, emp.getSalary());
            pstmt.setInt(8, emp.getCate_emp().getIDCateEmp());
            return pstmt.executeUpdate() > 0;
        }
    }

    public boolean delete(employee emp)
            throws Exception {
        String sql = "delete from employee"
                + " where ID= ?";
        try (
                Connection con = DBConnection.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, emp.getID());
            return pstmt.executeUpdate() > 0;
        }
    }

    public employee findById(int id)
            throws Exception {
        String sql = "SELECT employee.ID, AccountEmployee, PassEmployee, NameEmployee, Phone, EmailEmployee, SexEmployee, Salary, IDCateEmp, category_employee.Position FROM employee INNER JOIN category_employee ON employee.IDCateEmp= category_employee.IDCateEmp where employee.ID='" + id + "'";
        try (
                Connection con = DBConnection.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    employee emp = new employee();
                    emp.setID(rs.getInt("ID"));
                    emp.setAccoutEmployee(rs.getString("AccoutEmployee"));
                    emp.setPassEmployee(rs.getString("PassEmployee"));
                    emp.setNameEmployee(rs.getString("NameEmployee"));
                    emp.setEmailEmployee(rs.getString("EmailEmployee"));
                    emp.setSexEmployee(rs.getString("SexEmployee"));
                    emp.setSalary(rs.getDouble("Salary"));
                    emp.setCate_emp(new category_employee(rs.getInt("IDCateEmp"), rs.getString("Postion")));
                    return emp;
                }
            }

        }
        return null;
    }

    private employee createEmp(final ResultSet rs) throws SQLException {
        employee emp = new employee();
        emp.setID(rs.getInt("ID"));
        emp.setAccoutEmployee(rs.getString("AccoutEmployee"));
        emp.setPassEmployee(rs.getString("PassEmployee"));
        emp.setNameEmployee(rs.getString("NameEmployee"));
        emp.setEmailEmployee(rs.getString("EmailEmployee"));
        emp.setSexEmployee(rs.getString("SexEmployee"));
        emp.setSalary(rs.getDouble("Salary"));
        emp.setCate_emp(new category_employee(rs.getInt("IDCateEmp"), rs.getString("Postion")));
        return emp;
    }

    public List<employee> findAll() throws Exception {
        List<employee> listemp = new ArrayList<>();
        Statement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT employee.ID, AccountEmployee, PassEmployee, NameEmployee, Phone, EmailEmployee, SexEmployee, Salary, IDCateEmp, category_employee.Position FROM employee INNER JOIN category_employee ON employee.IDCateEmp= category_employee.IDCateEmp";
            Connection con = DBConnection.openConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                employee emp = new employee();
                emp.setID(rs.getInt("ID"));
                emp.setAccoutEmployee(rs.getString("AccoutEmployee"));
                emp.setPassEmployee(rs.getString("PassEmployee"));
                emp.setNameEmployee(rs.getString("NameEmployee"));
                emp.setEmailEmployee(rs.getString("EmailEmployee"));
                emp.setSexEmployee(rs.getString("SexEmployee"));
                emp.setSalary(rs.getDouble("Salary"));
                emp.setCate_emp(new category_employee(rs.getInt("IDCateEmp"), rs.getString("Postion")));
                listemp.add(emp);
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
        return listemp;
    }
}
