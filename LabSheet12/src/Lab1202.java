import java.util.*;
import java.io.*;
public class Lab1202 {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		boolean count = false;
		System.out.print("Input Email: ");
		String inputEmail = input.next();
		while(readFile.hasNext()) {
			readFile.next();
			readFile.next();
			String password = readFile.next();
			String email = readFile.next();
			if(email.equalsIgnoreCase(inputEmail)) {
				System.out.println("Your password is "+password);
				count = true;
				break;
			}
			
		}
		if(count == false) {
				System.out.println("The data not found");
			
		}
		readFile.close();
	}
}
