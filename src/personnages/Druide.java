package personnages;

public class Druide {
	private String nom;
	private int force;
	
	public Druide(String nom, Integer force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le Druide " + nom + " : ";
		
	}
	
	public Chaudron fabriquerPotion(int quantite,int forcePotion) {
		Chaudron potion;
		potion=new Chaudron(quantite, forcePotion);
		potion.remplirChaudron(quantite, forcePotion);
		parler("J'ai concocté"+ quantite + " dose de potion magique.Elle a une force de"+ forcePotion+".");
		return potion;
	}
	
	public void booster(Gaulois gaulois,Chaudron potion) {
		String nom_g;
		nom_g=gaulois.getNom();
		if (potion.resterPotion()) {
			if (nom_g=="Obélix") {
				parler("Non, "+ nom_g + " Non !...Et tu le sais très bien !");
				
			} else {

			}
			
		} else {

		}	
	}

	

}
