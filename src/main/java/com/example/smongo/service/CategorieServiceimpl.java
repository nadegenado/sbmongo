package com.example.smongo.service;


import com.example.smongo.Repository.CategorieRepository;
import com.example.smongo.models.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CategorieServiceimpl implements CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;
    @Override
    public Categorie saveCategorie(Categorie c) {
        return categorieRepository.save(c);
    }

    @Override
    public Optional<Categorie> findById(String id) {
        return categorieRepository.findById(id);
    }

    @Override
    public List<Categorie> findAll() {
        return categorieRepository.findAll();
    }

    @Override
    public void deleteCategorie(String id) {
        Optional<Categorie> data = findById(id);
        if(data.isPresent()){
            categorieRepository.deleteById(id);
        }

    }


    public void showAllCategorie() {

        CategorieService.findAll().forEach(item -> System.out.println(getCategorie(categorieRepository)));
    }

    public void getCategorieByNom(String nom) {
        System.out.println("Getting item by name: " + nom);
        Categorie categorie = categorieRepository.findCategorieByNom(nom);
        System.out.println(getCategorieByNom(categorie);
    }

    public void getItemsByNom(String nom) {
        System.out.println("Getting items for the category " + category);
        List<Categorie> list = categorieRepository.findAll(nom);

        list.forEach(item -> System.out.println("Name: " + item.getName() + ", Quantity: " + item.getQuantity()));
    }

    public void findCountOfCategorie() {
        long count = categorieRepository.count();
        System.out.println("Number of documents in the collection: " + count);
    }

    public void updateCategorie (String categorie) {

        // Change to this new value
        String newCategory = "munchies";

        // Find all the items with the category snacks
        List<Categorie> list = CategorieRepository.findAll(categorie);

        list.forEach(item -> {
            // Update the category in each document
            item.setCategorie(newCategorie);
        });

        // Save all the items in database
        List<Categorie> itemsUpdated = CategorieRepository.saveAll(list);

        if(itemsUpdated != null)
            System.out.println("Successfully updated " + itemsUpdated.size() + " items.");
    }

    public void deleteCategorie(String id) {
        CategorieRepository.deleteById(id);
        System.out.println("Item with id " + id + " deleted...");
    }

}
