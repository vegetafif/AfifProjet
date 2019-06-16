package graphiques;

import javax.swing.JFrame;


public class Authentification extends JFrame{
	
   public static void main (String[] args) {
	         
	   JFrame fenetre = new JFrame("Identification");
	   
	   fenetre.setContentPane(new AuthentificationLayout());
	   fenetre.setTitle("Grid Layout");
	   fenetre.setSize(600, 200);
	   fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	   fenetre.setResizable(false);
	   fenetre.setVisible(true);
        

   }

}
