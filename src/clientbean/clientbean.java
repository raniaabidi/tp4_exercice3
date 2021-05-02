package clientbean;

public class clientbean {

	private String nom;
	private String prenom;
	private String adresse;
	private int tele;
	private String email;
	
	public clientbean() {
		setNom("");
		setPrenom("");
		setAdresse("");
		setTele(0);
		setEmail("");
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

	public void setPrenom(String prenon) {
		this.prenom = prenon;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTele() {
		return tele;
	}

	public void setTele(int tele) {
		this.tele = tele;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
public void vide() {

	
	
}	
	
}
