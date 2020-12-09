package client.classe;

public abstract class Client {
	
	//Attributs
	protected int idClient;
	protected String nom;
	protected String prenom;
	protected String numTel;
	protected String adresse;
	protected String codePostal;
	protected String ville;
	protected String email;
	protected String typeClient;
	
	//Constructeur
	public Client() {
		
	}
	
	//Constructeur surchargé
	public Client(int idClient, String nom, String prenom, String numTel, String adresse, String codePostal, String ville, String email, int age, String typeClient) {
		
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.email = email;
		this.typeClient = typeClient;
		
	}

	
	//Getter - Setter
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
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

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}
	
}
