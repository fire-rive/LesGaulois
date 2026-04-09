package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
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
		return "Le romain " + nom + " : ";
		
	}
	
	private boolean isInvariantVerified() {
		return this.force>=0;		
	}
	
	public void recevoirCoup(int forceCoup) {
		assert(forceCoup>=0);
		int asertForce;
		asertForce=this.force;
		this.force=force-forceCoup;
		if (force<1) {
			parler("j'abandonne");
			prendreParole();
		} else {
			parler("Aie");
		}
		assert(this.force<asertForce);
		
		
	}
	
	public static void main(String[] args) {
		Romain minus;
		minus=new Romain("Minus", 6);
		assert(minus.isInvariantVerified());
		
	}

}
