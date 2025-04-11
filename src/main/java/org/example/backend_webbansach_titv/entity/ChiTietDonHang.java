package org.example.backend_webbansach_titv.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "chitietdonhangs")
public class ChiTietDonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chi_tiet_gio_hang")
    private long chiTietGioHang;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "gia_ban")
    private double giaBan;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ma_sach" , nullable = false)
    private Sach sach;

    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "ma_don_hang", nullable = false)
    private DonHang donHang; //====================================
}
