
package com.protectora.protectora.service;

import com.protectora.protectora.model.Adopcion;

import java.util.List;


public interface IadopcionService {
    public void crearAdopcion(Adopcion adop);
    public void editarAdopcion(Adopcion adop);
    public void borrarAdopcion(Long id);
    public List<Adopcion>verAdopciones();
}
