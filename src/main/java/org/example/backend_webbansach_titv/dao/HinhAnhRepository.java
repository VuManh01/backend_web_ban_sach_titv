package org.example.backend_webbansach_titv.dao;

import org.example.backend_webbansach_titv.entity.DonHang;
import org.example.backend_webbansach_titv.entity.HinhAnh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "hinh-anh")
public interface HinhAnhRepository extends JpaRepository<HinhAnh, Integer> {
}
