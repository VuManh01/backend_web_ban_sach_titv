package org.example.backend_webbansach_titv.entity;

import lombok.Data;

import java.util.List;
@Data

public class Sach {
    private int maSach;
    private String tenSach;
    private String tenTacGia;
    private String ISBN; //ma so xuat ban cua quyen sach
    private String moTa;
    private double giaNiemYet;
    private double giaBan;
    private int soLuong;
    private double trungBinhXepHang;

    private List<TheLoai> danhSachTheLoai;

    private List<HinhAnh> danhSachHinhAnh;

    private List<SuDanhGia> danhSachSuDanhGia;

    private List<ChiTietDonHang> danhSachChiTietDonHang;

    private List<SachYeuThich> danhSachSachYeuThich;
}
