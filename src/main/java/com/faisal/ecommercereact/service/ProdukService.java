package com.faisal.ecommercereact.service;

import com.faisal.ecommercereact.entity.Produk;
import com.faisal.ecommercereact.exception.BadRequestException;
import com.faisal.ecommercereact.exception.ResourceNotFoundException;
import com.faisal.ecommercereact.repository.KategoriRepository;
import com.faisal.ecommercereact.repository.ProdukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.UUID;

@Service
public class ProdukService {

    @Autowired
    private ProdukRepository produkRepository;
    @Autowired
    private KategoriRepository kategoriRepository;

    public List<Produk> findAll(){
        return produkRepository.findAll();
    }

    public Produk findById(String id){
        return produkRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("produk dengan id "+ id +" tidak di temukan"));
    }

    public Produk create(Produk produk){
        if(!StringUtils.hasText(produk.getNama())){
            throw new BadRequestException("nama tidak boleh kosong");
        }
        if(produk.getKategori() == null){
            throw new BadRequestException("kategori tidak boleh kosong");
        }
        if(!StringUtils.hasText(produk.getKategori().getId())){
            throw new BadRequestException("kategori id tidak boleh kosong");
        }

        produk.setId(UUID.randomUUID().toString());
        kategoriRepository.findById(produk.getKategori().getId()).orElseThrow(() -> new BadRequestException("kategori id " + produk.getKategori().getId() + " tidak di temukan di data base"));

        return produkRepository.save(produk);
    }

    public Produk edit(Produk produk){
        if(!StringUtils.hasText(produk.getId())){
            throw new BadRequestException("id tidak dapat di temukan");
        }
        if(!StringUtils.hasText(produk.getNama())){
            throw new BadRequestException("nama tidak boleh kosong");
        }
        if(produk.getKategori() == null){
            throw new BadRequestException("kategori tidak boleh kosong");
        }
        if(!StringUtils.hasText(produk.getKategori().getId())){
            throw new BadRequestException("kategori id tidak boleh kosong");
        }

        return produkRepository.save(produk);
    }

    public Produk ubahGambar(String id, String gambar){
       Produk produk = findById(id);
       produk.setGambar(gambar);
       return produkRepository.save(produk);
    }

    public void delete(String id){
        produkRepository.deleteById(id);
    }

    public List<Produk> findRange(String filterText,int page, int limit) {

        return null;
    }
}
