package DAO;

import DTO.XeKhachHang;
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
public class XeKhachHangDAO {

    private static XeKhachHangDAO instance;

    public XeKhachHangDAO() {
    }

    public static XeKhachHangDAO getInstance() {
        if (instance == null) {
            instance = new XeKhachHangDAO();
        }
        return instance;
    }

    public static void setInstance(XeKhachHangDAO instance) {
        XeKhachHangDAO.instance = instance;
    }

    // Phương thức lấy danh sách xe khách hàng
    public List<XeKhachHang> LoadListXeKhachHang() {
        List<XeKhachHang> listXeKhachHang = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `xekhachhang`");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                XeKhachHang xeKhachHang = new XeKhachHang(
                        rs.getInt("idXe"),
                        rs.getString("bienSoXe"),
                        rs.getInt("idKhachHang"),
                        rs.getString("loaiXe")
                );
                listXeKhachHang.add(xeKhachHang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeKhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listXeKhachHang;
    }

    // Phương thức thêm xe khách hàng mới
    public Boolean AddXeKhachHang(String bienSoXe, int idKhachHang, String loaiXe) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO `xekhachhang`(`bienSoXe`, `idKhachHang`, `loaiXe`) VALUES (?, ?, ?)");
            pstmt.setString(1, bienSoXe);
            pstmt.setInt(2, idKhachHang);
            pstmt.setString(3, loaiXe);
            int i = pstmt.executeUpdate();
            return i > 0;
        } catch (SQLException ex) {
            Logger.getLogger(XeKhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Phương thức cập nhật thông tin xe khách hàng
    public Boolean UpdateXeKhachHang(int idXe, String bienSoXe, int idKhachHang, String loaiXe) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `xekhachhang` SET `bienSoXe` = ?, `idKhachHang` = ?, `loaiXe` = ? WHERE `idXe` = ?");
            pstmt.setString(1, bienSoXe);
            pstmt.setInt(2, idKhachHang);
            pstmt.setString(3, loaiXe);
            pstmt.setInt(4, idXe);
            int i = pstmt.executeUpdate();
            return i > 0;
        } catch (SQLException ex) {
            Logger.getLogger(XeKhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Phương thức xóa xe khách hàng
    public Boolean DeleteXeKhachHang(int idXe) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM `xekhachhang` WHERE `idXe` = ?");
            pstmt.setInt(1, idXe);
            int i = pstmt.executeUpdate();
            return i > 0;
        } catch (SQLException ex) {
            Logger.getLogger(XeKhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Phương thức tìm kiếm xe khách hàng theo biển số xe
    public List<XeKhachHang> SearchXeKhachHangByLicensePlate(String bienSoXe) {
        List<XeKhachHang> listXeKhachHang = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `xekhachhang` WHERE `bienSoXe` LIKE ?");
            pstmt.setString(1, "%" + bienSoXe + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                XeKhachHang xeKhachHang = new XeKhachHang(
                        rs.getInt("idXe"),
                        rs.getString("bienSoXe"),
                        rs.getInt("idKhachHang"),
                        rs.getString("loaiXe")
                );
                listXeKhachHang.add(xeKhachHang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeKhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listXeKhachHang;
    }
    
    // Phương thức lấy danh sách idKhachHang kèm theo tên khách hàng
    public List<String> LoadIdKhachHangWithName() {
        List<String> listIdKhachHangWithName = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            // Truy vấn JOIN giữa bảng xekhachhang và khachhang
            String query = "SELECT k.idKhachHang, k.hoTen FROM xekhachhang x " +
                           "JOIN khachhang k ON x.idKhachHang = k.idKhachHang";
            PreparedStatement pstmt = con.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                int idKhachHang = rs.getInt("idKhachHang");
                String hoTen = rs.getString("hoTen");
                listIdKhachHangWithName.add(idKhachHang + " - " + hoTen);
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeKhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (con != null) {
                    con.close(); // Đảm bảo đóng kết nối
                }
            } catch (SQLException ex) {
                Logger.getLogger(XeKhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listIdKhachHangWithName;
    }
}
