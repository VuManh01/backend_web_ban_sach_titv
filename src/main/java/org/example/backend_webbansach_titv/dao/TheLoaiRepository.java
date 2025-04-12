package org.example.backend_webbansach_titv.dao;

import org.example.backend_webbansach_titv.entity.SachYeuThich;
import org.example.backend_webbansach_titv.entity.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "the-loai")
public interface TheLoaiRepository extends JpaRepository<TheLoai, Integer> {
}
