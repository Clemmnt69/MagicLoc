package location.classe;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;

import client.classe.Client;
import client.classe.ClientParticulier;
import client.classe.ClientProfessionnel;
import vehicule.classe.Vehicule;
import vehicule.classe.VehiculeParticulier;
import vehicule.classe.VehiculeUtilitaire;


public class Location{
	
	//Attributs
	private String date_debut;
	private String date_fin;	
	private float prix;
	private Vehicule vehicule;
	private ClientParticulier client_particulier;
	private ClientProfessionnel client_professionnel;
	private Client client;
	
	//Constructeur
	public Location() {
		
	}
	
	public Location(String date_debut, String date_fin, float prix, Vehicule vehicule)
	{
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.prix = prix;
		this.vehicule = vehicule;
	}	
	
	//Getter -- Setter
	
	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
	public ClientParticulier getClient_Particulier() {
		return client_particulier;
	}

	public void setClient_Particulier(ClientParticulier client) {
		this.client_particulier = client;
	}
	
	public ClientProfessionnel getClient_Professionnel() {
		return client_professionnel;
	}

	public void setClient_Professionnel(ClientProfessionnel client_pro) {
		this.client_professionnel = client_pro;
	}
	
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}	
	
	public Collection<Location> Recuperer_List_Location()
	{			
		VehiculeParticulier vehicule_particulier = new VehiculeParticulier();	
		VehiculeUtilitaire vehicule_utilitaire = new VehiculeUtilitaire();
		ClientParticulier client_particulier = new ClientParticulier();
		ClientProfessionnel client_professionnel = new ClientProfessionnel();
		
		ArrayList<ClientParticulier> lst_client_particulier = client_particulier.RecupererListeParticulier();
		ArrayList<ClientProfessionnel> lst_client_professionnel = client_professionnel.RecupererListeProfessionnel();
		
		Collection<VehiculeParticulier> lst_vehicule_particulier = vehicule_particulier.Recuperer_List_Vehicule_Particulier();
		Collection<VehiculeUtilitaire> lst_vehicule_utilitaire = vehicule_utilitaire.Recuperer_List_Vehicule_Utilitaire();
		
		System.out.println(lst_client_professionnel);
		
		Collection<Location> lst_location = new ArrayList<Location>();
		
		//Date FR
		Locale locale = new Locale("fr", "FR");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		
		//Ajout jour sur la date de fin de location
		Date date_fin = new Date();
		Calendar c = Calendar.getInstance(); 
		c.setTime(date_fin); 
		c.add(Calendar.DATE, 1);
		date_fin = c.getTime();
		
		int conteur_client = 0;
		
		for(VehiculeParticulier unVehicule : lst_vehicule_particulier)
	    {
			Location une_location = new Location();		

			une_location.setDate_debut(dateFormat.format(new Date()));
			une_location.setDate_fin(dateFormat.format(date_fin));
			une_location.setPrix(600);
			une_location.setVehicule(unVehicule);
			une_location.setClient_Particulier(lst_client_particulier.get(conteur_client++));
			lst_location.add(une_location);
	    }
		
		conteur_client = 0;
		for(VehiculeUtilitaire unVehicule : lst_vehicule_utilitaire)
	    {
			Location une_location = new Location();
			
			une_location.setDate_debut(dateFormat.format(new Date()));
			une_location.setDate_fin(dateFormat.format(date_fin));			
			une_location.setPrix(1200);
			une_location.setVehicule(unVehicule);
			une_location.setClient_Professionnel(lst_client_professionnel.get(conteur_client++));
			System.out.println(lst_client_professionnel.get(0).getNom());
			
			lst_location.add(une_location);
	    }	
		
		return lst_location;
	}
	
	public float Calculer_Prix_Location(boolean particulier, int nombre_jours_location)
	{
		//Calcul du prix de location
		float prixTTC = 0;
		
		if(particulier)
		{
			//Calcul du prix pour un vehicule particulier
			prixTTC = nombre_jours_location * 225;
		}
		else
		{
			//Calcul du prix pour un vehicule professionnel
			prixTTC = nombre_jours_location * 150;
		}
			
		return prixTTC;
	}
}
