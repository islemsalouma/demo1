package com.sifast.monapp;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sifast.monapp.entities.Categorie;
import com.sifast.monapp.metier.IAdminCategoriesMetier;

@RestController
@RequestMapping(value = "/restcat")
public class RestControllerCategorie {

    @Autowired
    IAdminCategoriesMetier metier;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Collection<Categorie> index() {
        Collection<Categorie> categories = metier.listCategories();
        return categories;
    }

    @RequestMapping(value = "/{idCat}", method = RequestMethod.GET)
    public Categorie findOne(@PathVariable("idCat") Long idCat) {
        Categorie categorie = metier.getCategorie(idCat);
        return categorie;
    }

    @RequestMapping(value = "/suppcat/{idCat}", method = RequestMethod.DELETE)
    public void supp(@PathVariable Long idCat, Model model) {
        metier.supprimerCategrorie(idCat);

    }

    @RequestMapping(value = "/enregistrer", method = RequestMethod.POST)
    public void saveCat(@RequestBody Categorie c) throws Exception {

        metier.ajouterCategorie(c);
    }

    @RequestMapping(value = "/modifier", method = RequestMethod.PUT)
    public void modifierCat(@RequestBody Categorie c) throws Exception {

        metier.modifierCategorie(c);

    }

}
