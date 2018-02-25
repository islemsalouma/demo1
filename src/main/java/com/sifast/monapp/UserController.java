package com.sifast.monapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sifast.monapp.entities.User;
import com.sifast.monapp.metier.IAdminUser;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    IAdminUser metier;

    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("users", metier.listUser());
        return "users";
    }

    @RequestMapping("/enregistrer")
    public String saveUser(User u, Model model) throws Exception {
        metier.ajouterUser(u);

        return "redirect:/user/index";
    }

    @RequestMapping(value = "/nouveauform", method = RequestMethod.GET)
    public String home1() {
        return "users";
    }

    @RequestMapping(value = "/suppuser/{idUser}")
    public String supp(@PathVariable Long idUser, Model model) {
        metier.supprimerUser(idUser);
        return "redirect:/user/index";
    }

}
