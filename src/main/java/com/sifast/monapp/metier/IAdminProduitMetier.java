package com.sifast.monapp.metier;

import com.sifast.monapp.entities.Produit;

public interface IAdminProduitMetier extends IGestionMetier {

    public Long ajouterProduit(Produit p, Long idCat);

    public void supprimerProduit(Long idP);

    public void modifierProduit(Produit p);

}
