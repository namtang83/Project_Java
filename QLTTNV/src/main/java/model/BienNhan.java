/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author NamTang
 */
public class BienNhan {
    private int maBN;
    private NhanVien nhanVien;
    private float thuongThem;
    private float tongTien;
    private Date ngayNhan;
    private String nguoiNhap;

    public BienNhan(int maBN, NhanVien nhanvien, float thuongThem, float tongTien, Date ngayNhan, String nguoiNhap) {
        this.maBN = maBN;
        this.nhanVien = nhanvien;
        this.thuongThem = thuongThem;
        this.tongTien = tongTien;
        this.ngayNhan = ngayNhan;
        this.nguoiNhap = nguoiNhap;
    }

    public BienNhan() {
        maBN = 0;
        nhanVien=new NhanVien();
        thuongThem = 0.0f;
        tongTien = 0.0f;
        ngayNhan = new Date();
        nguoiNhap = new String();
    }

    public String getNguoiNhap() {
        return nguoiNhap;
    }

    public void setNguoiNhap(String nguoiNhap) {
        this.nguoiNhap = nguoiNhap;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public int getMaBN() {
        return maBN;
    }

    public void setMaBN(int maBN) {
        this.maBN = maBN;
    }

    public Date getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(Date ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public float getThuongThem() {
        return thuongThem;
    }

    public void setThuongThem(float thuongThem) {
        this.thuongThem = thuongThem;
    }

    @Override
    public String toString() {
        return "BienNhan{" + "maBN=" + maBN + ", nhanVien=" + nhanVien + ", thuongThem=" + thuongThem + ", tongTien=" + tongTien + ", ngayNhan=" + ngayNhan + ", nguoiNhap=" + nguoiNhap + '}';
    }
    
    
    
}
