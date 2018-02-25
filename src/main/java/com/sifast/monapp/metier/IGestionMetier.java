package com.sifast.monapp.metier;

import java.util.List;

import com.sifast.monapp.entities.Categorie;
import com.sifast.monapp.entities.Produit;

public interface IGestionMetier {

    public List<Categorie> listCategories();

    public Categorie getCategorie(Long idCat);

    public List<Produit> listproduits();

    public Produit getProduit(Long idP);

}
