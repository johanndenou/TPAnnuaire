
public class Personne {
	private String nom;
	private String prenom;
	
	public Personne() {
		super();
	}
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean equals(Personne p) {
		return nom == p.nom && prenom == p.prenom;
	}
	
	public int hashCode(){
		return (nom+prenom).hashCode();
	}
	
	public String toString(){
		return nom + " " + prenom;
	}
}
