package revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import voitures.voiture;

public class Launch {

    public static void main(String args []) {
        
        // geteer and setter
//			        String nom = "Ali";
//			        String prenom ="Samir";
//			        int age = 20;
//			        
//			        personneVoiture pers = new personneVoiture(nom,prenom,age);
//			        System.out.println(pers);
//			        
//			        prenom ="afif";
//			        pers.setPrenom(prenom);        
//			        pers.setNom("ben othmane");
//			        
//			        System.out.println(pers.getNom());
 
    	
        // heritage       
//			        fils fff = new fils();													        
//					fff.vendreVoiturePere();
		
        // Listes
		
//			    	ArrayList<String> liste = new ArrayList<>(); //obliger de prendre un type lors de la declaration
//			        liste.add("Peugeot");
//			        liste.add("Renault");
//			        liste.add("BMW");
//			        
//			        System.out.println(liste);
//			        liste.remove(0);
//			        System.out.println(liste);
//        
//        
//			        HashMap dic=new HashMap();        		//c'est une liste de dictionnaire
//			        dic.put("Peugeot","106");
//			        dic.put("nissan","quashkai");
//			        dic.put("nissan","quas");
//			        System.out.println(dic);
//			        
//			        
//			        Hashtable dic1=new Hashtable();        // dictionnaire, un seul objet <k,V>
//			        dic1.put("Peugeot","106");        
//			        dic1.put("Peugeot","308"); 
//			        dic1.put("Peugeot","30000008"); 
//			        System.out.println(dic1);
//        
//			        
//    				//vector    	
//			    	Vector vect = new Vector<>();  			//il prend n'importe quel type    	
//			    	vect.add("Peugeot");
//			    	vect.add("Renault");
//			    	vect.add(9);
//			    	
//			        System.out.println(vect);
//			        vect.remove(0);
//			        System.out.println(vect);
    	
    	
			        //vecteur de dictionnaire
//			        Vector vect1 = new Vector<>();		        
//			        Hashtable dic_test=new Hashtable();        
//			        dic_test.put("Peugeot","106"); //<k,v>			        
//			        vect1.add(dic_test);
//			        System.out.println(vect1);
			        
    				// iteration sur une liste de dictionnaire
//			        for(Object var : dic.values()) {
//			        	System.out.println(var);
//			        }
    	
    				//vecteur d'objets
//			    	Vector<Object> vect = new Vector<>(); 		    	
//			    	voiture voit = new voiture("Renault", "clio", "Rouge", 140, "essence", 5);			    	
//			    	vect.add(voit);
//			    	System.out.println(voit);
			    	
			    	//dictionnaire <string,objet>
//			    	HashMap<String, voiture> listDict =new HashMap<String, voiture>();
//			    	listDict.put("dw-109-sc",voit);
//			    	System.out.println(listDict.keySet());
//			    	System.out.println(listDict.values());
    	
    				//constructeur vide
//    				voiture voitVide = new voiture();
//			    	voitVide.setAge(5);			    	
//			    	System.out.println(voitVide.getAge());
			    	
    }
    
}