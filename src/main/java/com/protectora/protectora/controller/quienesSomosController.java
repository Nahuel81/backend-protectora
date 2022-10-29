/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.protectora.protectora.controller;

import com.protectora.protectora.model.quienesSomos;
import com.protectora.protectora.service.quienesSomosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/quienesSomos")
public class quienesSomosController {
    @Autowired
    quienesSomosService quienesSeervice;
    
    @GetMapping
    @ResponseBody
    public List<quienesSomos> verQuienesSomos(){
    return quienesSeervice.verQuienesSomos();
    }
    
   @PostMapping
    public void crearQuienesSomos(@RequestBody quienesSomos quienes){
     quienesSeervice.crearQuienesSomos(quienes);
    }
   
    
    @PutMapping
    public void editarQuinesSomos(@RequestBody quienesSomos quienes){
    quienesSeervice.editarQuienesSomos(quienes);
    }
    
    @DeleteMapping("/{id}")
     public void borrarQuienesSomos(@PathVariable Long id){
            quienesSeervice.eliminarQuienesSomos(id);
            }
}
