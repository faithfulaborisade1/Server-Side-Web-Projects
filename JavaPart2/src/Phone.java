import java.io.Serializable;

public class Phone implements Serializable {
	 private String make;
	    private String model;
	    private int memory;
	    private double camera;
	    private double screenSize;
	    private String isSmart;
	    private int price;
	    

	    public Phone(String make, String model, int memory, double camera, double screenSize, String isSmart, int price) {
	        this.make = make;
	        this.model = model;
	        this.memory = memory;
	        this.camera = camera;
	        this.screenSize = screenSize;
	        this.isSmart = isSmart;
	        this.price = price;
	    }
	    
		public String getMake() {
			return this.make;
		}
		public void setMake(String make) {
			this.make = make;
		}
		public String getModel() {
			return this.model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getMemory() {
			return this.memory;
		}
		public void setMemory(int memory) {
			this.memory = memory;
		}
		public double getCamera() {
			return this.camera;
		}
		public void setCamera(double camera) {
			this.camera = camera;
		}
		public double getScreenSize() {
			return this.screenSize;
		}
		public void setScreenSize(double screenSize) {
			this.screenSize = screenSize;
		}
		public String isSmart() {
			return this.isSmart;
		}
		public void setSmart(String isSmart) {
			this.isSmart = isSmart;
		}
		public int getPrice() {
			return this.price;
		}
		public void setPrice(int price) {
			this.price = price;
		}

	    @Override
	    public String toString() {
	    	
	    	return  "make='" + make + '\'' +
	                ", model='" + model + '\'' +
	                ", memory=" + memory +
	                ", camera=" + camera +
	                ", screenSize=" + screenSize +
	                ", isSmart=" + isSmart +
	                ", price=" + price;
	    
//	        return "Make: " + make + "\nModel: " + model + "\nMemory (GB): " + memory + "\nCamera (MP): " +
//	            camera + "\nScreen Size (Inches): " + screenSize + "\nSmart: " + (isSmart != null ? "Yes" : "No") +
//	            "\nPrice (€): " + price + "\n";
	    }

	   






}
