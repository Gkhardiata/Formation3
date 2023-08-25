package com.formation.formation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.formation.Modele.Formation;

public interface FormationRepository extends JpaRepository<Formation,Long> {

    
}
