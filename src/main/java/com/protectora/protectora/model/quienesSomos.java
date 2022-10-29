
package com.protectora.protectora.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class quienesSomos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    @Basic
    String descripcion;
    
    //Constructores
    public quienesSomos(){}
    
    public quienesSomos(String descripcion){
    this.descripcion= descripcion;
    }
}
