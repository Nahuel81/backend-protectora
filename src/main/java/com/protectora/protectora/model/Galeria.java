
package com.protectora.protectora.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Galeria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    
    
    @Basic
    String imgGaleria;
    String descripcionGaleria;

    
    //Constructores
    public Galeria() {
    }
    public Galeria(Long id, String descripcionGaleria, String imgGaleria){
        this.id = id;
        this.descripcionGaleria = descripcionGaleria;
        this.imgGaleria = imgGaleria;
 }
    
}
