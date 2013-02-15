
public class Librarian extends Person {
	private double empFrac;
	//employment fraction, eg .67
	private String position;
	
	public Librarian (String name, Cprno cpr, String address, double time, String job) {
		super (name, cpr, address);
		this.empFrac = time;
		this.position = job;
	}
	
	public boolean isFullTime() {
		if (this.empFrac >= 32)
			return true;
		else return false; 
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public String toString() {
		String s = String.format("%12s %40s : %5s %20s", this.getCprno(), this.getName(), this.getPosition(), this.isFullTime());
		return s;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cprno c = new Cprno(2511450007L);
		Person l1 = new Librarian("Niels Muller Larsen", c, "Sønderhøj 30", 1.2, "IT Specialist");
		System.out.println(l1);
	}

}
