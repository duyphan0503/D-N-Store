/*
 * DTO Class for KhachHang Table
 */
package DTO;

/**
 *
 * @author TRI
 */
public class KhachHang {

    private int idKhachHang; // Primary Key
    private String hoTen; // Full name of the customer
    private String soDienThoai; // Phone number
    private String diaChi; // Address

    // Default constructor
    public KhachHang() {
    }

    // Parameterized constructor
    public KhachHang(int idKhachHang, String hoTen, String soDienThoai, String diaChi) {
        this.idKhachHang = idKhachHang;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    // Getters and Setters
    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
