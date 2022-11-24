package model;

import java.util.ArrayList;

import java.util.List;

public class Client {
private String nom;
private String prenom;


private List<Achat> achat1 = new ArrayList();



public Client(String nom, String prenom, List<Achat> achat1) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.achat1 = achat1;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public List<Achat> getAchat1() {
	return achat1;
}


public void setAchat1(List<Achat> achat1) {
	this.achat1 = achat1;
}


@Override
public String toString() {
	return "Client [nom=" + nom + ", prenom=" + prenom + ", achat1=" + achat1 + "]";
}



}
