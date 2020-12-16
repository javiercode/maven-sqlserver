package de.cosh.azure.repository;

import de.cosh.azure.model.GeoPredio19;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@EntityScan(basePackages = {"com.iaphalanx.catastro.persistencia.entidad"})
public interface GeoPredio19Repositorio extends JpaRepository<GeoPredio19,Integer> {


}