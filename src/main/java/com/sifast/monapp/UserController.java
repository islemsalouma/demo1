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

    @RequestMapping("/save")
    public String saveUser(User u, Model model) throws Exception {
        if (u.getIdUser() == null) {
            metier.addUser(u);
        } else {
            metier.updateUser(u);
        }

        return "redirect:/user/index";
    }

    @RequestMapping(value = "/addForm", method = RequestMethod.GET)
    public String addFom(Model model) {
        model.addAttribute("user", new User());

        return "users";
    }

    @RequestMapping(value = "/deleteUser/{idUser}")
    public String delete(@PathVariable Long idUser, Model model) {
        metier.deleteUser(idUser);
        return "redirect:/user/index";
    }

    @RequestMapping(value = "/editUser/{idUser}", method = RequestMethod.GET)
    public String updateCat(@PathVariable Long idUser, Model model) throws Exception {
        User u = metier.getUser(idUser);
        model.addAttribute("user", u);
        model.addAttribute("users", metier.listUser());
        return "user";
    }

}
