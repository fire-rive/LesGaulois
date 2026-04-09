package personnages;
import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;
	private Village duvillage;
	
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

	@Override
	public String toString() {
		return nom;
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force*effetPotion / 3);
		if (effetPotion>1) {
		effetPotion=effetPotion-1;
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


