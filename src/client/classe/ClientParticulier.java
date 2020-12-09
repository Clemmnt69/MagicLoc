package client.classe;

import java.util.ArrayList;

import client.impl.ClientParticulierInterface;

public class ClientParticulier extends Client implements ClientParticulierInterface {
	
	//Attributs
	private int age;
	private int pointRisque;
	
	ArrayList<ClientParticulier> list;
	
	//Constructeur
	public ClientParticulier() {
		
	}
	
	//Constructeur surchargé
	public ClientParticulier(int idClient, String nom, String prenom, String numTel, String adresse, String codePostal, String ville, String email, int age, int pointRisque) {
		super();
		this.age = age;
		this.pointRisque = pointRisque;
	}
	
	//Getter - Setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getPointRisque() {
		return pointRisque;
	}

	public void setPointRisque(int pointRisque) {
		this.pointRisque = pointRisque;
	}

	@Override
	public int pointDeRisque(int age) {
		if(this.age >= 18 && this.age < 25) {
			this.pointRisque = 4;
		}else if(this.age >= 25 && this.age < 40 ) {
			this.pointRisque = 3;
		}else if(this.age >= 40 && this.age < 60) {
			this.pointRisque = 2;
		}else {
			this.pointRisque = 1;
		}
		return pointRisque;
	}

	@Override
	public ArrayList<ClientParticulier> RecupererListeParticulier() {
		
		ClientParticulier clientParticulierUn = new ClientParticulier();
		clientParticulierUn.setIdClient(1);
		clientParticulierUn.setNom("Doudou");
		clientParticulierUn.setPrenom("Albert");
		clientParticulierUn.setAdresse("58 rue Saint Gervais");
		clientParticulierUn.setCodePostal("69003");
		clientParticulierUn.setVille("Lyon");
		clientParticulierUn.setEmail("Doudou.albert@gmail.com");
		clientParticulierUn.setNumTel("06.52.80.30.55");
		clientParticulierUn.setAge(35);
		clientParticulierUn.pointDeRisque(35);
		
		ClientParticulier clientParticulierDeux = new ClientParticulier();
		clientParticulierDeux.setIdClient(2);
		clientParticulierDeux.setNom("Doudi");
		clientParticulierDeux.setPrenom("Gérard");
		clientParticulierDeux.setAdresse("83 rue Saint Gervais");
		clientParticulierDeux.setCodePostal("69003");
		clientParticulierDeux.setVille("Lyon");
		clientParticulierDeux.setEmail("Doudi.gerard@gmail.com");
		clientParticulierDeux.setNumTel("06.53.81.31.54");
		clientParticulierDeux.setAge(50);
		clientParticulierDeux.pointDeRisque(50);
		
		ClientParticulier clientParticulierTrois = new ClientParticulier();
		clientParticulierTrois.setIdClient(3);
		clientParticulierTrois.setNom("Douda");
		clientParticulierTrois.setPrenom("Robert");
		clientParticulierTrois.setAdresse("60 rue Saint Gervais");
		clientParticulierTrois.setCodePostal("69003");
		clientParticulierTrois.setVille("Lyon");
		clientParticulierTrois.setEmail("Douda.robert@gmail.com");
		clientParticulierTrois.setNumTel("06.39.35.46.75");
		clientParticulierTrois.setAge(20);
		
		ArrayList<ClientParticulier> listeClientParticulier = new ArrayList<ClientParticulier>();
		listeClientParticulier.add(clientParticulierUn);
		listeClientParticulier.add(clientParticulierDeux);
		listeClientParticulier.add(clientParticulierTrois);
		
		return listeClientParticulier;
	}
}
