package DAO;

import DTO.ViTri;
import Utilities.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViTriDAO {
    
    private static ViTriDAO instance;

    public ViTriDAO() {
    }

    // Singleton pattern to ensure only one instance of this DAO is created
    public static ViTriDAO getInstance() {
        if (instance == null) {
            instance = new ViTriDAO();
        }
        return instance;
    }

    public static void setInstance(ViTriDAO instance) {
        ViTriDAO.instance = instance;
    }

    // Phương thức lấy danh sách vị trí
    public List<ViTri> LoadListViTri() {
        List<ViTri> listViTri = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `vitriguixe`");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ViTri viTri = new ViTri(
                        rs.getInt("idViTri"),
                        rs.getString("tenViTri"),
                        rs.getString("trangThai")
                );
                listViTri.add(viTri);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViTriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listViTri;
    }

    // Phương thức thêm vị trí mới
    public Boolean AddViTri(String tenViTri, String trangThai) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO `vitriguixe`(`tenViTri`, `trangThai`) VALUES (?, ?)");
            pstmt.setString(1, tenViTri);
            pstmt.setString(2, trangThai);
            int i = pstmt.executeUpdate();
            return i > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ViTriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Phương thức cập nhật thông tin vị trí
    public Boolean UpdateViTri(int idViTri, String tenViTri, String trangThai) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("UPDATE `vitriguixe` SET `tenViTri` = ?, `trangThai` = ? WHERE `idViTri` = ?");
            pstmt.setString(1, tenViTri);
            pstmt.setString(2, trangThai);
            pstmt.setInt(3, idViTri);
            int i = pstmt.executeUpdate();
            return i > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ViTriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Phương thức xóa vị trí
    public Boolean DeleteViTri(int idViTri) {
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("DELETE FROM `vitriguixe` WHERE `idViTri` = ?");
            pstmt.setInt(1, idViTri);
            int i = pstmt.executeUpdate();
            return i > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ViTriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Phương thức tìm kiếm vị trí theo tên
    public List<ViTri> SearchViTriByName(String tenViTri) {
        List<ViTri> listViTri = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `vitriguixe` WHERE `tenViTri` LIKE ?");
            pstmt.setString(1, "%" + tenViTri + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ViTri viTri = new ViTri(
                        rs.getInt("idViTri"),
                        rs.getString("tenViTri"),
                        rs.getString("trangThai")
                );
                listViTri.add(viTri);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViTriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listViTri;
    }
    public boolean UpdateTrangThaiViTri(int idViTri, String trangThai) {
        Connection con = DBConnect.openConnection();
        try {
            String sql = "UPDATE vitriguixe SET trangThai = ? WHERE idViTri = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, trangThai);
            pstmt.setInt(2, idViTri);
            int rows = pstmt.executeUpdate();
            return rows > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ViTriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<ViTri> LoadListViTriByStatus(String status) {
        List<ViTri> listViTri = new ArrayList<>();

        Connection con = DBConnect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM `vitriguixe` WHERE `trangThai` = ?");
            pstmt.setString(1, status); // Gán giá trị cho tham số `?`
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ViTri viTri = new ViTri(
                        rs.getInt("idViTri"),
                        rs.getString("tenViTri"),
                        rs.getString("trangThai")
                );
                listViTri.add(viTri);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ViTriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listViTri;
    }
}
