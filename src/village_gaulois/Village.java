package village_gaulois;

import personnages.Druide;
import personnages.Gaulois;



public class Village {
	private String nom;
	private int nbVillageois=0;
	private int MaxHabitant;
	private Gaulois Chef;
	private Gaulois[] villageois= new Gaulois[MaxHabitant];
	
	

	public Village(String nom, Gaulois chef ,int maxHabitant) {
		super();
		this.nom = nom;
		MaxHabitant = maxHabitant;
		Chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public Gaulois getChef() {
		return Chef;
	}
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;		
	}
	
	public Gaulois trouverVillageois(int NumeroVilageois) {
		if (NumeroVilageois>nbVillageois) {
			System.out.print("il n'y as pas autant d'habitant dans notre village!");
			return null;
		}
		return villageois[NumeroVilageois-1];
	}

}
