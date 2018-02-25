package com.sifast.monapp.dao;

import java.util.List;

import com.sifast.monapp.entities.Categorie;
import com.sifast.monapp.entities.Produit;
import com.sifast.monapp.entities.Role;
import com.sifast.monapp.entities.User;

public interface IGestionDao {

    public Long ajouterCategorie(Categorie c);

    public List<Categorie> listCategories();

    public Categorie getCategorie(Long idCat);

    public void supprimerCategrorie(Long idcat);

    public void modifierCategorie(Categorie c);

    public Long ajouterProduit(Produit p, Long idCat);

    public List<Produit> listproduits();

    public Produit getProduit(Long idP);

    public void supprimerProduit(Long idP);

    public void modifierProduit(Produit p);

    public void ajouterUser(User u);

    public User getUser(Long idUser);

    public void supprimerUser(Long idUser);

    public void modifierUser(User u);

    public List<User> listUser();

    public void attribuerRole(Role r, Long userID);
}
