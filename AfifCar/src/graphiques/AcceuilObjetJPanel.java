package graphiques;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AcceuilObjetJPanel extends JPanel{
	
	public AcceuilObjetJPanel () {
		   this.setLayout(new GridLayout(7,2,20,20));
		   this.add(new JLabel ("Marque"));
		   this.add(new JComboBox<>());
		   this.add(new JLabel ("Modele"));
		   this.add(new JComboBox<>());
		   this.add(new JLabel ("Couleur"));
		   this.add(new JComboBox<>());
		   this.add(new JLabel ("KM"));
		   this.add(new JTextField());
		   this.add(new JLabel ("Carburant"));
		   this.add(new JComboBox<>());
		   this.add(new JLabel ("Age"));
		   this.add(new JComboBox<>());
		   
		   
		   JPanel fenetre2 = new JPanel();	   
		   this.add(fenetre2);
		   fenetre2.setLayout(new GridLayout(1,2,20,20));
		   fenetre2.add(new Button("ENREGISTRER"));
		   fenetre2.add(new Button("MODIFIER"));

		   JPanel fenetre3 = new JPanel();	   
		   this.add(fenetre3);
		   fenetre3.setLayout(new GridLayout(1,2,20,20));
		   fenetre3.add(new Button("RECHERCHER"));
		   fenetre3.add(new Button("SUPPRIMER"));
		   

	}

}
