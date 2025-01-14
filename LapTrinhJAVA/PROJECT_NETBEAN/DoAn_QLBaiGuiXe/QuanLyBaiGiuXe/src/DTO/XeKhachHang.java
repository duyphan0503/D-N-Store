/*
 * DTO Class for XeKhachHang Table
 */
package DTO;

/**
 *
 * @author TRI
 */
public class XeKhachHang {

    private int idXe; // Primary Key
    private String bienSoXe; // License plate
    private int idKhachHang; // Foreign Key referencing KhachHang
    private String loaiXe; // Type of vehicle

    // Default constructor
    public XeKhachHang() {
    }
    
    public XeKhachHang(int idXe, String bienSoXe) {
        this.idXe = idXe;
        this.bienSoXe = bienSoXe;
    }

    // Parameterized constructor
    public XeKhachHang(int idXe, String bienSoXe, int idKhachHang, String loaiXe) {
        this.idXe = idXe;
        this.bienSoXe = bienSoXe;
        this.idKhachHang = idKhachHang;
        this.loaiXe = loaiXe;
    }

    // Getters and Setters
    public int getIdXe() {
        return idXe;
    }

    public void setIdXe(int idXe) {
        this.idXe = idXe;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
    
    @Override
    public String toString() {
        return bienSoXe;
    }
}
