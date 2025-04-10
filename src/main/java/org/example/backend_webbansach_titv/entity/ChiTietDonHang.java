package org.example.backend_webbansach_titv.entity;

import lombok.Data;

@Data
public class ChiTietDonHang {
    private long chiTietGioHang;
    private int soLuong;
    private double giaBan;


    private Sach sach;
    private DonHang donHang;
}
