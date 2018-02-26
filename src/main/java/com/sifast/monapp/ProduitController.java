// package com.sifast.monapp;
//
// import java.util.List;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
//
// import com.sifast.monapp.entities.Produit;
//
// @Controller
// @RequestMapping(value = "/produits")
// public class ProduitController {
//
// @Autowired
// private IProduitService iproduitservice;
//
// @RequestMapping(value = "/enregistrer", method = RequestMethod.GET)
// public String home(Model model, @ModelAttribute Produit p) {
//
// iproduitservice.save(p);
//
// List<Produit> produits = iproduitservice.findAll();
// System.out.println(p.getPrix());
// System.out.println(p.getPrix());
//
// System.out.println(p.getPrix());
//
// System.out.println(p.getPrix());
//
// System.out.println(p.getPrix());
//
// model.addAttribute("p", produits);
// return "produits";
// }
//
// @RequestMapping(value = "/nouveauform")
// public String home1() {
//
// return "produits";
// }
//
// }
