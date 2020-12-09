package vehicule.classe;


public abstract class Vehicule{
	
	//Attributs
	private int num_serie;
	private String marque;
	private String modele;
	private int annee;
	private String couleur;
	private String type;
	private int nb_porte;
	private String etat;
	
	
	//Constructeur
	public Vehicule() {
		
	}
	
	public Vehicule(int num_serie, String marque, String modele, int annee, String couleur, String type, int nb_porte, String etat)
	{
		this.num_serie = num_serie;
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.couleur = couleur;
		this.type = type;
		this.nb_porte = nb_porte;
		this.etat = etat;
	}
	
	//Getter -- Setter
	public int getNum_serie() {
		return num_serie;
	}

	public void setNum_serie(int num_serie) {
		this.num_serie = num_serie;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}
	
	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNb_porte() {
		return nb_porte;
	}

	public void setNb_porte(int nb_porte) {
		this.nb_porte = nb_porte;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
}
