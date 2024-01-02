package week5;

import java.util.ArrayList;
import java.util.List;

public enum UserDAO {
	
	instance;
	List<User> users;
	
	private UserDAO() {
		
		users = new ArrayList<User>();
		
		User u1 = new User("Mary","galway");
		User u2 = new User("John","Longford");
		User u3 = new User("Ivan","athlone");
	}
	
	public List<User> list(){
		
		return this.users;
	}

}
