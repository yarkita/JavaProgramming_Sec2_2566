import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.print("Title : ");
		String title = scan.nextLine();
		
		System.out.print("Year : ");
		int publishYear = scan.nextInt();
		scan.nextLine();
		FictionBook book = new FictionBook(title,publishYear);

		do {
			System.out.print("Name : ");
			String authorName = scan.nextLine();
			book.setAuthorName(authorName);
		}while(!book.checkFormatName());
		
		do {
			System.out.print("Email : ");
			String email = scan.nextLine();
			book.setEmail(email);
		}while(!book.checkEmail());
		
		System.out.println(book);
	}

}
