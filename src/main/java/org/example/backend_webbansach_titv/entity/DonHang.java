package org.example.backend_webbansach_titv.entity;

import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class DonHang {
    private int maDonHang;
    private Date ngayTao;
    private String diaChiMuaHang;
    private String diaChiNhanHang;
    private double tongTienSanPham;
    private double chiPhiThanhToan;
    private double tongTien;

    private List<ChiTietDonHang> danhSachChiTietDonHang;
    private NguoiDung nguoiDung;
    private HinhThucThanhToan hinhThucThanhToan;
    private HinhThucGiaoHang hinhThucGiaoHang;
}
