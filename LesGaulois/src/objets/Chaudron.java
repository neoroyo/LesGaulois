package objets;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	public boolean resterPotion;
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion = quantite;
		this.forcePotion = forcePotion;
		
	}
	
	public boolean resterPotion(int quantitePotion) {
		return this.quantitePotion > 0;
	}
	
	public int prendreLouche(){
		return forcePotion;
	}
}

