package tests;

public class personne {
	
	String nom;
	int age;
	
	public personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "personne [nom=" + nom + ", age=" + age + "]";
	}
	
	

}
