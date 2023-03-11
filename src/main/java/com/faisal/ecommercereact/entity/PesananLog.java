package com.faisal.ecommercereact.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class PesananLog implements Serializable {
    @Id
    private String Id;
    @JoinColumn
    @ManyToOne
    private Pesanan pesanan;
    @JoinColumn
    @ManyToOne
    private Pengguna pengguna;
    private Integer logType;
    private String logMessage;
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktu;
}
