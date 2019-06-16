package graphiques;

import java.awt.Button;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Accueil extends JFrame{
	
   public Accueil () {
	   
	   
	   JPanel fenetre = new JPanel();
	   this.setTitle("Gestion Voiture");
	   this.setSize(500,300);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   fenetre.setLayout(new GridLayout(7,2,20,20));
	   
	  // fenetre.add(new JPanel ());
	   
	   fenetre.add(new JLabel ("Marque"));
	   fenetre.add(new JComboBox<>());
	   fenetre.add(new JLabel ("Modele"));
	   fenetre.add(new JComboBox<>());
	   fenetre.add(new JLabel ("Couleur"));
	   fenetre.add(new JComboBox<>());
	   fenetre.add(new JLabel ("KM"));
	   fenetre.add(new JTextField());
	   fenetre.add(new JLabel ("Carburant"));
	   fenetre.add(new JComboBox<>());
	   fenetre.add(new JLabel ("Age"));
	   fenetre.add(new JComboBox<>());
	   
	   
	   JPanel fenetre2 = new JPanel();	   
	   fenetre.add(fenetre2);
	   fenetre2.setLayout(new GridLayout(1,2,20,20));
	   fenetre2.add(new Button("ENREGISTRER"));
	   fenetre2.add(new Button("MODIFIER"));

	   JPanel fenetre3 = new JPanel();	   
	   fenetre.add(fenetre3);
	   fenetre3.setLayout(new GridLayout(1,2,20,20));
	   fenetre3.add(new Button("RECHERCHER"));
	   fenetre3.add(new Button("SUPPRIMER"));
	   

   
	   
	   
	   this.setContentPane(fenetre);
	   this.setVisible(true);
        
}
}