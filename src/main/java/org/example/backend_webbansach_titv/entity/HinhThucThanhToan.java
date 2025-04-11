package org.example.backend_webbansach_titv.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "hinhthucthanhtoans")
public class HinhThucThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_thuc_thanh_toan")
    private int maHinhThucThanhToan;

    @Column(name = "ten_hinh_thuc_thanh_toan", length = 256)
    private String tenHinhThucThanhToan;

    @Column(name = "mo_ta", columnDefinition = "text")
    private String moTa;

    @Column(name = "chi_phi_thanh_toan")
    private double chiPhiThanhToan;


    @OneToMany(mappedBy = "hinhThucThanhToan", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DonHang> danhSachDonHang;
}
