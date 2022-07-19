package com.example.smongo.models;

import java.util.Date;

public class Produit {
    private String id;
    private String nom;
    private String description;

    private Integer quantite;
    private Float pu;
    private Date dateAjout;
    private Categorie categorie;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public Float getPu() {
        return pu;
    }

    public void setPu(Float pu) {
        this.pu = pu;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public com.example.smongo.models.Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(com.example.smongo.models.Categorie categorie) {
        this.categorie = categorie;
    }
}
