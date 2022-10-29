/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.protectora.protectora.service;

import com.protectora.protectora.model.Busqueda;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IbusquedaService {
   public void agregar(Busqueda busq);
   public void eliminar(Long id);
   public void editar(Busqueda busq);
   public List<Busqueda> verBusquedas();
}
