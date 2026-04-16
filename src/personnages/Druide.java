package personnages;
import objet.Chaudron;
public class Druide {
	private String nom;
	private int force;
	private Chaudron potion;
	
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
	
	public void fabriquerPotion(int quantite,int forcePotion) {
		potion=new Chaudron(quantite, forcePotion);
		potion.remplirChaudron(quantite, forcePotion);
		parler("J'ai concoct� "+ quantite + " dose de potion magique.Elle a une force de"+ forcePotion+".");
	}
	
	public void booster(Gaulois gaulois) {
		String nom_g;
		nom_g=gaulois.getNom();
		if (potion.resterPotion()) {
			if (nom_g=="Ob�lix") {
				parler("Non, "+ nom_g + " Non !...Et tu le sais tr�s bien !");
			} else {
				gaulois.boirePotion(potion.PrendreLouche());
				parler("Tiens "+ nom_g + " un peu de potion magique");
			}
		} else {
			parler("D�sol�, "+ nom_g+" il n'y as plus une seule goutte de binouze");
		}	
	}

	

}
