
package com.protectora.protectora.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;




@Getter
@Setter
@Entity
public class Busqueda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    
    @Basic
    String nombre;
    String localidad;
    String telefono;
    String img;
    
    
    //CONSTRUCTORES

    public Busqueda() {
    }

    public Busqueda(String nombre, String localidad, String telefono, String img) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.telefono = telefono;
        this.img = img;
    }
    
}
