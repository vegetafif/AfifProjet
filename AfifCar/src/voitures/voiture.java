package voitures;

public class voiture {
    
	String modele ;
	String marque ;
	String couleur;
	double km;
	String carburant;
	int age;
	
	public voiture(){
		super();
	}
	
	public voiture(String modele, String marque){
		super();
		this.modele = modele;
	}
	
	public voiture(String modele, String marque, String couleur, double km, String carburant, int age) {
		super();
		this.modele = modele;
		this.marque = marque;
		this.couleur = couleur;
		this.km = km;
		this.carburant = carburant;
		this.age = age;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "voiture [modele=" + modele + ", marque=" + marque + ", couleur=" + couleur + ", km=" + km
				+ ", carburant=" + carburant + ", age=" + age + "]";
	}

	
	
}
