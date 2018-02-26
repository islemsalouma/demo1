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

//@Api(tags = "CategorieController")
@RestController
@RequestMapping(value = "/restCat")
public class RestControllerCategorie {

    @Autowired
    IAdminCategoriesMetier metier;

    // @ApiOperation(value = "liste des categories")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public Collection<Categorie> index() {
        Collection<Categorie> categories = metier.listCategories();
        return categories;
    }

    // @ApiOperation(value = "")
    @RequestMapping(value = "/{idCat}", method = RequestMethod.GET, produces = "application/json")
    public Categorie findOne(@PathVariable("idCat") Long idCat) {
        Categorie categorie = metier.getCategorie(idCat);
        return categorie;
    }

    @RequestMapping(value = "/deleteCat/{idCat}", method = RequestMethod.DELETE)
    public void supp(@PathVariable Long idCat, Model model) {
        metier.deleteCategorie(idCat);

    }

    // @ApiOperation(value = "ajouter nouvelle categorie")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void saveCat(@RequestBody Categorie c) throws Exception {

        metier.addCategorie(c);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void modifierCat(@RequestBody Categorie c) throws Exception {

        metier.updateCategorie(c);

    }

}
