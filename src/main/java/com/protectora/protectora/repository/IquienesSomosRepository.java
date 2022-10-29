/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.protectora.protectora.repository;

import com.protectora.protectora.model.quienesSomos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IquienesSomosRepository extends JpaRepository<quienesSomos, Long>{
    
}
