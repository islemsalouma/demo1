// package com.sifast.monapp.entities;
//
// import java.io.Serializable;
// import java.util.Collection;
// import java.util.Date;
//
// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
// import javax.persistence.OneToMany;
//
// @Entity
// public class Commande implements Serializable {
//
// @Id
// @GeneratedValue(strategy = GenerationType.AUTO)
// private Long idCommande;
//
// private Date dateCommande;
//
// @ManyToOne
// @JoinColumn(name = "idClient")
// private Client client;
//
// @OneToMany
// @JoinColumn(name = "idCommande")
// private Collection<LigneCommande> items;
//
// }
