package client.fenetre;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FenetreClient extends JFrame implements ActionListener {
	
	public FenetreClient() {
		//Titre de la fen�tre
		setTitle("MagicLoc - Gestion des clients");
		//Taille de la fen�tre
		setSize(1000,300);
		//Permet de centrer la fen�tre
		setLocationRelativeTo(null);
		//Permet de fermer l'application avec la croix
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Initialisation de JPanel
		setContentPane(buildContentPane());
		//On affiche la fen�tre
		setVisible(true);
		
	}
	
	//Cr�ation de la fen�tre
	private JPanel buildContentPane() {	
		//Cr�ation du panel
		JPanel pane = new JPanel(new GridLayout(1, 1));
		
		return pane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
