/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.protectora.protectora.service;

import com.protectora.protectora.model.Galeria;
import com.protectora.protectora.repository.IgaleriaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GaleriaService implements IgaleriaService{
    
    @Autowired
    IgaleriaRepository galeriaRepo;
    
    @Override
    public void crearGaleria(Galeria galeria) {
       galeriaRepo.save(galeria);
    }

    @Override
    public void deleteGaleria(Long id) {
        galeriaRepo.deleteById(id);
    }

    @Override
    public void editarGaleria(Galeria galeria) {
        galeriaRepo.save(galeria);
    }

    @Override
    public List<Galeria> verGaleria() {
       return galeriaRepo.findAll();
    }
    
}
