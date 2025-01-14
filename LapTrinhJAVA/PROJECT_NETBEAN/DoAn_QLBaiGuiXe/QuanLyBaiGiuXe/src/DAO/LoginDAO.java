/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.TaiKhoan;
import Utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TRI
 */
public class LoginDAO {

    private static LoginDAO instance;
    TaiKhoan taiKhoan = new TaiKhoan();

    public LoginDAO() {
    }

    public static LoginDAO getInstance() {
        if (instance == null) {
            instance = new LoginDAO();
        }
        return instance;
    }

    public static void setInstance(LoginDAO instance) {
        LoginDAO.instance = instance;
    }

    public Boolean Login(String tenDangNhap, String matKhau) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `taikhoan` WHERE tenDangNhap = ? AND matKhau = ?");
            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                taiKhoan.setIdTaiKhoan(rs.getInt("idTaiKhoan"));
                taiKhoan.setTenDangNhap(rs.getString("tenDangNhap"));
                taiKhoan.setMatKhau(rs.getString("matKhau"));
                taiKhoan.setVaiTro(rs.getString("vaiTro"));
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public TaiKhoan GetTaiKhoan() {
        return taiKhoan;
    }

    public List<TaiKhoan> listTaiKhoan() {
        List<TaiKhoan> list = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `taikhoan`");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(
                        rs.getInt("idTaiKhoan"),
                        rs.getString("tenDangNhap"),
                        rs.getString("matKhau"),
                        rs.getString("vaiTro")
                );
                list.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public Boolean Add(String tenDangNhap, String matKhau, String vaiTro) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO `taikhoan`(`tenDangNhap`, `matKhau`, `vaiTro`) VALUES (?, ?, ?)");
            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);
            pstmt.setString(3, vaiTro);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean Update(int idTaiKhoan, String tenDangNhap, String matKhau, String vaiTro) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `taikhoan` SET `tenDangNhap`=?, `matKhau`=?, `vaiTro`=? WHERE `idTaiKhoan`=?");
            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);
            pstmt.setString(3, vaiTro);
            pstmt.setInt(4, idTaiKhoan);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean Delete(int idTaiKhoan) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM `taikhoan` WHERE `idTaiKhoan`=?");
            pstmt.setInt(1, idTaiKhoan);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Boolean DoiMatKhau(int idTaiKhoan, String matKhau) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `taikhoan` SET `matKhau`=? WHERE `idTaiKhoan`=?");
            pstmt.setString(1, matKhau);
            pstmt.setInt(2, idTaiKhoan);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public List<TaiKhoan> SearchByName(String tenTK) {
        List<TaiKhoan> listTK = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `taikhoan` WHERE `tenDangNhap` LIKE ?");
            pstmt.setString(1, "%" + tenTK + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(
                        rs.getInt("idTaiKhoan"),
                        rs.getString("tenDangNhap"),
                        rs.getString("matKhau"),
                        rs.getString("vaiTro")
                );
                listTK.add(tk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTK;
    }
}
