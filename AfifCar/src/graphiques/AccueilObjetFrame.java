package graphiques;

import javax.swing.JFrame;

public class AccueilObjetFrame extends JFrame{
	
	public static void main (String[] args) {

		   JFrame fenetre = new JFrame("Gestion Voiture");
		   fenetre.setContentPane(new AcceuilObjetJPanel());
		   fenetre.setSize(500, 300);
		   fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		   fenetre.setResizable(false);
		   fenetre.setVisible(true);



}
}