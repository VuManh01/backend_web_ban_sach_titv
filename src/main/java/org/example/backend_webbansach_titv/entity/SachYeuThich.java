package org.example.backend_webbansach_titv.entity;

import lombok.Data;

@Data

public class SachYeuThich {
    private int maSachYeuThich;

    private Sach sach;

    private NguoiDung nguoiDung;
}
