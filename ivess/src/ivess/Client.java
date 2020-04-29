package ivess;

public class Client {
	private String nom;
	private String postnom;
	private String prenom;
	private int age;
	private int numCompte;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String nom, String postnom, String prenom, int age, int numCompte) {
		super();
		this.nom = nom;
		this.postnom = postnom;
		this.prenom = prenom;
		this.age = age;
		this.numCompte = numCompte;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPostnom() {
		return postnom;
	}
	public void setPostnom(String postnom) {
		this.postnom = postnom;
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
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

}
