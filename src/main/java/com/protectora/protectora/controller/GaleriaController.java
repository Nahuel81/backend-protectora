/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.protectora.protectora.controller;

import com.protectora.protectora.model.Galeria;
import com.protectora.protectora.service.GaleriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/galeria")
public class GaleriaController {
    
    @Autowired
    GaleriaService galeriaService;
    
    @GetMapping
    @ResponseBody
    public List<Galeria>verGaleria(){
    return galeriaService.verGaleria();
    }
    
    @DeleteMapping("/{id}")
    public void borrarGaleria(@PathVariable Long id){
    galeriaService.deleteGaleria(id);
    }
    
    @PostMapping
    public void crearGaleria(@RequestBody Galeria galeria){
    galeriaService.crearGaleria(galeria);
    }
    
    @PutMapping
    public void modificarGaleria(@RequestBody Galeria galeria){
        galeriaService.editarGaleria(galeria);
    }
    
}
