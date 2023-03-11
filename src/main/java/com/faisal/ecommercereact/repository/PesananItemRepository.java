package com.faisal.ecommercereact.repository;

import com.faisal.ecommercereact.entity.PesananItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PesananItemRepository extends JpaRepository<PesananItem,String> {
}
