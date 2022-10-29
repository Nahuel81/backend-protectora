
package com.protectora.protectora.controller;


import com.protectora.protectora.model.Adopcion;
import com.protectora.protectora.service.AdopcionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/adopcion")
public class AdopcionController {
    @Autowired
    AdopcionService adopService;
    
    @GetMapping
    @ResponseBody
    public List<Adopcion> verAdopciones(){
    return adopService.verAdopciones();
    }
    
    @PostMapping
    public void CrearAdopcion(@RequestBody Adopcion adop){
        adopService.crearAdopcion(adop);
    }
    
    @PutMapping
    public void EditarAdopcion(@RequestBody Adopcion adop){
    adopService.editarAdopcion(adop);
    }
    
    @DeleteMapping("/{id}")
    public void borrarAdopcion(@PathVariable Long id){
        adopService.borrarAdopcion(id);
    }
    
}
