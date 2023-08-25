package com.formation.formation.Modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Formation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private String description;
    private Long idDept;
    public Formation(Long id, String libelle, String description, Long idDept) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.idDept = idDept;
    }
    public Long getIdDept() {
        return idDept;
    }
    public void setIdDept(Long idDept) {
        this.idDept = idDept;
    }
    public Formation() {
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Formation [id=" + id + ", libelle=" + libelle + ", description=" + description + ", idDept=" + idDept
                + "]";
    }

}
