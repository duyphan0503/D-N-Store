/*
 * DTO Class for HoaDon Table
 */
package DTO;

import java.sql.Timestamp;

/**
 *
 * @author TRI
 */
public class HoaDon {

    private int idHoaDon; // Primary Key
    private int idVe; // Foreign Key referencing Ve
    private Timestamp ngayGioNhan; // Date and time of receiving
    private double tongTien; // Total amount
    private int idTaiKhoan; // Foreign Key referencing TaiKhoan

    // Các thuộc tính bổ sung
    private String bienSoXe; // Biển số xe
    private String tenKhachHang; // Tên khách hàng
    private Timestamp ngayGioGui; // Ngày giờ gửi
    private String nguoiInHoaDon; // Người in hóa đơn

    // Default constructor
    public HoaDon() {
    }

    // Parameterized constructor
    public HoaDon(int idHoaDon, int idVe, Timestamp ngayGioNhan, double tongTien, int idTaiKhoan, String bienSoXe, String tenKhachHang, Timestamp ngayGioGui, String nguoiInHoaDon) {
        this.idHoaDon = idHoaDon;
        this.idVe = idVe;
        this.ngayGioNhan = ngayGioNhan;
        this.tongTien = tongTien;
        this.idTaiKhoan = idTaiKhoan;
        this.bienSoXe = bienSoXe;
        this.tenKhachHang = tenKhachHang;
        this.ngayGioGui = ngayGioGui;
        this.nguoiInHoaDon = nguoiInHoaDon;
    }

    public HoaDon(int aInt, int aInt0, String string, double aDouble, int aInt1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters and Setters
    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getIdVe() {
        return idVe;
    }

    public void setIdVe(int idVe) {
        this.idVe = idVe;
    }

    public Timestamp getNgayGioNhan() {
        return ngayGioNhan;
    }

    public void setNgayGioNhan(Timestamp ngayGioNhan) {
        this.ngayGioNhan = ngayGioNhan;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public Timestamp getNgayGioGui() {
        return ngayGioGui;
    }

    public void setNgayGioGui(Timestamp ngayGioGui) {
        this.ngayGioGui = ngayGioGui;
    }

    public String getNguoiInHoaDon() {
        return nguoiInHoaDon;
    }

    public void setNguoiInHoaDon(String nguoiInHoaDon) {
        this.nguoiInHoaDon = nguoiInHoaDon;
    }
}
