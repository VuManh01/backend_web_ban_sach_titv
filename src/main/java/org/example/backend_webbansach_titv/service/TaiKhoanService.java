package org.example.backend_webbansach_titv.service;

import org.example.backend_webbansach_titv.dao.NguoiDungRepository;
import org.example.backend_webbansach_titv.entity.NguoiDung;
import org.example.backend_webbansach_titv.entity.ThongBao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TaiKhoanService {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    public ResponseEntity<?> dangkyNguoiDung(NguoiDung nguoiDung) {
        //kiem tra ten dang nhap da ton tai chua
        if(nguoiDungRepository.existsByTenDangNhap(nguoiDung.getTenDangNhap())) {
            return ResponseEntity.badRequest().body(new ThongBao("Tên đăng nhập đã tồn tại."));
        }
        //kiem tra email da ton tai chua
        if(nguoiDungRepository.existsByEmail(nguoiDung.getEmail())) {
            return ResponseEntity.badRequest().body(new ThongBao("Email đã tồn tại."));
        }
        //luu nguoi dung vao co so du lieu
        NguoiDung nguoiDungDaDangKyThanhCong = nguoiDungRepository.save(nguoiDung);
        return ResponseEntity.ok(new ThongBao("Đăng ký thành công."));
    }
}
