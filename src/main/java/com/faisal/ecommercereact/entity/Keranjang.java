package com.faisal.ecommercereact.entity;

import jakarta.persistence.*;
import lombok.Data;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Keranjang implements Serializable {

    @Id
    private String id;
    @JoinColumn
    @ManyToOne
    private Produk produk;
    @JoinColumn
    @ManyToOne
    private Pengguna Pengguna;
    private Double kuantitas;
    private BigDecimal harga;
    private BigDecimal jumlah;
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuDibuat;

}
