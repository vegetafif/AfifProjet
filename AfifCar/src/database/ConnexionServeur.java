package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.Statement;


public class ConnexionServeur {
    
     public static Connection OuvrirConnexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.err.println("Oops: ClassNotFound" + ex.getMessage());
            ex.printStackTrace();
        }

        Connection connexion = null;
        try {
                     
           String protocole =  "jdbc:mysql:" ;         
           String ip =  "54.149.200.243" ;  
           String port =  "3306" ;  
           String nomBase =  "Awp_Averroes" ;  
           String conString = protocole +  "//" + ip +  ":" + port +  "/" + nomBase ;
           String nomConnexion =  "zied" ;  
           String motDePasse =  "09600961" ; 
       
           connexion = DriverManager.getConnection(
                   conString, nomConnexion, motDePasse) ;
           
           System.out.println("c est bon");
            
        } catch (SQLException ex) {
            System.err.println("Oops : connection :" + ex.getMessage());
        }
        return connexion;
    }

    public static void FermerConnexion(Connection connexion) {
        try {
            connexion.close();
        } catch (SQLException ex) {
            System.err.println("Oops : close :" + ex.getMessage());
        }
       
    }
    
    public static String getTable(Connection con){
    	   	
    	String requeteSQL =  "select * from voiture" ;
    	try {
    	
        Statement smt = con.createStatement();
        
        ResultSet rs = smt.executeQuery(requeteSQL) ;
        
        while (rs.next()) {
          System.out.println(rs.getString("modele")) ;
       }
        
        
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
       
         
         return "";
    	
    }
    
    
    public static void main(String args[]){
    	Connection connexion = OuvrirConnexion();
    	
    	getTable(connexion);
    	
    	FermerConnexion(connexion);

    }
      
   
}