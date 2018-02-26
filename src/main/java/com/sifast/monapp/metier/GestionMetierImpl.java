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
    public Long addProd(Produit p, Long idCat) {
        return gestionDao.addProd(p, idCat);
    }

    @Override
    public void deleteProd(Long idP) {
        gestionDao.deleteProd(idP);
    }

    @Override
    public void updateProd(Produit p) {
        gestionDao.updateProd(p);
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
        return gestionDao.getProd(idP);
    }

    @Override
    public Long addCategorie(Categorie c) {
        return gestionDao.addCategorie(c);
    }

    @Override
    public void deleteCategorie(Long idcat) {
        gestionDao.deleteCategrorie(idcat);
    }

    @Override
    public void updateCategorie(Categorie c) {
        gestionDao.updateCategorie(c);
    }

    @Override
    public void addUser(User u) {
        gestionDao.addUser(u);
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
    public void deleteUser(Long idUser) {
        gestionDao.deleteUser(idUser);
    }

    @Override
    public void updateUser(User u) {
        gestionDao.updateUser(u);
    }

    @Override
    public List<User> listUser() {
        return gestionDao.listUser();
    }

}
