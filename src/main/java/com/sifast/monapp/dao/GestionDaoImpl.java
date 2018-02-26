package com.sifast.monapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.sifast.monapp.entities.Categorie;
import com.sifast.monapp.entities.Produit;
import com.sifast.monapp.entities.Role;
import com.sifast.monapp.entities.User;

@SuppressWarnings("unchecked")
@Repository
public class GestionDaoImpl implements IGestionDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Long addCategorie(Categorie c) {

        em.persist(c);
        return c.getIdCategorie();
    }

    @Override
    public List<Categorie> listCategories() {
        Query req = em.createQuery("select c from Categorie c");
        return req.getResultList();
    }

    @Override
    public Categorie getCategorie(Long idCat) {
        return em.find(Categorie.class, idCat);
    }

    @Override
    public void deleteCategrorie(Long idcat) {
        Categorie c = em.find(Categorie.class, idcat);
        em.remove(c);
    }

    @Override
    public void updateCategorie(Categorie c) {
        em.merge(c);
    }

    @Override
    public Long addProd(Produit p, Long idCat) {
        Categorie c = getCategorie(idCat);
        p.setCategorie(c);
        em.persist(p);
        return p.getIdProduit();
    }

    @Override
    public List<Produit> listproduits() {
        Query req = em.createQuery("select p from Produit p");
        return req.getResultList();
    }

    @Override
    public Produit getProd(Long idP) {
        return em.find(Produit.class, idP);
    }

    @Override
    public void deleteProd(Long idP) {
        Produit p = em.find(Produit.class, idP);
        em.remove(p);
    }

    @Override
    public void updateProd(Produit p) {
        em.merge(p);
    }

    @Override
    public void attribuerRole(Role r, Long userID) {
        User u = em.find(User.class, userID);
        u.getRoles().add(r);
        em.persist(r);
    }

    @Override
    public void addUser(User u) {
        em.persist(u);
    }

    @Override
    public User getUser(Long idUser) {
        return em.find(User.class, idUser);
    }

    @Override
    public void deleteUser(Long idUser) {
        User u = getUser(idUser);
        em.remove(u);
    }

    @Override
    public void updateUser(User u) {
        em.merge(u);

    }

    @Override
    public List<User> listUser() {
        Query req = em.createQuery("select u from User u");
        return req.getResultList();
    }

}
