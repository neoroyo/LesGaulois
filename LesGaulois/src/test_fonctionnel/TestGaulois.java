package test_fonctionnel;

import personnage.Gaulois;
import personnage.Romain;

public class TestGaulois {
	public static void main() {
		Gaulois asterix = new Gaulois("Asterix", 8); 
		Gaulois obelix = new Gaulois("Obelix", 16); 
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
		Romain minus = new Romain("Minus", 6);
		System.out.println("Dans la foret Astérix et Obélix tombent nez a nez sur le roamin Minus");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);

			

	}

}
