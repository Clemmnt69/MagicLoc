package vehicule.classe;

import java.util.ArrayList;
import java.util.Collection;

import vehicule.impl.VehiculeParticulierInterface;

public class VehiculeParticulier extends Vehicule implements VehiculeParticulierInterface {

	//Attributs
	public String type;

	//Constructeur
	public VehiculeParticulier()
	{
		
	}
	
	//Constructeur surchargé
	public VehiculeParticulier(String type)
	{
		this.type = type;
	}
	
	//Getter - Setter
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean Rouler()
	{
		return true;
	}
	
	@Override
	public Collection<VehiculeParticulier> Recuperer_List_Vehicule_Particulier()
	{
		Collection<VehiculeParticulier> lst_vehicule = new ArrayList<VehiculeParticulier>();
		
		VehiculeParticulier un_vehicule = new VehiculeParticulier();
		
		un_vehicule.setNum_serie(1245697);
		un_vehicule.setMarque("Audi");
		un_vehicule.setModele("TT");
		un_vehicule.setAnnee(2020);
		un_vehicule.setCouleur("Rouge");
		un_vehicule.setType("Sportif");
		un_vehicule.setNb_porte(3);
		un_vehicule.setEtat("Neuf");
		
		lst_vehicule.add(un_vehicule);
		
		un_vehicule = new VehiculeParticulier();
		
		un_vehicule.setNum_serie(7266697);
		un_vehicule.setMarque("Mercedes");
		un_vehicule.setModele("Classe A");
		un_vehicule.setAnnee(2020);
		un_vehicule.setCouleur("Blanche");
		un_vehicule.setType("Citadine");
		un_vehicule.setNb_porte(5);
		un_vehicule.setEtat("Occasion");
		
		lst_vehicule.add(un_vehicule);
		
		un_vehicule = new VehiculeParticulier();
		
		un_vehicule.setNum_serie(8249997);
		un_vehicule.setMarque("Mercedes");
		un_vehicule.setModele("Classe C");
		un_vehicule.setAnnee(2018);
		un_vehicule.setCouleur("Jaune");
		un_vehicule.setType("Berline");
		un_vehicule.setNb_porte(5);
		un_vehicule.setEtat("Occasion");
		
		lst_vehicule.add(un_vehicule);
		
		return lst_vehicule;
	}
}
