
package com.portfolio.matiassebastianchocobar.Repository;

import com.portfolio.matiassebastianchocobar.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long>{
    
}
