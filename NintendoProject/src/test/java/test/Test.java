package test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Client;

import model.Console;
import model.Jeu;
import model.Salon;



public class Test {
	

	public static void main(String[] args) {
		
		
		
		Salon c1 = new Salon("PES",25, LocalDate.parse("2016-05-01"));
		
		Adresse a = new Adresse (5,"Hugo", "Paris") ;
		Boutique b = new Boutique("Lidl", a);
		
		Jeu j = new Jeu("zelda", c1,b);
		Jeu j1 = new Jeu("SuperMario", c1,b);
		Jeu j2 = new Jeu("Bubble", c1,b);
		Jeu j3 = new Jeu("puzzle", c1,b);
		Jeu j4 = new Jeu("subway", c1,b);
		
		Achat a1 = new Achat(j,LocalDate.now(),30.5);
		Achat a2 = new Achat(j1,LocalDate.now(),40.5);
		
		Client cl1 = new Client("Robert","Dupont");
		Client cl2 = new Client("Bernadette","Dupont");
		
		Collections.addAll(cl1.getAchat1(),a1,a2);
		

		
		


}
}