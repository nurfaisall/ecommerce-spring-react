package com.faisal.ecommercereact.repository;

import com.faisal.ecommercereact.entity.PesananLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PesananLogRepository extends JpaRepository<PesananLog,String> {
}
