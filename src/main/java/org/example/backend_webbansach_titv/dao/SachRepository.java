package org.example.backend_webbansach_titv.dao;

import org.example.backend_webbansach_titv.entity.Quyen;
import org.example.backend_webbansach_titv.entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "sach")
public interface SachRepository extends JpaRepository<Sach, Integer> {
}
