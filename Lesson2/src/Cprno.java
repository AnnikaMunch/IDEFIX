
public class Cprno {
	private long cprno;

	/**
	 * Constructor
	 * to be used once per object, at creation
	 * Cprno MyCpr = new Cprno(2511450007L);
	 * 
	 * The constructor name must be identical to the.
	 * class name.
	 * It has no type.
	 * A class may have several constructors.
	 * The constructors must have different signatures.
	 */
	public Cprno(Long cprInd) {
		cprno = cprInd;
	}
	
	/**
	 * Accessor method
	 * @param void
	 * @return cprno, value of property
	 */
	public long getCprno() {
		return this.cprno;
	}
	
	/**
	 * toString overides the Java toString inherited from
	 * the mother of all classes Object
	 * @param void 
	 * @return aString, representing the object
	 */
	public String toString() {
		String aString = String.format("%06d-%04d", this.cprno / 10000, this.cprno % 10000);
		if (!this.checkCprno())
			aString += ", invalid";
		return aString;
	}
	
	/**
	 * Method for performing med 11 check of cprno
	 * @param none
	 * @return boolean
	 */
	public boolean checkCprno(){
		long sum;
		long restcpr = this.cprno;
		sum = 0L;
		
		sum += (restcpr % 10) * 1;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 2;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 3;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 4;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 5;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 6;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 7;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 2;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 3;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 4;
		restcpr = restcpr / 10;
		if (sum % 11 == 0 && sum != 0)
			return true;
		else
			return false;
	}
	
	/**
	 * @param args (unused)
	 */
		public static void main(String[] args) {
			Cprno c0 = new Cprno(2511450007L);
			System.out.println(c0);
			Cprno c1 = new Cprno(702900020L);
			System.out.println(c1);
			c1 = new Cprno(411940020L);
			System.out.println(c1);
	}

}
