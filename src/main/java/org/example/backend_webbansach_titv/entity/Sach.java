package org.example.backend_webbansach_titv.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "sachs")
public class Sach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sach")
    private int maSach;

    @Column(name = "ten_sach", length = 256)
    private String tenSach;

    @Column(name = "ten_tac_gia", length = 512)
    private String tenTacGia;

    @Column(name = "ISBN", length = 256)
    private String ISBN; //ma so xuat ban cua quyen sach

    @Column(name = "mo_ta", columnDefinition = "text")
    private String moTa;

    @Column(name = "gia_niem_yet")
    private double giaNiemYet;

    @Column(name = "gia_ban")
    private double giaBan;

    @Column(name = "so_luong")
    private int soLuong;

    @Column(name = "trung_binh_xep_hang")
    private double trungBinhXepHang;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH
    })
            @JoinTable(
                    name = "sach_theloai",
                    joinColumns = @JoinColumn(name = "ma_sach"),
                    inverseJoinColumns = @JoinColumn(name = "ma_theloai")
            )
    List<TheLoai> danhSachTheLoai;

    @OneToMany(mappedBy = "sach", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH,
            CascadeType.REMOVE
    }) // tương đương cascade = CascadeType.ALL
    private List<HinhAnh> danhSachHinhAnh;

    @OneToMany(mappedBy = "sach", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SuDanhGia> danhSachSuDanhGia;

    @OneToMany(mappedBy = "sach", fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH
    })
    private List<ChiTietDonHang> danhSachChiTietDonHang;

    @OneToMany(mappedBy = "sach", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SachYeuThich> danhSachSachYeuThich;
}
