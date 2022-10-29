/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.protectora.protectora.service;

import com.protectora.protectora.model.quienesSomos;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IquienesSomosService {
    public void crearQuienesSomos(quienesSomos quienesomos);
    public List <quienesSomos> verQuienesSomos();
    public void editarQuienesSomos(quienesSomos quienesomos);
    public void eliminarQuienesSomos(Long id);
}
