package test;

import model.Client;
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
		
		Client cl1 = new Client("Robert","Dupont");
		Client cl2 = new Client("Bernadette","Dupont");

}
}