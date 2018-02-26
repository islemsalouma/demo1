package com.sifast.monapp.metier;

import com.sifast.monapp.entities.Categorie;

public interface IAdminCategoriesMetier extends IAdminProduitMetier {

    public Long addCategorie(Categorie c);

    public void deleteCategorie(Long idcat);

    public void updateCategorie(Categorie c);

}
