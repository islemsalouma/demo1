package com.sifast.monapp.dao;

import java.util.List;

import com.sifast.monapp.entities.Categorie;
import com.sifast.monapp.entities.Produit;
import com.sifast.monapp.entities.Role;
import com.sifast.monapp.entities.User;

public interface IGestionDao {

    public Long addCategorie(Categorie c);

    public List<Categorie> listCategories();

    public Categorie getCategorie(Long idCat);

    public void deleteCategrorie(Long idcat);

    public void updateCategorie(Categorie c);

    public Long addProd(Produit p, Long idCat);

    public List<Produit> listproduits();

    public Produit getProd(Long idP);

    public void deleteProd(Long idP);

    public void updateProd(Produit p);

    public void addUser(User u);

    public User getUser(Long idUser);

    public void deleteUser(Long idUser);

    public void updateUser(User u);

    public List<User> listUser();

    public void attribuerRole(Role r, Long userID);
}
