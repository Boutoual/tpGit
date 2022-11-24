
package model;

import java.time.LocalDate;

public class Console {

	private String nom;
	private double prix;
	private LocalDate datesortie;
	public Console(String nom, double prix, LocalDate datesortie) {
		this.nom = nom;
		this.prix = prix;
		this.datesortie = datesortie;
	}
	public String getNom() {
		return nom;
	}
	public double getPrix() {
		return prix;
	}
	public LocalDate getDatesortie() {
		return datesortie;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public void setDatesortie(LocalDate datesortie) {
		this.datesortie = datesortie;
	}
	@Override
	public String toString() {
		return "Console [nom=" + nom + ", prix=" + prix + ", datesortie=" + datesortie + "]";
	}
	



}
