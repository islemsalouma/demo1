package com.sifast.monapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sifast.monapp.entities.Categorie;
import com.sifast.monapp.metier.IAdminCategoriesMetier;

@Controller
@RequestMapping(value = "/cat")
public class CategorieController {

    @Autowired
    IAdminCategoriesMetier metier;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("categorie", new Categorie());
        model.addAttribute("categories", metier.listCategories());
        return "categorie";
    }

    @RequestMapping(value = "/enregistrer", method = RequestMethod.GET)
    public String saveCat(Categorie c, Model model) throws Exception {

        metier.ajouterCategorie(c);

        return "redirect:/cat/index";
    }

    @RequestMapping(value = "/nouveauform", method = RequestMethod.GET)
    public String home1() {
        return "categorie";
    }

    @RequestMapping(value = "/suppcat/{idCat}")
    public String supp(@PathVariable Long idCat, Model model) {
        metier.supprimerCategrorie(idCat);
        return "redirect:/cat/index";
    }

    @RequestMapping(value = "/editCat/{idCat}", method = RequestMethod.GET)
    public String editCat(@PathVariable Long idCat, Model model) throws Exception {
        Categorie c = metier.getCategorie(idCat);
        model.addAttribute("categorie", c);
        model.addAttribute("categories", metier.listCategories());
        return "categorie";
    }

}
