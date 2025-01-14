/*
 * DTO Class for TaiKhoan Table
 */
package DTO;

/**
 *
 * @author TRI
 */
public class TaiKhoan {

    private int idTaiKhoan; // Primary Key
    private String tenDangNhap; // Username
    private String matKhau; // Password
    private String vaiTro; // Role: QuanLy or NhanVien

    // Default constructor
    public TaiKhoan() {
    }

    // Parameterized constructor
    public TaiKhoan(int idTaiKhoan, String tenDangNhap, String matKhau, String vaiTro) {
        this.idTaiKhoan = idTaiKhoan;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
    }

    // Getters and Setters
    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        this.idTaiKhoan = idTaiKhoan;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }
}
