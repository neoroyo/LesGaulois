package personnage;

import objets.Chaudron;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();
	
	public Druide(String nom, int force) {
		this.nom = nom; // collision évitée avec l'attribut
		this.force = force;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
		// syso + ctrl_espace
	}
	
	private String prendreParole() {
		return "Le druide " + nom + ": ";
	}
	
	public void fabriquerPotion(int quantite,int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté"+ quantite + "doses de potion magique. Elle a une force de "+ forcePotion +"");
	}
	
	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion){
			nom = gaulois.getNom();
			if (nom.equals("Obelix")){
					parler("Non"+ nom +"Non.. ! Et tu le sait tres bien");
			}
			else {
				gaulois.boirePotion(chaudron.prendreLouche());
				parler("Tiens"+ nom +"un peu de potion magique");
			}
		}
		else {
			parler("Désolé"+ nom +"in n'y a plus une seule goutte de potion");
		}
	}
	
	public String getNom() {
		return nom;
	}
}
