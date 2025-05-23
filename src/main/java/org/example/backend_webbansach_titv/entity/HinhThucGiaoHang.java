package org.example.backend_webbansach_titv.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "hinhthucgiaohangs")
public class HinhThucGiaoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_thuc_giao_hang")
    private int maHinhThucGiaoHang;

    @Column(name = "ten_hinh_thuc_giao_hang", length = 256)
    private String tenHinhThucGiaoHang;

    @Column(name = "mo_ta", columnDefinition = "text")
    private String moTa;

    @Column(name = "chi_phi_giao_hang")
    private double chiPhiGiaoHang;

    @OneToMany(mappedBy = "hinhThucGiaoHang", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DonHang> danhSachDonHang;
}
