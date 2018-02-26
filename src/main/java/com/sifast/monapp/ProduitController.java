package com.sifast.monapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sifast.monapp.entities.Produit;
import com.sifast.monapp.metier.IAdminProduitMetier;

@Controller
@RequestMapping(value = "/prod")
public class ProduitController {

    @Autowired
    IAdminProduitMetier metier;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("produit", new Produit());
        model.addAttribute("produits", metier.listproduits());
        model.addAttribute("categories", metier.listCategories());
        return "produit";
    }

    @RequestMapping(value = "/save")
    public String saveCat(Produit p, Model model) {
        if (p.getIdProduit() != null) {
            metier.updateProd(p);

        } else {
            metier.addProd(p, p.getCategorie().getIdCategorie());

        }

        return "redirect:/prod/index";
    }

    @RequestMapping(value = "/addForm", method = RequestMethod.GET)
    public String addForm(Model model) {
        model.addAttribute("produit", new Produit());
        model.addAttribute("produits", metier.listproduits());
        model.addAttribute("categories", metier.listCategories());

        return "produit";
    }

    @RequestMapping(value = "/deleteProd/{idProd}")
    public String supp(@PathVariable Long idProd) {
        metier.deleteProd(idProd);
        return "redirect:/prod/index";
    }

    @RequestMapping(value = "/editProd/{idProd}")
    public String updateCat(@PathVariable Long idProd, Model model) {
        Produit p = metier.getProduit(idProd);
        model.addAttribute("produit", p);
        model.addAttribute("produits", metier.listproduits());
        model.addAttribute("categories", metier.listCategories());
        return "produit";
    }

}
