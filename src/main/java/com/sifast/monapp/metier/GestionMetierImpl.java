package com.sifast.monapp.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sifast.monapp.dao.IGestionDao;
import com.sifast.monapp.entities.Categorie;
import com.sifast.monapp.entities.Produit;
import com.sifast.monapp.entities.Role;
import com.sifast.monapp.entities.User;

@Transactional
@Service
public class GestionMetierImpl implements IAdminUser {

    @Autowired
    IGestionDao gestionDao;

    public void setGestionDao(IGestionDao gestionDao) {
        this.gestionDao = gestionDao;
    }

    @Override
    public Long ajouterProduit(Produit p, Long idCat) {
        return gestionDao.ajouterProduit(p, idCat);
    }

    @Override
    public void supprimerProduit(Long idP) {
        gestionDao.supprimerProduit(idP);
    }

    @Override
    public void modifierProduit(Produit p) {
        gestionDao.modifierProduit(p);
    }

    @Override
    public List<Categorie> listCategories() {
        return gestionDao.listCategories();
    }

    @Override
    public Categorie getCategorie(Long idCat) {
        return gestionDao.getCategorie(idCat);
    }

    @Override
    public List<Produit> listproduits() {
        return gestionDao.listproduits();
    }

    @Override
    public Produit getProduit(Long idP) {
        return gestionDao.getProduit(idP);
    }

    @Override
    public Long ajouterCategorie(Categorie c) {
        return gestionDao.ajouterCategorie(c);
    }

    @Override
    public void supprimerCategrorie(Long idcat) {
        gestionDao.supprimerCategrorie(idcat);
    }

    @Override
    public void modifierCategorie(Categorie c) {
        gestionDao.modifierCategorie(c);
    }

    @Override
    public void ajouterUser(User u) {
        gestionDao.ajouterUser(u);
    }

    @Override
    public void attribuerRole(Role r, Long userID) {
        gestionDao.attribuerRole(r, userID);
    }

    @Override
    public User getUser(Long idUser) {
        return gestionDao.getUser(idUser);
    }

    @Override
    public void supprimerUser(Long idUser) {
        gestionDao.supprimerUser(idUser);
    }

    @Override
    public void modifierUser(User u) {
        gestionDao.modifierUser(u);
    }

    @Override
    public List<User> listUser() {
        return gestionDao.listUser();
    }

}
