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



public class Test {
	
	static List<Achat> achat1 = new ArrayList();

	public static void main(String[] args) {
		
		
		
		Console c1 = new Console("PES",25, LocalDate.parse("2016-05-01"));
		
		Jeu j = new Jeu("zelda", c1);
		Jeu j1 = new Jeu("SuperMario", c1);
		Jeu j2 = new Jeu("Bubble", c1);
		Jeu j3 = new Jeu("puzzle", c1);
		Jeu j4 = new Jeu("subway", c1);
		
		Achat a1 = new Achat(j,LocalDate.now(),30.5);
		Achat a2 = new Achat(j1,LocalDate.now(),40.5);
		
		Collections.addAll(achat1,a1,a2);
		
		Client cl1 = new Client("Robert","Dupont",achat1);
		Client cl2 = new Client("Bernadette","Dupont",achat1);
		
		Adresse a = new Adresse (5,"Hugo", "Paris") ;
		Boutique b = new Boutique("Lidl", a);

}
}