package client.fenetre;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import client.classe.ClientParticulier;
import client.classe.ClientProfessionnel;
import location.classe.Location;
import vehicule.classe.VehiculeParticulier;
import vehicule.classe.VehiculeUtilitaire;
import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;
import javax.swing.ImageIcon;


public class FenetreVehicule extends JFrame implements ActionListener {
	
	private JTable TAB_Location;
	private JPanel PAN_Gestion_Location;
	private JPanel PAN_Location;
	private JPanel PAN_Ajouter_Location;
	private JPanel PAN_Recapitulatif_Location;
	private JLabel LB_Titre_Ajouter_Location;
	private JRadioButton RB_Particulier;
	private JRadioButton RB_Utilitaire;
	private JComboBox<String> LST_Vehicule;
	private JComboBox<String> LST_Client;
	private JDateChooser DATE_Debut_Location;
	private JDateChooser DATE_Fin_Location;
	private JButton BT_Retour_Ajout;
	private JButton BT_Valider_Location;
	private JLabel LB_Titre_Type_Vehicule;
	private JLabel LB_Titre_Vehicule;
	private JLabel LB_Titre_Client;
	private JLabel LB_Titre_Debut_Location;
	private JLabel LB_Titre_Fin_Location;
	private JLabel LB_Titre_Confirmation_Location;
	private JLabel LB_Titre_Temps_Location;
	private JLabel LB_Titre_PrixTTC;
	private JLabel LB_Temps_Location;
	private JLabel LB_PrixTTC;
	private JButton BT_Confirmer_Location;
	private JButton BT_Annuler_Location;
	private ButtonGroup BTG_Type_Vehicule;
	private JButton BT_AffichageAjoutLocation;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel;
	private JButton btnNewButton;
	private JPanel panel_2;
	private JLabel lblNewLabel_2;
		
	public FenetreVehicule() {
		setResizable(false);
		//Titre de la fenêtre
		setTitle("MagicLoc - Gestion des locations");
		//Taille de la fenêtre
		setSize(1101,732);
		//Permet de centrer la fenêtre
		setLocationRelativeTo(null);
		//Permet de fermer l'application avec la croix
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Initialisation de JPanel
		setContentPane(buildContentPane());
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(0, 0, 1098, 85);
		PAN_Gestion_Location.add(panel_1);
		
		lblNewLabel = new JLabel("MagicLoc'");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 37));
		lblNewLabel.setBounds(10, 11, 330, 65);
		panel_1.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBackground(new Color(102, 153, 204));
		panel.setBounds(0, 83, 1098, 44);
		PAN_Gestion_Location.add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("");
		btnNewButton.setBounds(10, 7, 44, 33);
		panel.add(btnNewButton);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\cleme\\Downloads\\home (4).png"));
		
		lblNewLabel_1 = new JLabel("Gestion des locations");
		lblNewLabel_1.setBounds(455, 11, 258, 29);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		//On affiche la fenêtre
		setVisible(true);	
	}
	
	//Création de la fenêtre
	private JPanel buildContentPane() {	
		
		Location location = new Location();
		
		//Elements Design 
		
		//Panel Global
		PAN_Gestion_Location = new JPanel();
		PAN_Gestion_Location.setBackground(Color.WHITE);
		PAN_Gestion_Location.setLayout(null);
		
		//Panel Location en cours
		PAN_Location = new JPanel();
		PAN_Location.setBounds(57, 160, 973, 223);
		PAN_Gestion_Location.add(PAN_Location);
		PAN_Location.setLayout(null);
		
			//Tableau Location en cours
			TAB_Location = new JTable();
			JScrollPane scrollPane = new JScrollPane(TAB_Location);
		    scrollPane.setBounds(0, 45, 978, 137);
		    PAN_Location.add(scrollPane);
			
			//Button Afficher panel ajouter une location
			BT_AffichageAjoutLocation = new JButton("Ajouter une location");
		    BT_AffichageAjoutLocation.setForeground(new Color(0, 128, 0));
		    BT_AffichageAjoutLocation.setBounds(420, 193, 172, 23);
		    PAN_Location.add(BT_AffichageAjoutLocation);
		
		//Panel Ajouter une location
		PAN_Ajouter_Location = new JPanel();
	    PAN_Ajouter_Location.setVisible(false);
		PAN_Ajouter_Location.setBounds(67, 394, 390, 288);
		PAN_Gestion_Location.add(PAN_Ajouter_Location);
		PAN_Ajouter_Location.setLayout(null);
		
			//Titre Ajouter une location
			LB_Titre_Ajouter_Location = new JLabel("Ajouter une location");
			LB_Titre_Ajouter_Location.setBounds(80, 11, 262, 35);
			LB_Titre_Ajouter_Location.setHorizontalAlignment(SwingConstants.CENTER);
			LB_Titre_Ajouter_Location.setFont(new Font("Tahoma", Font.PLAIN, 17));
			PAN_Ajouter_Location.add(LB_Titre_Ajouter_Location);
			
			//Radio Button Vehicule particulier
			RB_Particulier = new JRadioButton("Particulier");
			RB_Particulier.setSelected(true);
			RB_Particulier.setBounds(127, 86, 90, 23);
			PAN_Ajouter_Location.add(RB_Particulier);
			
			//Radio Button Vehicule utilitaire
			RB_Utilitaire = new JRadioButton("Utilitaire");
			RB_Utilitaire.setBounds(219, 86, 111, 23);
			PAN_Ajouter_Location.add(RB_Utilitaire);
			
			//Radio Button Groupe
			BTG_Type_Vehicule = new ButtonGroup();    
			BTG_Type_Vehicule.add(RB_Particulier);BTG_Type_Vehicule.add(RB_Utilitaire);  
			
			//Liste Vehicule
			LST_Vehicule = new JComboBox<String>();
			LST_Vehicule.setBounds(118, 111, 179, 22);
			PAN_Ajouter_Location.add(LST_Vehicule);
			
			//Liste Client
			LST_Client = new JComboBox<String>();
			LST_Client.setBounds(118, 142, 179, 22);
			PAN_Ajouter_Location.add(LST_Client);
			
			//DatePicker Debut location
			DATE_Debut_Location = new JDateChooser();
			DATE_Debut_Location.setDateFormatString("dd/MM/yyyy");
			String date_minimum = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
			DATE_Debut_Location.setMinSelectableDate(Convertisseur_String_En_Date(date_minimum));
			DATE_Debut_Location.setBounds(118, 187, 144, 20);
			PAN_Ajouter_Location.add(DATE_Debut_Location);	
			
			//DatePicker Fin location
			DATE_Fin_Location = new JDateChooser();				     		
			DATE_Fin_Location.setDateFormatString("dd/MM/yyyy");					
			DATE_Fin_Location.setMinSelectableDate(Convertisseur_String_En_Date(date_minimum));
			DATE_Fin_Location.setBounds(118, 216, 144, 20);
			PAN_Ajouter_Location.add(DATE_Fin_Location);
			
			//Button Retour ajout location
			BT_Retour_Ajout = new JButton("Retour");
			BT_Retour_Ajout.setForeground(new Color(255, 165, 0));
			BT_Retour_Ajout.setBounds(10, 20, 90, 23);
			PAN_Ajouter_Location.add(BT_Retour_Ajout);
			
			//Button Valider Location
			BT_Valider_Location = new JButton("Valider");
			BT_Valider_Location.setForeground(new Color(0, 128, 0));
			BT_Valider_Location.setBounds(103, 254, 161, 23);
			PAN_Ajouter_Location.add(BT_Valider_Location);
			
			//Titre Type vehicule
			LB_Titre_Type_Vehicule = new JLabel("Type de v\u00E9hicule :");
			LB_Titre_Type_Vehicule.setBounds(10, 90, 111, 14);
			PAN_Ajouter_Location.add(LB_Titre_Type_Vehicule);
			
			//Titre Vehicule
			LB_Titre_Vehicule = new JLabel("V\u00E9hicule :");
			LB_Titre_Vehicule.setBounds(10, 115, 111, 18);
			PAN_Ajouter_Location.add(LB_Titre_Vehicule);
			
			//Titre Client
			LB_Titre_Client = new JLabel("Client :");
			LB_Titre_Client.setBounds(10, 144, 111, 18);
			PAN_Ajouter_Location.add(LB_Titre_Client);
			
			//Titre Debut location
			LB_Titre_Debut_Location = new JLabel("D\u00E9but de location");
			LB_Titre_Debut_Location.setBounds(10, 189, 111, 18);
			PAN_Ajouter_Location.add(LB_Titre_Debut_Location);
			
			//Titre Fin location
			LB_Titre_Fin_Location = new JLabel("Fin de location");
			LB_Titre_Fin_Location.setBounds(10, 218, 111, 18);
			PAN_Ajouter_Location.add(LB_Titre_Fin_Location);		
		
		//Panel Recapitulatif location
		PAN_Recapitulatif_Location = new JPanel();
		PAN_Recapitulatif_Location.setVisible(false);
		PAN_Recapitulatif_Location.setBounds(614, 394, 332, 288);
		PAN_Gestion_Location.add(PAN_Recapitulatif_Location);	
		PAN_Recapitulatif_Location.setLayout(null);
		
			//Titre Ajouter une location
			LB_Titre_Confirmation_Location = new JLabel("R\u00E9capitulatif de la location");
			LB_Titre_Confirmation_Location.setHorizontalAlignment(SwingConstants.CENTER);
			LB_Titre_Confirmation_Location.setFont(new Font("Tahoma", Font.PLAIN, 17));
			LB_Titre_Confirmation_Location.setBounds(42, 11, 262, 35);
			PAN_Recapitulatif_Location.add(LB_Titre_Confirmation_Location);
			
			//Titre Temps location
			LB_Titre_Temps_Location = new JLabel("Temps de location :");
			LB_Titre_Temps_Location.setBounds(10, 77, 142, 18);
			PAN_Recapitulatif_Location.add(LB_Titre_Temps_Location);
			
			//Titre Prix TTC
			LB_Titre_PrixTTC = new JLabel("Prix TTC :");
			LB_Titre_PrixTTC.setBounds(10, 122, 83, 18);
			PAN_Recapitulatif_Location.add(LB_Titre_PrixTTC);
			
			//Label Temps location
			LB_Temps_Location = new JLabel("Prix TTC");
			LB_Temps_Location.setBounds(143, 79, 119, 14);
			PAN_Recapitulatif_Location.add(LB_Temps_Location);
			
			//Label Prix TTC
			LB_PrixTTC = new JLabel("Temps location");
			LB_PrixTTC.setBounds(103, 124, 164, 14);
			PAN_Recapitulatif_Location.add(LB_PrixTTC);
			
			//Button Confirmer location
			BT_Confirmer_Location = new JButton("Confirmer");
			BT_Confirmer_Location.setForeground(new Color(0, 128, 0));
			BT_Confirmer_Location.setBounds(157, 163, 105, 23);
			PAN_Recapitulatif_Location.add(BT_Confirmer_Location);
			
			//Button Annuler location
			BT_Annuler_Location = new JButton("Annuler");
			BT_Annuler_Location.setForeground(Color.RED);
			BT_Annuler_Location.setBounds(21, 163, 105, 23);
			PAN_Recapitulatif_Location.add(BT_Annuler_Location);
			 	    
			
	    //Ajout du tableau
		DefaultTableModel TableauLocationModel = new DefaultTableModel(0, 0);

		//Ajout des colonnes
	    String[] colonnes = new String[] {"Client", "Numéro de série", "Voiture", "Couleur", "Nombre de porte", "Type", "Début de location", "Fin de location", "Prix TTC"};

	    TableauLocationModel.setColumnIdentifiers(colonnes);
	    
	    //Ajout d'une location en cours
	    Collection<Location> lst_location = new ArrayList<Location>();
	    
	    lst_location = location.Recuperer_List_Location();
	    
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    
	    for(Location uneLocation : lst_location)
	    {
	    	String client = "";
	    	
	    	if(uneLocation.getVehicule().getType() == "Utilitaire")
	    		client = uneLocation.getClient_Professionnel().getEntreprise();
	    	else
	    		client = uneLocation.getClient_Particulier().getNom() + " " + uneLocation.getClient_Particulier().getPrenom();
	    	
	    	System.out.println(client);
	    	
	    	TableauLocationModel.addRow(new Object[] {
	    			
	    			client,
	    			uneLocation.getVehicule().getNum_serie(),
	    			uneLocation.getVehicule().getMarque() + " " + uneLocation.getVehicule().getModele() + " " + uneLocation.getVehicule().getAnnee(),
	    			uneLocation.getVehicule().getCouleur(),
	    			uneLocation.getVehicule().getNb_porte(),
	    			uneLocation.getVehicule().getType(),    			
	    			uneLocation.getDate_debut(),
	    			uneLocation.getDate_fin(),
	    			uneLocation.getPrix() + " €"
	    	});
	    }
	    //On ajoute
	    TAB_Location.setModel(TableauLocationModel);
	    
	    panel_2 = new JPanel();
	    panel_2.setBackground(new Color(102, 153, 204));
	    panel_2.setBounds(0, 0, 978, 44);
	    PAN_Location.add(panel_2);
	    panel_2.setLayout(null);
	    
	    lblNewLabel_2 = new JLabel("Location en cours");
	    lblNewLabel_2.setBounds(404, 11, 268, 32);
	    lblNewLabel_2.setForeground(Color.WHITE);
	    lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 24));
	    panel_2.add(lblNewLabel_2);
	    
	    	   
		//Action affichage Panel ajout de location	    	    
	    BT_AffichageAjoutLocation.addMouseListener(new MouseAdapter() {
	    	@Override
	    	public void mouseClicked(MouseEvent e) {
	    		//Action lors du click sur le BT
	    		PAN_Ajouter_Location.setVisible(true);
	    		BT_AffichageAjoutLocation.setVisible(false);
	    	}
	    });
	            		
		//Récupération de la liste des vehicules particulier    
		VehiculeParticulier vehicule_particulier = new VehiculeParticulier();
		Collection<VehiculeParticulier> lst_vehicule_particulier = vehicule_particulier.Recuperer_List_Vehicule_Particulier();
		VehiculeUtilitaire vehicule_utilitaire = new VehiculeUtilitaire();
		Collection<VehiculeUtilitaire> lst_vehicule_utilitaire = vehicule_utilitaire.Recuperer_List_Vehicule_Utilitaire();
				
		for(VehiculeParticulier UnVehicule : lst_vehicule_particulier)
		{
			LST_Vehicule.addItem(UnVehicule.getMarque() + " " + UnVehicule.getModele() + " " + UnVehicule.getAnnee());
		}
		
		//Récupération de la liste des clients particulier & professionnel
		ClientParticulier client_particulier = new ClientParticulier();
		Collection<ClientParticulier> lst_client_particulier = client_particulier.RecupererListeParticulier();
		ClientProfessionnel client_proessionnel = new ClientProfessionnel();
		Collection<ClientProfessionnel> lst_client_professionnel = client_proessionnel.RecupererListeProfessionnel();
				
		for(ClientParticulier UnClient : lst_client_particulier)
		{
			LST_Client.addItem(UnClient.getNom() + " " + UnClient.getPrenom());
		}		
		
		//Changement du type de vehicule
		RB_Particulier.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(RB_Particulier.isSelected())
				{
					//Choix de vehicule particulier, on récupere la liste des vehicules particulier
					VehiculeParticulier vehicule_particulier = new VehiculeParticulier();
					Collection<VehiculeParticulier> lst_vehicule_particulier = vehicule_particulier.Recuperer_List_Vehicule_Particulier();
					LST_Vehicule.removeAllItems();
					
					for(VehiculeParticulier UnVehicule : lst_vehicule_particulier)
					{
						LST_Vehicule.addItem(UnVehicule.getMarque() + " " + UnVehicule.getModele() + " " + UnVehicule.getAnnee());
					}
					
					//Choix de vehicule particulier, on récupere la liste des clients particulier
					ClientParticulier client_particulier = new ClientParticulier();
					Collection<ClientParticulier> lst_client_particulier = client_particulier.RecupererListeParticulier();
					LST_Client.removeAllItems();		
					
					for(ClientParticulier UnClient : lst_client_particulier)
					{
						LST_Client.addItem(UnClient.getNom() + " " + UnClient.getPrenom());
					}
				}
			}
		});
		 
		//Changement du type de vehicule
		RB_Utilitaire.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(RB_Utilitaire.isSelected())
				{
					//Choix de vehicule utilitaire, on récupere la liste des vehicules utilitaire
					VehiculeUtilitaire vehicule_utilitaire = new VehiculeUtilitaire();
					Collection<VehiculeUtilitaire> lst_vehicule_utilitaire = vehicule_utilitaire.Recuperer_List_Vehicule_Utilitaire();
					LST_Vehicule.removeAllItems();
					
					for(VehiculeUtilitaire UnVehicule : lst_vehicule_utilitaire)
					{
						LST_Vehicule.addItem(UnVehicule.getMarque() + " " + UnVehicule.getModele() + " " + UnVehicule.getAnnee());
					}
					
					//Choix de vehicule utilitaire, on récupere la liste des clients professionnel
					ClientProfessionnel client_professionnel = new ClientProfessionnel();
					Collection<ClientProfessionnel> lst_client_professionnel = client_professionnel.RecupererListeProfessionnel();
					LST_Client.removeAllItems();		
					
					for(ClientProfessionnel UnClient : lst_client_professionnel)
					{
						LST_Client.addItem(UnClient.getEntreprise());
					}
				}
			}
		});
		
		//Blocage de date de debut de location
		DATE_Debut_Location.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DATE_Debut_Location.setMaxSelectableDate(DATE_Fin_Location.getDate());
			}
		});
			
		//Blocage de date de fin de location
		DATE_Fin_Location.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DATE_Fin_Location.setMinSelectableDate(DATE_Debut_Location.getDate());
			}
		});
				
			
		//Action sur retour de l'ajout de la location
		BT_Retour_Ajout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PAN_Ajouter_Location.setVisible(false);
				BT_AffichageAjoutLocation.setVisible(true);
			}
		});
					
			
		BT_Valider_Location.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Verification de la validité des éléments
				if(LST_Vehicule.getSelectedItem() != null && LST_Client.getSelectedItem() != null && DATE_Debut_Location.getDate() != null && DATE_Fin_Location.getDate() != null)
				{											
					//Calcul du temps de location souhaite 
					Period period = Period.between(Convertisseur_Date_En_LocalDate(DATE_Debut_Location.getDate()), Convertisseur_Date_En_LocalDate(DATE_Fin_Location.getDate()));
					
				    int nombre_de_jours = period.getDays();
				    
				    if(nombre_de_jours > 1)
				    {
				    	//On affiche le récapitulatif de la location
						PAN_Recapitulatif_Location.setVisible(true);
						LST_Vehicule.setEnabled(false);
						LST_Client.setEnabled(false);
						DATE_Debut_Location.setEnabled(false);
						DATE_Fin_Location.setEnabled(false);
						BT_Valider_Location.setEnabled(false);
						RB_Particulier.setEnabled(false);
						RB_Utilitaire.setEnabled(false);
						BT_Retour_Ajout.setEnabled(false);
						
						//On affiche le nombre de jours de location
				    	LB_Temps_Location.setText(String.valueOf(nombre_de_jours) + " Jours");
						
						//Calcul du prix total de la location souhaite
						boolean Particulier = false;
						
						if(RB_Particulier.isSelected())
							Particulier = true;
						
						//On affiche le montant total de la location automatiquement calculer en fonction du type de vehicule
						LB_PrixTTC.setText(String.valueOf(location.Calculer_Prix_Location(Particulier, nombre_de_jours) + " €"));
				    }
				    else
				    {
				    	//Impossible de faire une location de 0 jours, on renvoie un message d'erreur
				    	JOptionPane.showMessageDialog(PAN_Gestion_Location,
							    "Impossible de faire une location de 0 jours !",
							    "Erreur",
							    JOptionPane.ERROR_MESSAGE);
				    }								
				}
				else
				{
					//Certains élement ne sont pas remplie, on renvoie un message d'erreur 
					JOptionPane.showMessageDialog(PAN_Gestion_Location,
						    "Une erreur est survenue, vérifier vos informations !",
						    "Erreur",
						    JOptionPane.ERROR_MESSAGE);
				}					
			}
		});
				
		
		//Ajout final de la location	
		BT_Confirmer_Location.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String client = "";	
				SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy");			
				
				//On ajoute les elements pour crée une location
				location.setDate_debut(DATE_Debut_Location.getDate().toString());				
				location.setDate_fin(DATE_Fin_Location.getDate().toString());
				location.setPrix(Float.parseFloat(LB_PrixTTC.getText().replace("€", "")));
				int index_vehicule = LST_Vehicule.getSelectedIndex();
				int index_client = LST_Client.getSelectedIndex();
				
				//Verification du type de vehicule
				if(RB_Particulier.isSelected())
				{																
					VehiculeParticulier vehicule_particulier = (VehiculeParticulier)lst_vehicule_particulier.toArray()[index_vehicule];
					ClientParticulier client_particulier = (ClientParticulier)lst_client_particulier.toArray()[index_client];
					location.setVehicule(vehicule_particulier);
					location.setClient(client_particulier);
					client = client_particulier.getNom() + " " + client_particulier.getPrenom();
				}					
				else
				{
					VehiculeUtilitaire vehicule_utilitaire = (VehiculeUtilitaire)lst_vehicule_utilitaire.toArray()[index_vehicule];
					ClientProfessionnel client_professionnel = (ClientProfessionnel)lst_client_professionnel.toArray()[index_client];
					location.setVehicule(vehicule_utilitaire);
					location.setClient(client_professionnel);
					client = location.getClient_Professionnel().getEntreprise();
				}
				
				//Creation de ligne du tableau avec les elements de la nouvelle location
					TableauLocationModel.addRow(new Object[] {		
							client,
							location.getVehicule().getNum_serie(),
							location.getVehicule().getMarque() + " " + location.getVehicule().getModele() + " " + location.getVehicule().getAnnee(),
							location.getVehicule().getCouleur(),
							location.getVehicule().getNb_porte(),
							location.getVehicule().getType(),
							formatter.format(DATE_Debut_Location.getDate()),
							formatter.format(DATE_Fin_Location.getDate()),
							location.getPrix() + " €"
					});	
					BT_AffichageAjoutLocation.setVisible(true);
					
					//Message d'ajout de la location
					JOptionPane.showMessageDialog(PAN_Gestion_Location,
						    "La location a bien été ajoutée",
						    "Information",
						    JOptionPane.INFORMATION_MESSAGE);
					
					//On masque les panels d'ajout
					PAN_Ajouter_Location.setVisible(false);
					PAN_Recapitulatif_Location.setVisible(false);
			}
		});
				
		//Annulation de la confirmation de la location
		BT_Annuler_Location.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//On reviens a l'écran d'ajout
				PAN_Recapitulatif_Location.setVisible(false);
				LST_Vehicule.setEnabled(true);
				LST_Client.setEnabled(true);
				DATE_Debut_Location.setEnabled(true);
				DATE_Fin_Location.setEnabled(true);
				BT_Valider_Location.setEnabled(true);
				RB_Particulier.setEnabled(true);
				RB_Utilitaire.setEnabled(true);
				BT_Retour_Ajout.setEnabled(true);
			}
		});
		
		
		return PAN_Gestion_Location;
	}
	
	
	public Date Convertisseur_String_En_Date(String sDate)
	{
		Date date = new Date();
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dateInString = sDate;

        try {
            date = formatter.parse(dateInString);
            System.out.println(date);
            System.out.println(formatter.format(date));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        
		return date;
	}
	
	public LocalDate Convertisseur_Date_En_LocalDate(Date Date) {
	    return Date.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
