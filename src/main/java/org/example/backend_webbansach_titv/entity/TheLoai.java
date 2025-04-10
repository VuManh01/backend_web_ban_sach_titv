package org.example.backend_webbansach_titv.entity;

import lombok.Data;

import java.util.List;


@Data
public class TheLoai {
    private int maTheLoai;
    private String tenTheLoai;

    private List<Sach> danhSachQuyenSach;
}
