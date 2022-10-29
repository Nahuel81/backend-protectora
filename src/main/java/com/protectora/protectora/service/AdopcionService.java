
package com.protectora.protectora.service;

import com.protectora.protectora.model.Adopcion;
import com.protectora.protectora.repository.IadopcionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdopcionService implements IadopcionService{

    @Autowired
    IadopcionRepository adopservice;
    
    @Override
    public void crearAdopcion(Adopcion adop) {
      adopservice.save(adop);
    }

    @Override
    public void editarAdopcion(Adopcion adop) {
       adopservice.save(adop);
    }

    @Override
    public void borrarAdopcion(Long id) {
        adopservice.deleteById(id);
    }

    @Override
    public List<Adopcion> verAdopciones() {
        return adopservice.findAll();
    }
    
}
