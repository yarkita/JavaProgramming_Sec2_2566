import java.util.*;
import java.io.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating of books : ");
		double inputRating = input.nextDouble();
		int numBook = 1, countBook = 0;
		System.out.println("------------------------------------------------------------------------");
		
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		while((tmp = readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			
			String titleBook = data[0];
			String nameAuthor = data[1];
			double rating = Double.parseDouble(data[2]);
			int peopleRating = Integer.parseInt(data[3]);
			
			if(rating >= inputRating) {
				System.out.println("Book"+" "+numBook+" : "+titleBook+" write by "+nameAuthor+" ("+peopleRating+") reviews");
				countBook++;
			}
			numBook++;
		}
		readFile.close();
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("There are "+countBook+" book get rating more than "+inputRating);
		
	}

}
