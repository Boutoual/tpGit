package model;

public class Boutique {
	
	String nom;
	Adresse adresse;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + "]";
	}
	public Boutique(String nom, Adresse adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}
	
	

}
