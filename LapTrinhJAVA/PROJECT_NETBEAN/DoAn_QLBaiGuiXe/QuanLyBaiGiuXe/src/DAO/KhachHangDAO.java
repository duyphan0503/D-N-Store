package DAO;

import DTO.KhachHang;
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
public class KhachHangDAO {

    private static KhachHangDAO instance;

    public KhachHangDAO() {
    }

    public static KhachHangDAO getInstance() {
        if (instance == null) {
            instance = new KhachHangDAO();
        }
        return instance;
    }

    public static void setInstance(KhachHangDAO instance) {
        KhachHangDAO.instance = instance;
    }

    // Phương thức lấy danh sách khách hàng
    public List<KhachHang> LoadListKhachHang() {
        List<KhachHang> listKhachHang = new ArrayList<>();

        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `khachhang`");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                KhachHang khachHang = new KhachHang(
                        rs.getInt("idKhachHang"),
                        rs.getString("hoTen"),
                        rs.getString("soDienThoai"),
                        rs.getString("diaChi")
                );
                listKhachHang.add(khachHang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKhachHang;
    }

    // Phương thức thêm khách hàng mới
    public Boolean AddKhachHang(String hoTen, String soDienThoai, String diaChi) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO `khachhang`(`hoTen`, `soDienThoai`, `diaChi`) VALUES (?, ?, ?)");
            pstmt.setString(1, hoTen);
            pstmt.setString(2, soDienThoai);
            pstmt.setString(3, diaChi);
            int i = pstmt.executeUpdate();
            return i > 0;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Phương thức cập nhật thông tin khách hàng
    public Boolean UpdateKhachHang(int idKhachHang, String hoTen, String soDienThoai, String diaChi) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `khachhang` SET `hoTen` = ?, `soDienThoai` = ?, `diaChi` = ? WHERE `idKhachHang` = ?");
            pstmt.setString(1, hoTen);
            pstmt.setString(2, soDienThoai);
            pstmt.setString(3, diaChi);
            pstmt.setInt(4, idKhachHang);
            int i = pstmt.executeUpdate();
            return i > 0;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Phương thức xóa khách hàng
    public Boolean DeleteKhachHang(int idKhachHang) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM `khachhang` WHERE `idKhachHang` = ?");
            pstmt.setInt(1, idKhachHang);
            int i = pstmt.executeUpdate();
            return i > 0;
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Phương thức tìm kiếm khách hàng theo số điện thoại
    public List<KhachHang> SearchKhachHangByPhone(String soDienThoai) {
        List<KhachHang> listKhachHang = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `khachhang` WHERE `soDienThoai` LIKE ?");
            pstmt.setString(1, "%" + soDienThoai + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                KhachHang khachHang = new KhachHang(
                        rs.getInt("idKhachHang"),
                        rs.getString("hoTen"),
                        rs.getString("soDienThoai"),
                        rs.getString("diaChi")
                );
                listKhachHang.add(khachHang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKhachHang;
    }
}