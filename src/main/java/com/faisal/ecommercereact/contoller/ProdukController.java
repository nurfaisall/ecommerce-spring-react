package com.faisal.ecommercereact.contoller;

import com.faisal.ecommercereact.entity.Produk;
import com.faisal.ecommercereact.service.ProdukService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProdukController {

    @Autowired
    private ProdukService produkService;

    @GetMapping("/produks")
    public List<Produk> findAll(){
        return produkService.findAll();
    }

    @GetMapping("/produks/{id}")
    public Produk findById(@PathVariable("id")String id){
        return produkService.findById(id);
    }

    @PostMapping("/produks")
    public Produk create(@RequestBody Produk produk){
        return produkService.create(produk);
    }

    @PutMapping("/produks")
    public Produk edit(@RequestBody Produk produk){
        return produkService.edit(produk);
    }

    @DeleteMapping("/produks/{id}")
    public void delete(@PathVariable("id") String id){
        produkService.delete(id);
    }

}
