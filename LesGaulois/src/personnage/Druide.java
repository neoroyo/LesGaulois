package personnage;

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
		self.quantitePotion = quantite;
		self.forcePotion = forcePotion;
		parler("J'ai concocté"+ quantite + "doses de potion magique. Elle a une force de "+ forcePotion +"");
	}
	
	public void booster(Gaulois gaulois) {
		//
	}
	
	public String getNom() {
		return nom;
	}
}
