package com.formation.formation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.formation.Modele.Formation;
import com.formation.formation.Repository.FormationRepository;
@Service
public class FormationServiceImpl implements FormationService{
    @Autowired
    private final FormationRepository formationRepository;
    public FormationServiceImpl(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }
    public List <Formation> AfficherFormation(){
        return formationRepository.findAll();
    }
    public Formation CreerFormation(Formation formation){
        System.out.println("********************"+formation.getLibelle());
        return formationRepository.save(formation);
    }
    @Override
    public void supprimer(Long id){
        formationRepository.deleteById(id);
       
    } 
    @Override
    public Formation modifierFormation(Formation formation){
        if(formation.getId() != null){
        return formationRepository.save(formation);
               }
               else{
                
               }

}