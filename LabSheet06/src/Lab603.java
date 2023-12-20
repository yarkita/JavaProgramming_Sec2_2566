import java.util.Scanner;
public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		String fullname = scan.nextLine();
		int space = fullname.indexOf(' ');
		String firstName = fullname.substring(0,space);
		
		System.out.print(abbreviatName(fullname).toUpperCase()+firstName);
	}//end of main()
	
	public static String abbreviatName(String fullname) {
		String lastName="";
		
		for(int i=0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				lastName += fullname.charAt(i+1)+".";
			}
		}
		return lastName;
  }
}


