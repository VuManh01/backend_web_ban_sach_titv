package org.example.backend_webbansach_titv.entity;

import lombok.Data;

import java.util.List;
@Data

public class Quyen {
    private int maQuyen;
    private String tenQuyen;

    private List<NguoiDung> danhSachNguoiDung;
}
