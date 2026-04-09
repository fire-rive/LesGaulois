package test_fonctionnel;

import java.util.Iterator;
import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
import objet.Chaudron;
public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois asterix;
		asterix =new Gaulois("Ast�rix", 8);
		
		Gaulois obelix;
		obelix =new Gaulois("Ob�lix", 16);
		
		
		asterix.parler("Bonjour Ob�lix.");
		obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?)");
		asterix.parler("Oui tr�s bonne id�e.");
		
		Romain brutus;
		brutus =new Romain("brutus", 14);
		
		Druide panoramix;
		panoramix=new Druide("Panoramix", 2);
		
		Romain minus;
		minus =new Romain("Minus", 6);
		
		
		System.out.println("Dans la for�t " + asterix.getNom() + " et  "+ obelix.getNom() + " tombent nez � nez sur le romain " + minus.getNom() + ".");
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
		
		Chaudron potion;
		potion=panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix, potion);
		panoramix.booster(asterix, potion);
		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);
		}
		
		
	}

}
