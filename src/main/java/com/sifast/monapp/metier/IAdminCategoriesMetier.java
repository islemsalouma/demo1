package com.sifast.monapp.metier;

import com.sifast.monapp.entities.Categorie;

public interface IAdminCategoriesMetier extends IAdminProduitMetier {

    public Long ajouterCategorie(Categorie c);

    public void supprimerCategrorie(Long idcat);

    public void modifierCategorie(Categorie c);

}
