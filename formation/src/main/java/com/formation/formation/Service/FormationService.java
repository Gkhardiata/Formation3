package com.formation.formation.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.formation.formation.Modele.Formation;

@Service
public interface FormationService{
   List <Formation> AfficherFormation();
   Formation CreerFormation(Formation formation);
   Formation modifier( Formation formation);
   void supprimer(Long id);
}
