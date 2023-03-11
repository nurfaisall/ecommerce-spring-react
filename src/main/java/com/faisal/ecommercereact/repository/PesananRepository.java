package com.faisal.ecommercereact.repository;

import com.faisal.ecommercereact.entity.Pesanan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesananRepository extends JpaRepository<Pesanan,String> {
}
