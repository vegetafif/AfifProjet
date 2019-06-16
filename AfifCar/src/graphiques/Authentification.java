package graphiques;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Authentification extends JFrame{
	
   public static void main (String[] args) {
	   
	   JFrame fenetre = new JFrame("Identification");
	   fenetre.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
	   
	   fenetre.add(new JLabel ("pseudonyme"));
	   fenetre.add(new TextField (10));
	   fenetre.add(new JLabel ("mot de passe"));
	   fenetre.add(new JPasswordField (10));
	   fenetre.add(new Button ("connexion"));
	   
	   fenetre.pack();
	   
	   fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   fenetre.setVisible(true);
	   
	   

   }

}
