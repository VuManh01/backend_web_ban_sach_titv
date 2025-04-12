package org.example.backend_webbansach_titv.dao;

import org.example.backend_webbansach_titv.entity.SachYeuThich;
import org.example.backend_webbansach_titv.entity.SuDanhGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "sư-danh-gia")
public interface SuDanhGiaRepository extends JpaRepository<SuDanhGia, Long> {
}
