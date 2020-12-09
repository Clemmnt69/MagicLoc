package client.classe;

import java.util.ArrayList;

import client.impl.ClientProfessionnelInterface;

public class ClientProfessionnel extends Client implements ClientProfessionnelInterface {
	
	//Attributs
	public String entreprise;
	public double remise;
	
	//Constructeur
	public ClientProfessionnel() {
		
	}
	
	//Constructeur surchargé
	public ClientProfessionnel(int idClient, String nom, String prenom, String numTel, String adresse, String codePostal, String ville, String email, int age, String entreprise, double remise) {
		super();
		this.entreprise = entreprise;
		this.remise = remise;
	}

	//Getter - Setter
	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public double getRemise() {
		return remise;
	}

	public void setRemise(double remise) {
		this.remise = 0;
	}

	@Override
	public double calculRemise() {
		return 0;
	}

	@Override
	public ArrayList<ClientProfessionnel> RecupererListeProfessionnel() {
		
		ClientProfessionnel clientProfessionnelUn = new ClientProfessionnel();
		clientProfessionnelUn.setIdClient(4);
		clientProfessionnelUn.setEntreprise("CheckPoint");
		clientProfessionnelUn.setAdresse("52 boulevard Thomas");
		clientProfessionnelUn.setVille("Lyon");
		clientProfessionnelUn.setCodePostal("69004");
		clientProfessionnelUn.setEmail("CheckPoint@gmail.com");
		clientProfessionnelUn.setNumTel("06.34.75.34.67");
		
		ClientProfessionnel clientProfessionnelDeux = new ClientProfessionnel();
		clientProfessionnelDeux.setIdClient(5);
		clientProfessionnelDeux.setEntreprise("RunForever");
		clientProfessionnelDeux.setAdresse("110 rue du docteur Plop");
		clientProfessionnelDeux.setVille("Lyon");
		clientProfessionnelDeux.setCodePostal("69004");
		clientProfessionnelDeux.setEmail("RunForever@gmail.com");
		clientProfessionnelDeux.setNumTel("06.55.83.45.32");
		
		ClientProfessionnel clientProfessionnelTrois = new ClientProfessionnel();
		clientProfessionnelTrois.setIdClient(6);
		clientProfessionnelTrois.setEntreprise("TireFire");
		clientProfessionnelTrois.setAdresse("35 boulevard du Roi");
		clientProfessionnelTrois.setVille("Lyon");
		clientProfessionnelTrois.setCodePostal("69005");
		clientProfessionnelTrois.setEmail("TireFire@gmail.com");
		clientProfessionnelTrois.setNumTel("06.55.35.25.75");
		
		ArrayList<ClientProfessionnel> listeClientProfessionnel = new ArrayList<ClientProfessionnel>();
		listeClientProfessionnel.add(clientProfessionnelUn);
		listeClientProfessionnel.add(clientProfessionnelDeux);
		listeClientProfessionnel.add(clientProfessionnelTrois);
		
		return listeClientProfessionnel;
	}	
}
