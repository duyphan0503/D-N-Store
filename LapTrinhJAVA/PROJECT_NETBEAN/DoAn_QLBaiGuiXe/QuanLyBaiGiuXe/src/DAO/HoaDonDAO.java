package DAO;

import DTO.HoaDon;
import Utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.jfr.Timespan;

/**
 *
 * @author ADMIN
 */
public class HoaDonDAO {

    private static HoaDonDAO instance;

    public HoaDonDAO() {
    }

    // Singleton pattern
    public static HoaDonDAO getInstance() {
        if (instance == null) {
            instance = new HoaDonDAO();
        }
        return instance;
    }

    public static void setInstance(HoaDonDAO instance) {
        HoaDonDAO.instance = instance;
    }

    /**
     * Thêm hóa đơn vào cơ sở dữ liệu
     */
    public boolean AddHoaDon(int idVe, Timestamp ngayGioNhan, double tongTien, int idTaiKhoan) {
    Connection con = DBConnect.openConnection();
    try {
        String query = "INSERT INTO hoadon (idVe, ngayGioNhan, tongTien, idTaiKhoan) VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setInt(1, idVe); // Foreign Key referencing Ve
        pstmt.setTimestamp(2, ngayGioNhan); // Ngày giờ nhận
        pstmt.setDouble(3, tongTien); // Tổng tiền
        pstmt.setInt(4, idTaiKhoan); // Foreign Key referencing TaiKhoan
        int rowsAffected = pstmt.executeUpdate();
        return rowsAffected > 0;
    } catch (SQLException ex) {
        Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}


    /**
     * Lấy danh sách tất cả hóa đơn
     */
    public List<HoaDon> GetListHoaDon() {
        List<HoaDon> list = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            String query = "SELECT * FROM hoadon";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon(
                        rs.getInt("idHoaDon"),  // ID hóa đơn
                        rs.getInt("idVe"),      // ID vé
                        rs.getString("ngayGioNhan"), // Ngày giờ nhận
                        rs.getDouble("tongTien"), // Tổng tiền
                        rs.getInt("idTaiKhoan") // ID tài khoản
                );
                list.add(hoaDon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    /**
     * Cập nhật thông tin hóa đơn
     */
    public boolean UpdateHoaDon(int idHoaDon, int idVe, String ngayGioNhan, double tongTien, int idTaiKhoan) {
        Connection con = DBConnect.openConnection();
        try {
            String query = "UPDATE hoadon SET idVe = ?, ngayGioNhan = ?, tongTien = ?, idTaiKhoan = ? WHERE idHoaDon = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idVe);
            pstmt.setString(2, ngayGioNhan);
            pstmt.setDouble(3, tongTien);
            pstmt.setInt(4, idTaiKhoan);
            pstmt.setInt(5, idHoaDon);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Xóa hóa đơn theo ID
     */
    public boolean DeleteHoaDon(int idHoaDon) {
        Connection con = DBConnect.openConnection();
        try {
            String query = "DELETE FROM hoadon WHERE idHoaDon = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idHoaDon);
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /**
     * Lấy thông tin hóa đơn theo ID
     */
    public HoaDon GetHoaDonById(int idHoaDon) {
        Connection con = DBConnect.openConnection();
        try {
            String query = "SELECT * FROM hoadon WHERE idHoaDon = ?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idHoaDon);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new HoaDon(
                        rs.getInt("idHoaDon"),
                        rs.getInt("idVe"),
                        rs.getString("ngayGioNhan"),
                        rs.getDouble("tongTien"),
                        rs.getInt("idTaiKhoan")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public List<HoaDon> GetFullHoaDonDetails() {
        List<HoaDon> list = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            String query = "SELECT xekhachhang.bienSoXe, khachhang.hoTen AS tenKhachHang, veguixe.ngayGioGui, " +
               "hoadon.idHoaDon, hoadon.ngayGioNhan, hoadon.tongTien, taikhoan.tenDangNhap AS nguoiInHoaDon " +
               "FROM hoadon " +
               "INNER JOIN veguixe ON hoadon.idVe = veguixe.idVe " +
               "INNER JOIN xekhachhang ON veguixe.idXe = xekhachhang.idXe " +
               "INNER JOIN khachhang ON xekhachhang.idKhachHang = khachhang.idKhachHang " +
               "INNER JOIN taikhoan ON hoadon.idTaiKhoan = taikhoan.idTaiKhoan";

            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                // Tạo đối tượng HoaDon
                HoaDon hoaDon = new HoaDon();

                // Lấy dữ liệu từ ResultSet và thiết lập vào các thuộc tính của đối tượng
                hoaDon.setIdHoaDon(rs.getInt("idHoaDon")); // ID hóa đơn
                hoaDon.setBienSoXe(rs.getString("bienSoXe")); // Biển số xe
                hoaDon.setTenKhachHang(rs.getString("tenKhachHang")); // Tên khách hàng
                hoaDon.setNgayGioGui(rs.getTimestamp("ngayGioGui")); // Ngày giờ gửi
                hoaDon.setNgayGioNhan(rs.getTimestamp("ngayGioNhan")); // Ngày giờ nhận
                hoaDon.setTongTien(rs.getDouble("tongTien")); // Tổng tiền
                hoaDon.setNguoiInHoaDon(rs.getString("nguoiInHoaDon")); // Người in hóa đơn

                // Thêm đối tượng vào danh sách
                list.add(hoaDon);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
