package ivess;

public class Compte {
	private int epargne;
	private int courant;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(int epargne, int courant, String date) {
		super();
		this.epargne = epargne;
		this.courant = courant;
		
	}
	public int getEpargne() {
		return epargne;
	}
	public void setEpargne(int epargne) {
		this.epargne = epargne;
	}
	public int getCourant() {
		return courant;
	}
	public void setCourant(int courant) {
		this.courant = courant;
	}
	
	
}
