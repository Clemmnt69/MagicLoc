package client.fenetre;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.ImageIcon;

public class FenetrePrincipale extends JFrame implements ActionListener {
	
	//D�claration des 3 boutons de l'�cran principal
	JButton boutonClient = new JButton("");
	JButton boutonVehicule = new JButton("");
	JButton boutonLitige = new JButton("");
	private final JPanel panel = new JPanel();
	private final JLabel lblNewLabel = new JLabel("MagicLoc'");
	private final JLabel lblNewLabel_1 = new JLabel("Gestion des clients");
	private final JLabel lblNewLabel_1_1 = new JLabel("Gestion des locations");
	private final JLabel lblNewLabel_1_2 = new JLabel("Gestion des litiges");
	
	
	public FenetrePrincipale() {
		setResizable(false);
		//Titre de la fen�tre
		setTitle("MagicLoc");
		//Taille de la fen�tre
		setSize(987,377);
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
		JPanel pane = new JPanel();
		pane.setBackground(Color.WHITE);
		boutonClient.setIcon(new ImageIcon("C:\\Users\\cleme\\Downloads\\user (2).png"));
		boutonClient.setSelectedIcon(null);
		boutonClient.setBounds(179, 145, 123, 123);
		boutonClient.addActionListener(this);
		boutonVehicule.setIcon(new ImageIcon("C:\\Users\\cleme\\Downloads\\archives.png"));
		boutonVehicule.setBounds(428, 145, 123, 123);
		boutonVehicule.addActionListener(this);
		pane.setLayout(null);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(179, 279, 146, 28);
		
		pane.add(lblNewLabel_1);
		pane.add(boutonClient);
		pane.add(boutonVehicule);
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(0, 0, 984, 85);
		
		pane.add(panel);
		panel.setLayout(null);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(10, 11, 330, 65);
		
		panel.add(lblNewLabel);
		boutonLitige.setIcon(new ImageIcon("C:\\Users\\cleme\\Downloads\\auction (1).png"));
		boutonLitige.setBounds(691, 145, 123, 123);
		pane.add(boutonLitige);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(427, 279, 192, 28);
		
		pane.add(lblNewLabel_1_1);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(682, 280, 146, 26);
		
		pane.add(lblNewLabel_1_2);
		boutonLitige.addActionListener(this);

		return pane;
	}
		@Override
	public void actionPerformed(ActionEvent e) {
			
		//Gestion des �v�nements en fonction du bouton appuy�
		if(e.getSource().equals(boutonClient)) 
		{
			FenetreClient client = new FenetreClient();
		}
		else if (e.getSource().equals(boutonVehicule)) 
		{
			FenetreVehicule vehicule = new FenetreVehicule();
		}
		else
		{
			FenetreLitige litige = new FenetreLitige();
		}
		
	}
}
