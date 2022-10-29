
package com.protectora.protectora.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;


@Getter
@Setter
@Entity
public class Adopcion implements Serializable {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   Long id;
   
   @Basic
   String nombreAdop;
   String instagramAdop;
   String imgAdop;
   
   //Constructores

    public Adopcion() {
    }

    public Adopcion(String nombreAdop, String instagramAdop, String imgAdop) {
        this.nombreAdop = nombreAdop;
        this.instagramAdop = instagramAdop;
        this.imgAdop = imgAdop;
    }
   
}
