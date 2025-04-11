package org.example.backend_webbansach_titv.dao;

import org.example.backend_webbansach_titv.entity.ChiTietDonHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChiTietDonHangRepository extends JpaRepository<ChiTietDonHang, Long> {
}
