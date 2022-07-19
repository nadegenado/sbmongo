package com.example.smongo.Repository;

import com.example.smongo.models.Categorie;
import com.example.smongo.models.Produit;
import com.example.smongo.service.CategorieService;

import java.awt.*;

public interface CategorieRepository  extends MongoRepository<Categorie, String>  {

    @Query("{nom:'?0'}")
    CategorieService findCategorieByNom(String nom);

    @Query(value="{produit:'?0'}", fields="{'nom' : 1, 'quantite' : 1}")
    List<Produit> findAll(String category);

    public long count();
}
