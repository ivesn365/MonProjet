package ivess;

public class Operation {
	private int depot;
	private int retrait;
	private String date;
	private int numCompte;
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Operation(int depot, int retrait, String date, int numCompte) {
		super();
		this.depot = depot;
		this.retrait = retrait;
		this.date = date;
		this.numCompte = numCompte;
	}
	public int getDepot() {
		return depot;
	}
	public void setDepot(int depot) {
		this.depot = depot;
	}
	public int getRetrait() {
		return retrait;
	}
	public void setRetrait(int retrait) {
		this.retrait = retrait;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}
	
	
}
