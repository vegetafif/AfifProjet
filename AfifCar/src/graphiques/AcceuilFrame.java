package graphiques;

import javax.swing.JFrame;

public class AcceuilFrame extends JFrame{
	
	public AcceuilFrame(){
		
		   this.setName("Gestion de Voitures");
		   this.setContentPane(new AcceuilPanel());
		   this.setSize(500, 300);
		   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		   this.setResizable(false);
		   this.setVisible(true);

	}
}