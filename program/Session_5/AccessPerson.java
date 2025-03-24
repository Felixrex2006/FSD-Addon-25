package Session_5;

public class AccessPerson {

	public static void main(String[] args) {
		//original Person Object
		Person originalPerson = new Person("Felix", 19);
		
		//Copied Person Object
		Person copiedPerson = new Person(originalPerson);
	
		System.out.println("Original Person: ");
		originalPerson.displayInfo();
		
		System.out.println("Copied Person: ");
		copiedPerson.displayInfo();
	}
}
