package test_fonctionnel;

import personnage.Gaulois;

public class TestGaulois {
	public static void main() {
		Gaulois asterix = new Gaulois("Asterix", 8); 
		Gaulois obelix = new Gaulois("Obelix", 16); 
		asterix.parler("Bonjour Obélix.");
		obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		asterix.parler("Oui très bonne idée.");
			

	}

}
