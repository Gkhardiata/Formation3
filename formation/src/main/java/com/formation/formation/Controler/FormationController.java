package com.formation.formation.Controler;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.formation.Modele.Formation;
import com.formation.formation.Service.FormationService;

@RestController
@RequestMapping("/formation")
public class FormationController{
    private final FormationService formationService;

    public FormationController(FormationService formationService) {
        this.formationService = formationService;
    }
    @PostMapping("/add")
    public  Formation creerFormation(@RequestBody Formation formation){
        return formationService.CreerFormation(formation);
    }
       @GetMapping("/all")
    public List <Formation> AfficherFormation(){
        return  formationService.AfficherFormation();
    }
    @PutMapping("/update/{id}")
    public Formation update(@PathVariable Long id, @RequestBody Formation formation){
        return formationService.modifier(id,formation);
    }
    @DeleteMapping("/Delete") 
    public String delete(@PathVariable Long id){
        return formationService.supprimer(id);
    }
  

}