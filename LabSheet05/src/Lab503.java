import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = scan.nextLine();
		String Messagelower = Message.toLowerCase();
		
		if(Messagelower.indexOf("nichi")>=0) {
			System.out.println("Nichi is a sentence");
		} else {
			System.out.println(Message);
		}
	}

}
