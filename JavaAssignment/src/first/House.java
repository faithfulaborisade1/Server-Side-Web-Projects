package first;

public class House {
	
	private String owner;
	private int noBeds;
	private int noBath;
	
	
	public House() {
		this.owner = null;
		this.noBeds = 0;
		this.noBath = 0;
		
		
	}
	
	public House(String owner, int noBeds,int noBath) {
		this.owner = owner;
		this.noBeds = noBeds;
		this.noBath = noBath;
		
		
	}

	

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getNoBeds() {
		return this.noBeds;
	}

	public void setNoBeds(int noBeds) {
		this.noBeds = noBeds;
	}

	public int getNoBath() {
		return this.noBath;
	}

	public void setNoBath(int noBath) {
		this.noBath = noBath;
	}
	
	public void printDetails() {
		System.out.println("Owners: "+owner +" Number of Bedrooms: "+noBeds+" Number of Bathrooms: "+noBath);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House h2 = new House("Smith",5,1);
		House h3 = new House("Jones",3,1);
		House h1 = new House();
		
		h1.setOwner("Bruke");
		h1.setNoBeds(4);
		h1.setNoBath(2);
		
		h3.printDetails();
		h2.printDetails();
		h1.printDetails();
		
		
	}

}
