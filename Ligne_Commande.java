package org.side.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Ligne_Commande {

@Id
@GeneratedValue
private Long num;
private int quantite;
private float pph;
@OneToOne
private Article article;
@ManyToOne
private Commande commande;

public Ligne_Commande() {

}

public Ligne_Commande(int quantite, float pph, Article article) {
	super();
	this.quantite = quantite;
	this.pph = pph;
	this.article = article;
}



public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public float getPph() {
	return pph;
}
public void setPph(float pph) {
	this.pph = pph;
}

public Long getNum() {
	return num;
}
public void setNum(Long num) {
	this.num = num;
}

public Article getArticle() {
	return article;
}

public void setArticle(Article article) {
	this.article = article;
}

public Commande getCommande() {
	return commande;
}

public void setCommande(Commande commande) {
	this.commande = commande;
}



}
