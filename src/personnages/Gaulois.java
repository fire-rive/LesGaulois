package personnages;
import village_gaulois.Village;
import objet.Equipement;

public class Gaulois {
	private String nom;
//	private int force;
	private int effetPotion=1;
	private Village duvillage;
	private int force;
	private int nbTrophees;
	private Equipement[] trophees = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	
	}
	
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//		
//	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;		
	}
	

	public static void main(String[] args) {
		Gaulois asterix ;
		asterix=new Gaulois("Ast�rix", 8);
		System.out.println(asterix);
		
	}

//	@Override
//	public String toString() {
//		return nom;
//	}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup(force*effetPotion / 3);
//		if (effetPotion>1) {
//		effetPotion=effetPotion-1;
//		}
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
		Equipement[] tropheeRecuperer = romain.recevoirCoup((force / 2) * effetPotion);
		effetPotion--;
		if (effetPotion < 1) {
			effetPotion = 1;
		}
		for (int i = 0; tropheeRecuperer != null && i < tropheeRecuperer.length; i++,nbTrophees++) {
			this.trophees[nbTrophees] = tropheeRecuperer[i];
		}
	}
	
	public void SetVillage(Village village) {
		this.duvillage=village;
	}
	
	public void sePresenter() {
		if (duvillage==null) {
			System.out.print("Le Gaulois "+getNom()+" : \"Bonjour,je m'appelle "+getNom()+". Je voyage de villages en villages.\"\n");
		}
		else {
			if (duvillage.getChef()==this) {
				System.out.print("Le Gaulois "+getNom()+" : \"Bonjour,je m'appelle "+getNom()+". Je suis le chef du village : "+duvillage.getNom()+".\"\n");
			}
			else{System.out.print("Le Gaulois "+getNom()+" : \"Bonjour,je m'appelle "+getNom()+". J'habite le village : "+duvillage.getNom()+".\"\n");}
		}	
	}

	
	
}


