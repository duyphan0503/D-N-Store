/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.Ve;
import Utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Timestamp;


/**
 *
 * @author ADMIN
 */
public class VeDAO {
    private static VeDAO instance;

    public VeDAO() {
    }

    public static VeDAO getInstance() {
        if (instance == null) {
            instance = new VeDAO();
        }
        return instance;
    }

    public static void setInstance(VeDAO instance) {
        VeDAO.instance = instance;
    }

    public List<Ve> GetXeByViTri(int id) {
        List<Ve> list = new ArrayList<Ve>();
        Connection con = DBConnect.openConnection();
        try {
            // Câu truy vấn SQL lấy dữ liệu từ bảng xekhachhang và veguixe
            PreparedStatement pstmt = con.prepareStatement("SELECT `xekhachhang`.`idXe`, `xekhachhang`.`bienSoXe`, `xekhachhang`.`loaiXe`, `veguixe`.`ngayGioGui`, `veguixe`.`trangThai` " +
                                                            "FROM `xekhachhang`, `veguixe` " +
                                                            "WHERE `veguixe`.`idXe` = `xekhachhang`.`idXe` AND `veguixe`.`idVe` = ?");
            pstmt.setInt(1, id); // Gán giá trị tham số idVe vào câu truy vấn
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                // Tạo đối tượng Ve và ánh xạ dữ liệu từ ResultSet
                Ve ve = new Ve(
                    rs.getInt(1),         // idXe
                    rs.getString(2),      // bienSoXe
                    rs.getString(3),      // loaiXe
                    rs.getTimestamp(4),    // ngayGioGui
                    rs.getString(5)
                );
                list.add(ve); // Thêm đối tượng Ve vào danh sách
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list; // Trả về danh sách các đối tượng Ve
    }
    public boolean AddVe(Ve ve) {
        Connection con = DBConnect.openConnection();
        try {
            String sql = "INSERT INTO veguixe (idXe, idViTri, ngayGioGui, idTaiKhoan) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, ve.getIdXe());
            pstmt.setInt(2, ve.getIdViTri());
            pstmt.setTimestamp(3, ve.getNgayGioGui());
            pstmt.setInt(4, ve.getIdTaiKhoan());
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException ex) {
            Logger.getLogger(VeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean UpdateTrangThaiVe(int idVe, String trangThai){
        Connection con = DBConnect.openConnection();
        try {
            String sql = "UPDATE veguixe SET trangThai = ? WHERE idVe = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, trangThai);
            pstmt.setInt(2, idVe);
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ViTriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
