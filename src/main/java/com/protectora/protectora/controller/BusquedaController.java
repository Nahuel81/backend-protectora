/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.protectora.protectora.controller;

import com.protectora.protectora.model.Busqueda;
import com.protectora.protectora.service.BusquedaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/busqueda")
public class BusquedaController {
    @Autowired
    BusquedaService busquedaservice;
    
    @GetMapping
    @ResponseBody
    public List<Busqueda>verBusquedas(){
        return busquedaservice.verBusquedas();
    }
            
    @PostMapping
    public void agregarBusqueda(@RequestBody Busqueda busq){
    busquedaservice.agregar(busq);
    }
    
   @DeleteMapping("/{id}")
    public void eliminarBusqueda(@PathVariable Long id){
    busquedaservice.eliminar(id);
    }
    
    
     @PutMapping
    public void modificarBusqueda(@RequestBody Busqueda busq){
    busquedaservice.editar(busq);
    }
}
