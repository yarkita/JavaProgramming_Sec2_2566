import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String FullName = scan.nextLine();
		
		String FirstName = "",LastName = "";
		
		int space =FullName.indexOf(' ');
		
		if(space == -1) {
			System.out.println("Incorrect Name");
		} else {
			FirstName = FullName.substring(0,space);
			LastName = FullName.substring(space);
			System.out.println("First Name: "+FirstName.toUpperCase());
			System.out.println("Last Name: "+LastName.toLowerCase());
		}
	}

}
