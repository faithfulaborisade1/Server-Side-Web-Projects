import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PhoneTester {

    public static void main(String[] args) {
        Phone sonyXperiaX = new Phone("Sony", "Experia X", 32, 12.5, 4.6, "Yes", 150);
        Phone sonyExperiaZ = new Phone("Sony", "Experia Z", 64, 14.2, 5.6, "Yes", 175);
        Phone samsungGal = new Phone("Samsung", "Galaxy M", 64, 14.5, 5.4, "Yes", 180);
        Phone nokia3330 = new Phone("Nokia", "3330", 16, 13.2, 2.3, "No", 90);
        Phone motorolaM1 = new Phone("Motorola", "M1", 8, 11.3, 4.9, "Yes", 100);
        Phone iPhone6 = new Phone("IPhone", "6", 32, 13.5, 6.4, "Yes", 250);
        
        // Remove Alcatel object
        Phone[] phones = {sonyXperiaX, sonyExperiaZ, samsungGal, nokia3330, motorolaM1, iPhone6};
        
        // Create a new phone and add it to the list
        Phone newPhone = new Phone("NewBrand", "NewModel", 16, 10.0, 5.0, "Yes", 200);
        
        // Add the new phone to the array
        Phone[] updatedPhones = new Phone[phones.length + 1];
        System.arraycopy(phones, 0, updatedPhones, 0, phones.length);
        updatedPhones[phones.length] = newPhone;
        
        // Serialization
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("phone.ser"));
            outputStream.writeObject(updatedPhones);
            outputStream.close();
            System.out.println("Objects serialized and saved to phone.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Deserialization
        Phone[] deserializedPhones = null;

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("phone.ser"));
            deserializedPhones = (Phone[]) inputStream.readObject();
            inputStream.close();
            System.out.println("Objects deserialized from phone.ser");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (deserializedPhones != null) {
            for (Phone phone : deserializedPhones) {
                System.out.println(phone);
            }
        }
    }
}
