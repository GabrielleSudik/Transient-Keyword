import java.io.Serializable;

//some of this code is from last lesson:
//Serializing Arrays.
//you removed those comments and will change whatever for this lesson

//transient keyword is used when serializing objects
//you don't always want to serialize every field.
//that's when you use transient keyword.

public class Person implements Serializable{
	//you used the warning sign to generate the constant:
	private static final long serialVersionUID = 4801633306273802062L;
	
	//you added transient here:
	//run Write then Read and you'll see the id is 0
	//0 is the default value
	private transient int id;
	private String name;
	
	public Person(){
		System.out.println("This is the default constructor with no parameters.");
	}
	
	//here's another example
	//this field isn't specific to each Person
	//it applies to the class (ie, counts total Persons)
	//static fields are always not-serialized
	//so when this prints to screen, you'll get 0 cuz it's the default value
	private static int count;
	
	public Person(int id, String name){
		this.id = id;
		this.name = name;
		
		System.out.println("Two-argument constructor.");
	}
	
	public static int getCount(){
		return count;
	}
	
	public static void setCount(int count){
		Person.count = count;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
		
	}
		
}
