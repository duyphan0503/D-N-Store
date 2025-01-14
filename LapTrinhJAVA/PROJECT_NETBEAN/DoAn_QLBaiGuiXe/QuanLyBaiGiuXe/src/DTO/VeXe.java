/*
 * DTO Class for VeXe Table
 */
package DTO;

import java.sql.Timestamp;

public class VeXe {

    private int idVe;         // ID vé
    private String bienSoXe;  // Biển số xe
    private String loaiXe;    // Loại xe
    private Timestamp ngayGioGui; // Ngày giờ gửi (kiểu Timestamp)
    private String trangThai;

    // Constructor mặc định
    public VeXe() {
    }

    // Constructor có tham số
    public VeXe(int idVe, String bienSoXe, String loaiXe, Timestamp ngayGioGui, String trangThai) {
        this.idVe = idVe;
        this.bienSoXe = bienSoXe;
        this.loaiXe = loaiXe;
        this.ngayGioGui = ngayGioGui;
        this.trangThai = trangThai;
    }

    // Getters và Setters
    public int getIdVe() {
        return idVe;
    }

    public void setIdVe(int idVe) {
        this.idVe = idVe;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public Timestamp getNgayGioGui() {
        return ngayGioGui;
    }

    public void setNgayGioGui(Timestamp ngayGioGui) {
        this.ngayGioGui = ngayGioGui;
    }
    public String gettrangThai(){
        return trangThai;
    }
    public void setTrangThai(String trangThai){
        this.trangThai = trangThai;
    }
}
