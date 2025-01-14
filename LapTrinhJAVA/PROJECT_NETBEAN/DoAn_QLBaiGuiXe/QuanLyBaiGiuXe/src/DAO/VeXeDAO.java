package DAO;

import DTO.VeXe;
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

/**
 *
 * @author ADMIN
 */
public class VeXeDAO {

    private static VeXeDAO instance;

    public VeXeDAO() {
    }

    public static VeXeDAO getInstance() {
        if (instance == null) {
            instance = new VeXeDAO();
        }
        return instance;
    }

    public static void setInstance(VeXeDAO instance) {
        VeXeDAO.instance = instance;
    }

    // Lấy danh sách xe theo id vị trí
    public List<VeXe> getVeXeList(int idViTri) {
        List<VeXe> list = new ArrayList<>();
        Connection con = DBConnect.openConnection();
        try {
            String query = "SELECT veguixe.idVe, xekhachhang.bienSoXe, xekhachhang.loaiXe, veguixe.ngayGioGui, veguixe.trangThai " +
               "FROM xekhachhang " +
               "INNER JOIN veguixe ON xekhachhang.idXe = veguixe.idXe " +
               "WHERE veguixe.idViTri = ? AND veguixe.trangThai = 'ON'";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, idViTri); // Truyền id vị trí vào câu lệnh SQL
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int idVe = rs.getInt("idVe");
                String bienSoXe = rs.getString("bienSoXe");
                String loaiXe = rs.getString("loaiXe");
                Timestamp ngayGioGui = rs.getTimestamp("ngayGioGui");
                String trangThai = rs.getString("trangThai");

                VeXe veXe = new VeXe(idVe, bienSoXe, loaiXe, ngayGioGui, trangThai);
                list.add(veXe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeXeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
