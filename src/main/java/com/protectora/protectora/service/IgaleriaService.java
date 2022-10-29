/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.protectora.protectora.service;

import com.protectora.protectora.model.Galeria;
import java.util.List;


public interface IgaleriaService{
    public void crearGaleria(Galeria galeria);
    public void deleteGaleria(Long id);
    public void editarGaleria(Galeria galeria);
    public List<Galeria>verGaleria();
}
