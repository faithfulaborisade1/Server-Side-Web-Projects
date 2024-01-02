
public class SingletonExample {
	
	private static SingletonExample theSingleInstance = null;
	
	private SingletonExample() {
		System.out.println("Constructor for singleton has been called");
	}
	
	public static SingletonExample getInstance() {
		
		if(theSingleInstance == null) {
			
			System.out.println("The Singleton does not exits so it will be called");
			theSingleInstance = new SingletonExample();
			return theSingleInstance;
		}else {
			System.out.println("The Singleton does already exit");
			return theSingleInstance;
		}
	}

}
