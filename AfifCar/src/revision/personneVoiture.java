package revision;

public class personneVoiture {
    
    String nom;
    String prenom;
    int age;
    
    public personneVoiture(String nom,String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age ;
    }
    
  public String getNom() {
      return nom;
  }
  
  public void setNom(String nom) {
      this.nom = nom;
  }
  
  public String getPrenom() {
      return prenom;
  }
  
  public void setPrenom(String prenom) {
      this.prenom = prenom;
  }
  
  public int getAge() {
      return age;
  }
  
  public void setAge(int age) {
      this.age = age;
  }

    @Override
    public String toString() {
        return "personneVoiture [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
    }


    

}