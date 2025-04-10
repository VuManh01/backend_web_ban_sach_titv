package org.example.backend_webbansach_titv.entity;

import lombok.Data;

import java.util.List;
@Data

public class NguoiDung {
    private int maNguoiDung;
    private String hoDem;
    private String ten;
    private String tenDangNhap;
    private String matkhau;
    private char gioiTinh;
    private String email;
    private String soDienThoai;
    private String diaChiMuaHang;
    private String diaChiGiaoHang;

    private List<SuDanhGia> danhSachSuDanhGia;
    private List<SachYeuThich> danhSachSachYeuThich;
    private List<Quyen> danhSachQuyen;
    private List<DonHang> danhSachDonHang;
}
