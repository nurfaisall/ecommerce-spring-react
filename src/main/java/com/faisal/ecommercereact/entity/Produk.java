package com.faisal.ecommercereact.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Produk implements Serializable {
    @Id
    private String id;
    private String nama;
    private String deskripsi;
    private String gambar;
    @JoinColumn
    @ManyToOne
    private Kategori kategori;
    private BigDecimal harga;
    private Double stok;
}
