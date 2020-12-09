package client.fenetre;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreClient extends JFrame implements ActionListener {
	
	public FenetreClient() {
		//Titre de la fenêtre
		setTitle("MagicLoc - Gestion des clients");
		//Taille de la fenêtre
		setSize(1000,300);
		//Permet de centrer la fenêtre
		setLocationRelativeTo(null);
		//Permet de fermer l'application avec la croix
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Initialisation de JPanel
		setContentPane(buildContentPane());
		//On affiche la fenêtre
		setVisible(true);
		
	}
	
	//Création de la fenêtre
	private JPanel buildContentPane() {	
		//Création du panel
		JPanel pane = new JPanel(new GridLayout(1, 1));
		
		return pane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
