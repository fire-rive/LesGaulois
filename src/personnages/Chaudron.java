package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	
	
	public Chaudron(int quantitePotion, int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}

	public Boolean resterPotion() {
		if (quantitePotion==0) {
			return false;
			
		} else {
			return true;

		}
		
	}
	
	public int PrendreLouche() {
		if (quantitePotion==0) {
			forcePotion=0;
		}
		quantitePotion= quantitePotion - forcePotion;
		return forcePotion;
		
	}
	
	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion=quantite;
		this.forcePotion=forcePotion;
		
	}

}
