import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

	public static void main(String[] args) {
		System.out.println("Writing objects...");
		
		try (FileOutputStream fs = new FileOutputStream("test.ser"))
		{
			ObjectOutputStream os = new ObjectOutputStream(fs);

			Person person1 = new Person(7, "Bob");
			Person.setCount(66);
			//we set setCount to 66 here
			//but it will still read as 0
			//because the count field in Person is static
			//and by definition, is transient (not serialized)
			os.writeObject(person1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//remember to run the Write file, then the Read file