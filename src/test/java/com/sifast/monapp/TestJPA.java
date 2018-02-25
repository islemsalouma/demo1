package com.sifast.monapp;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sifast.monapp.entities.Categorie;
import com.sifast.monapp.metier.IAdminCategoriesMetier;

public class TestJPA {

    @Test
    public void test() {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });
            IAdminCategoriesMetier metier = (IAdminCategoriesMetier) context.getBean("metier");
            List<Categorie> cats1 = metier.listCategories();
            metier.ajouterCategorie(new Categorie("Ordinateur", "Ordinateurs"));
            metier.ajouterCategorie(new Categorie("Imprimantes", "Imprimantes"));
            List<Categorie> cats2 = metier.listCategories();
            assertTrue(cats2.size() == cats1.size() + 2);
        } catch (Exception e) {
            assertTrue(e.getMessage(), false);
        }
    }

}
