package org.example.backend_webbansach_titv.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sudanhgias")
public class SuDanhGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_danh_gia")
    private long maDanhGia;

    @Column(name = "diem_xep_hang")
    private float diemXepHang;

    @Column(name = "nhan_xet", columnDefinition = "text")
    private String nhanXet;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ma_sach", nullable = false)
    private Sach sach;

    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "ma_nguoi_dung", nullable = false)
    private NguoiDung nguoiDung;

}
