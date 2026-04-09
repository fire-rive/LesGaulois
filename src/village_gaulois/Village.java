package village_gaulois;

import personnages.Druide;
import personnages.Gaulois;



public class Village {
	private String nom;
	private int nbVillageois=0;
	private int MaxHabitant;
	private Gaulois Chef;
	private Gaulois[] villageois;
	
	

	public Village(String nom, Gaulois chef ,int maxHabitant) {
		super();
		this.nom = nom;
		MaxHabitant = maxHabitant;
		Chef = chef;
		this.villageois= new Gaulois[MaxHabitant];
		chef.SetVillage(this);
	}
	public String getNom() {
		return nom;
	}
	public Gaulois getChef() {
		return Chef;
	}
	public void ajouterVillageois(Gaulois gaulois) {
		gaulois.SetVillage(this);
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
		
	}
	
	public Gaulois trouverVillageois(int NumeroVilageois) {
		if (NumeroVilageois>nbVillageois) {
			System.out.print("il n'y as pas autant d'habitant dans notre village!\n");
			return null;
		}
		return villageois[NumeroVilageois-1];
	}
	
	public void afficherVillageois() {
		System.out.print("Dans le village \"Village des irréductibles\" du chef "+Chef.getNom()+" vivent les légendaires gaulois :\n");
		for (int i = 1; i <= nbVillageois; i++) {
			System.out.print("- "+trouverVillageois(i).getNom()+"\n");
			
		}
		
		
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix;
		abraracourcix =new Gaulois("Abraracourcix", 6);
		Village village;
		
		village=new Village("Village des Irréductibles",abraracourcix,30);
		village.trouverVillageois(30);
		
		Gaulois asterix;
		asterix =new Gaulois("Astérix", 8);
		
		village.ajouterVillageois(asterix);
		
		Gaulois gaulois =village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		village.afficherVillageois();
		
		Gaulois obelix;
		obelix =new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillageois();
		Gaulois doublepolemix;
		doublepolemix =new Gaulois("Doublepolémix", 4);
		
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublepolemix.sePresenter();
		
		
	}
	

}
