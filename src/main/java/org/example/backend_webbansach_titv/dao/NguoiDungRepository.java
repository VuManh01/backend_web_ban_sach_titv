package org.example.backend_webbansach_titv.dao;

import org.example.backend_webbansach_titv.entity.HinhThucThanhToan;
import org.example.backend_webbansach_titv.entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "nguoi-dung")
public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {
    //kiem tra ten dang nhap da ton tai chua
    boolean existsByTenDangNhap(String tenDangNhap);
    //kiem tra email da ton tai chua
    boolean existsByEmail(String email);

}
