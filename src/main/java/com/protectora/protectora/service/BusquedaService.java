/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.protectora.protectora.service;


import com.protectora.protectora.model.Busqueda;
import com.protectora.protectora.repository.IbusquedaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusquedaService implements IbusquedaService {

    @Autowired
    IbusquedaRepository ibusqRepository;

    @Override
    public void agregar(Busqueda busq) {
        ibusqRepository.save(busq);
    }

    @Override
    public void eliminar(Long id) {
        ibusqRepository.deleteById(id);
    }

    @Override
    public void editar(Busqueda busq) {
        ibusqRepository.save(busq);
    }

    @Override
    public List<Busqueda> verBusquedas() {
      return ibusqRepository.findAll();
    }

}
