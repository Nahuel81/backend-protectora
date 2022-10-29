/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.protectora.protectora.service;

import com.protectora.protectora.exception.UserNotFoundException;
import com.protectora.protectora.model.quienesSomos;
import com.protectora.protectora.repository.IquienesSomosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class quienesSomosService implements IquienesSomosService{
@Autowired
IquienesSomosRepository quienesSomosRepo;

    @Override
    public void crearQuienesSomos(quienesSomos quienesomos) {
        quienesSomosRepo.save(quienesomos) ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<quienesSomos> verQuienesSomos() {
         return quienesSomosRepo.findAll(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editarQuienesSomos(quienesSomos quienesomos) {
         quienesSomosRepo.save(quienesomos); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarQuienesSomos(Long id) {
         quienesSomosRepo.deleteById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
