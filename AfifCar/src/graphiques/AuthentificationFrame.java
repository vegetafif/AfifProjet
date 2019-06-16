package graphiques;

import javax.swing.JFrame;


public class AuthentificationFrame extends JFrame{
	
	public AuthentificationFrame(){

	   this.setName("Identification");
	   this.setContentPane(new AuthentificationPanel());
	   this.setSize(600, 200);
	   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	   this.setResizable(false);
	   this.setVisible(true);

	}

}
