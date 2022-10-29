
package com.protectora.protectora.repository;

import com.protectora.protectora.model.Adopcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IadopcionRepository extends JpaRepository<Adopcion,Long>{
    
}
