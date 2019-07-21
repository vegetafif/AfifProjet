package revision;

public class Voiture {

    String marque ;
    String modele ;
    String couleur;
    double km;
    //String varburant;
    //int age;
    
    
    public  Voiture (String marque, String modele,String couleur, double km){
        
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
        this.km = km;
    }


    public String getModele() {
        return modele;
    }


    public void setModele(String modele) {
        this.modele = modele;
    }
    
    @Override
    public String toString() {
        return "Voiture [marque=" + marque + ", modele=" + modele + ", couleur=" + couleur + ", km=" + km + "]";
    }





    
    
    
    
    
}