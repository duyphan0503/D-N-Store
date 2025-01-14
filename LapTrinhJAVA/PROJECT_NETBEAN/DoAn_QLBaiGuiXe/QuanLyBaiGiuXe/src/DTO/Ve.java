package DTO;

import java.sql.Timestamp;

public class Ve {

    private int idVe; // Primary Key
    private int idXe; // Foreign Key referencing xekhachhang
    private int idViTri; // Foreign Key referencing vitri
    private Timestamp ngayGioGui; // Datetime
    private String trangThai;
    private int idTaiKhoan; // Foreign Key referencing taikhoan
    
    public Ve(){
        
    }

    // Default constructor
    public Ve(int aInt, String string, String string1, Timestamp timestamp, String string2) {
    }

    // Parameterized constructor
    public Ve(int idVe, int idXe, int idViTri, Timestamp ngayGioGui, String trangThai, int idTaiKhoan) {
        this.idVe = idVe;
        this.idXe = idXe;
        this.idViTri = idViTri;
        this.ngayGioGui = ngayGioGui;
        this.trangThai = trangThai;
        this.idTaiKhoan = idTaiKhoan;
    }

    // Getters and Setters
    public int getIdVe() {
        return idVe;
    }

    public void setIdVe(int idVe) {
        this.idVe = idVe;
    }

    public int getIdXe() {
        return idXe;
    }

    public void setIdXe(int idXe) {
        this.idXe = idXe;
    }

    public int getIdViTri() {
        return idViTri;
    }

    public void setIdViTri(int idViTri) {
        this.idViTri = idViTri;
    }

    public Timestamp getNgayGioGui() {
        return ngayGioGui;
    }

    public void setNgayGioGui(Timestamp ngayGioGui) {
        this.ngayGioGui = ngayGioGui;
    }

    public String getTrangThai(){
        return trangThai;
    }
    
    public void setTrangThai(String trangThai){
        this.trangThai = trangThai;
    }
    
    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }
}
