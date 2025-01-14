/*
 * DTO Class for ViTri Table
 */
package DTO;

/**
 *
 * @author TRI
 */
public class ViTri {

    private int idViTri; // Primary Key
    private String tenViTri; // Name of the location
    private String trangThai; // Status (e.g., Trong, DangSuDung)

    // Default constructor
    public ViTri() {
    }

    // Parameterized constructor
    public ViTri(int idViTri, String tenViTri, String trangThai) {
        this.idViTri = idViTri;
        this.tenViTri = tenViTri;
        this.trangThai = trangThai;
    }

    // Getters and Setters
    public int getIdViTri() {
        return idViTri;
    }

    public void setIdViTri(int idViTri) {
        this.idViTri = idViTri;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}
