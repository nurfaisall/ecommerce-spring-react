package com.faisal.ecommercereact.contoller;

import com.faisal.ecommercereact.entity.Kategori;
import com.faisal.ecommercereact.service.KategoriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class KategoriController {

    @Autowired
    private KategoriService kategoriService;

    @GetMapping("/kategoris")
    public List<Kategori> findAll(){
        return kategoriService.findAll();
    }

    @GetMapping("/kategoris/{id}")
    public Kategori findById(@RequestBody @PathVariable("id")String id){
        return kategoriService.findById(id);
    }

    @PostMapping("/kategoris")
    public Kategori create(@RequestBody Kategori kategori){
        return kategoriService.create(kategori);
    }

    @PutMapping("/kategoris")
    public Kategori edit(Kategori kategori){
        return kategoriService.edit(kategori);
    }

    @DeleteMapping("/kategoris/{id}")
    public void delete(@PathVariable("id") String id){
        kategoriService.deleteById(id);
    }
}
