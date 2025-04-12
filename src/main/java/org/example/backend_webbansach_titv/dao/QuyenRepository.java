package org.example.backend_webbansach_titv.dao;

import org.example.backend_webbansach_titv.entity.NguoiDung;
import org.example.backend_webbansach_titv.entity.Quyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "quyen")
public interface QuyenRepository extends JpaRepository<Quyen, Integer> {
}
