package week6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StaffTester2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 //deserilization
		try {
			
			FileInputStream fileIn = new FileInputStream("staff2.ser");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Staff s0 = (Staff) objectIn.readObject();
			objectIn.close();
			fileIn.close();
			System.out.println(s0.getStaffName());
			
		}catch(Exception e) {
			
			Staff s1 = new Staff(1234,"Henry Kelly","Dublin",5000);
			Staff s2 = new Staff(1235,"Jonny Kelly","Dublin",2000);
			Staff s3 = new Staff(12359,"Darry Kelly","Dublin",8000);
			
			FileOutputStream fileOut;
			try {
				fileOut = new FileOutputStream("staff2.ser");
				ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
				objectOut.writeObject(s1);
				objectOut.writeObject(s2);
				objectOut.writeObject(s3);
				objectOut.close();
				fileOut.close();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}

	}

}
