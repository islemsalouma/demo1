// package com.sifast.monapp.entities;
//
// import java.io.Serializable;
// import java.util.Collection;
//
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;
//
// public class Client implements Serializable {
//
// @Id
// @GeneratedValue
// private Long idClient;
//
// private String nomCleint;
//
// private String adress;
//
// private String email;
//
// private String tel;
//
// // @OneToMany(mappedBy = "commande")
// // private Collection<Commande> commandes;
//
// public Client() {
// super();
// // TODO Auto-generated constructor stub
// }
//
// public Client(String nomCleint, String adress, String email, String tel, Collection<Commande> commandes) {
// super();
// this.nomCleint = nomCleint;
// this.adress = adress;
// this.email = email;
// this.tel = tel;
// this.commandes = commandes;
// }
//
// public String getNomCleint() {
// return nomCleint;
// }
//
// public void setNomCleint(String nomCleint) {
// this.nomCleint = nomCleint;
// }
//
// public String getAdress() {
// return adress;
// }
//
// public void setAdress(String adress) {
// this.adress = adress;
// }
//
// public String getEmail() {
// return email;
// }
//
// public void setEmail(String email) {
// this.email = email;
// }
//
// public String getTel() {
// return tel;
// }
//
// public void setTel(String tel) {
// this.tel = tel;
// }
//
// public Collection<Commande> getCommandes() {
// return commandes;
// }
//
// public void setCommandes(Collection<Commande> commandes) {
// this.commandes = commandes;
// }
//
// }
