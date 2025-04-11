package org.example.backend_webbansach_titv.dao;

import org.example.backend_webbansach_titv.entity.SachYeuThich;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuDanhGiaRepository extends JpaRepository<SachYeuThich, Long> {
}
