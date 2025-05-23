package org.example.backend_webbansach_titv.dao;

import org.example.backend_webbansach_titv.entity.HinhThucGiaoHang;
import org.example.backend_webbansach_titv.entity.HinhThucThanhToan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "hinh-thuc-thanh-toan")
public interface HinhThucThanhToanRepository extends JpaRepository<HinhThucThanhToan, Integer> {
}
