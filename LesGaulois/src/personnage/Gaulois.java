// IL FAUT UNE SOLUTION POUR EVITER CTRL-C/V
package personnage;



public class Gaulois {
	// attributs
	private String nom;
	private int force;
	private int effetPotionMagique = 1 ; // plutôt que dans le constructeur
	
	// constructeur
	public Gaulois(String nom, int force) {
		this.nom = nom; // collision évitée avec l'attribut
		this.force = force;
	}

	// méthodes
	public String getNom() {
		return nom;
	}

	private String prendreParole() {
		return "Le gaulois " + nom + ": "; // concaténation par +
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		// syso + ctrl_espace
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
	
	public void boirePotion(int forcePotion) {
		
	}

	public static void main() {
		Gaulois asterix = new Gaulois("Asterix", 8);
		
		asterix.parler("Bonjour");
		asterix.parler("Je suis fort comme " + asterix.force); // attribut privé, mais je suis dans Gaulois.java
		System.out.println(asterix);

	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotionMagique=" + effetPotionMagique + "]";
	}

}
