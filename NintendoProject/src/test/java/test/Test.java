package test;

import model.Adresse;
import model.Boutique;
import model.Console;
import model.Jeu;



public class Test {

	public static void main(String[] args) {
		
		Console c1 = new Console("PES");
		
		Jeu j = new Jeu("zelda", c1);
		Jeu j1 = new Jeu("SuperMario", c1);
		Jeu j2 = new Jeu("Bubble", c1);
		Jeu j3 = new Jeu("puzzle", c1);
		Jeu j4 = new Jeu("subway", c1);
		
		
Adresse a= new Adresse(1,"Hugo", "Paris");		
Boutique b = new Boutique("Lidl", a);
}
}