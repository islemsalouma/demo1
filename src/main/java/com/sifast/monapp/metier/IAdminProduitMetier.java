package com.sifast.monapp.metier;

import com.sifast.monapp.entities.Produit;

public interface IAdminProduitMetier extends IGestionMetier {

    public Long addProd(Produit p, Long idCat);

    public void deleteProd(Long idP);

    public void updateProd(Produit p);

}
