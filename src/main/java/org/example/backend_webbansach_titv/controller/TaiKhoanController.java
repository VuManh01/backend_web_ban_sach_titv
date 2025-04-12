package org.example.backend_webbansach_titv.controller;

import org.example.backend_webbansach_titv.entity.NguoiDung;
import org.example.backend_webbansach_titv.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tai-khoan")
public class TaiKhoanController {

    @Autowired
    private TaiKhoanService taiKhoanService;

    @PostMapping("/dang-ky")
    public ResponseEntity<?> dangKyNguoiDung (@RequestBody NguoiDung nguoiDung) {
        ResponseEntity<?> response = taiKhoanService.dangkyNguoiDung(nguoiDung);
        return response;
    }

}
