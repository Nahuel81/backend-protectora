
package com.protectora.protectora.repository;


import com.protectora.protectora.model.Busqueda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IbusquedaRepository extends JpaRepository<Busqueda,Long>{
    
}
