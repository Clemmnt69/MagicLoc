package vehicule.classe;

import java.util.ArrayList;
import java.util.Collection;

import vehicule.impl.VehiculeUtilitaireInterface;

public class VehiculeUtilitaire extends Vehicule implements VehiculeUtilitaireInterface {

	//Attributs
	public int capacite;

	//Constructeur
	public VehiculeUtilitaire()
	{
		
	}
	
	//Constructeur surchargé
	public VehiculeUtilitaire(int capacite)
	{
		this.capacite = capacite;
	}
	
	//Getter - Setter
	public int getCapacite() {
		return capacite;
	}
	
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	@Override
	public Collection<VehiculeUtilitaire> Recuperer_List_Vehicule_Utilitaire()
	{
		Collection<VehiculeUtilitaire> lst_vehicule = new ArrayList<VehiculeUtilitaire>();
		
		VehiculeUtilitaire un_vehicule = new VehiculeUtilitaire();
		
		un_vehicule.setNum_serie(7800798);
		un_vehicule.setMarque("Peugeot");
		un_vehicule.setModele("Boxer");
		un_vehicule.setAnnee(2016);
		un_vehicule.setCouleur("Blanc");
		un_vehicule.setType("Utilitaire");
		un_vehicule.setNb_porte(3);
		un_vehicule.setEtat("Occasion");
		un_vehicule.setCapacite(1500);
		
		lst_vehicule.add(un_vehicule);
		
		un_vehicule = new VehiculeUtilitaire();
		
		un_vehicule.setNum_serie(1797002);
		un_vehicule.setMarque("Fiat");
		un_vehicule.setModele("Ducato III");
		un_vehicule.setAnnee(2012);
		un_vehicule.setCouleur("Blanc");
		un_vehicule.setType("Utilitaire");
		un_vehicule.setNb_porte(3);
		un_vehicule.setEtat("Occasion");
		un_vehicule.setCapacite(3500);
		
		lst_vehicule.add(un_vehicule);
		
		un_vehicule = new VehiculeUtilitaire();
		
		un_vehicule.setNum_serie(4880033);
		un_vehicule.setMarque("Citroen");
		un_vehicule.setModele("Berlingo");
		un_vehicule.setAnnee(2014);
		un_vehicule.setCouleur("Blanc");
		un_vehicule.setType("Utilitaire");
		un_vehicule.setNb_porte(3);
		un_vehicule.setEtat("Occasion");
		un_vehicule.setCapacite(3000);
		
		lst_vehicule.add(un_vehicule);
		
		return lst_vehicule;
	}
}
