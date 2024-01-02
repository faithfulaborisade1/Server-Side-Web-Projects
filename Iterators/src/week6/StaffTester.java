package week6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class StaffTester  {
	


	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		Staff s1 = new Staff(1234,"John Kelly","Dublin",5000);
		Staff s2 = new Staff(1235,"Mary Kelly","Dublin",2000);
		
		//serlization
		try {
			
			FileOutputStream fileOut = new FileOutputStream("staff.ser");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(s1);
			objectOut.close();
			fileOut.close();
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		//deserilizarion
		try {
			
			FileInputStream fileIn = new FileInputStream("staff.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Staff s0 = (Staff) objectIn.readObject();
			objectIn.close();
			fileIn.close();
			System.out.println(s0.getStaffName());
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
