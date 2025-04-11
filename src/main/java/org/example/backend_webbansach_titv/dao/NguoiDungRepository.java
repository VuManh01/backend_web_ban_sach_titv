package org.example.backend_webbansach_titv.dao;

import org.example.backend_webbansach_titv.entity.HinhThucThanhToan;
import org.example.backend_webbansach_titv.entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung, Integer> {
}
