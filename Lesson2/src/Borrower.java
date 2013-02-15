
public class Borrower extends Person {
	private String[] interests = new String[3];
	private boolean newsletter;
	private String email;

	public Borrower (String name, Cprno cpr, String address, boolean newsletter, String email) {
		super (name, cpr, address);
		this.newsletter = newsletter;
		this.email = email; 
	}
	

	public void addInterest(String a, String b, String c){
		this.interests[0] = a;
		this.interests[1] = b;
		this.interests[2] = c;
	}
	
	private boolean hasInterest() {
		if (this.interests.length > 1 && this.interests[0] != null && this.interests[1] != null && this.interests[2] != null)
		{
			return true;
		}
		return false;
	}
	
	public String showInterests() {
		String s = this.interests[0] + " ";
		s += this.interests[1] + " ";
		s += this.interests[2] + " ";
		
		return s;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public boolean wantsNewsletter() {
		if (this.newsletter == true)
			return true;
		else return false;
	}
	
	public String toString(){
		String s = String.format("%12s %25s - %3s, %5s", this.getCprno(), this.getName(), this.wantsNewsletter(), this.getEmail(), this.showInterests());
		return s;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cprno c = new Cprno(2511450007L);
		
		Borrower b1 = new Borrower("Niels Muller Larsen", c, "Sønderhøj 30", true, "test@test.test");
		b1.addInterest("Romance", "Horror", "Action");
		System.out.println(b1);
		//System.out.println(b1.hasInterest());

	}

}
