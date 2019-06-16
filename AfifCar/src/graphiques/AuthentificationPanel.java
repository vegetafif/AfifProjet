package graphiques;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class AuthentificationPanel extends JPanel{

	AuthentificationPanel(){	
		this.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));		   
		this.add(new JLabel ("pseudonyme"));
		this.add(new TextField (10));
		this.add(new JLabel ("mot de passe"));
		this.add(new JPasswordField (10));
		this.add(new Button ("connexion"));	
		
	}
	
	
}
