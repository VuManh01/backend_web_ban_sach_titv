package org.example.backend_webbansach_titv.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sachyeuthichs")
public class SachYeuThich {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sach_yeu_thich")
    private int maSachYeuThich;

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
