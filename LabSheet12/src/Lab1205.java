import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException{
		Head();
		int i = 1;
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		while(readFile.hasNext()) {
			String ID = readFile.next();
			readFile.next();
			String fname = readFile.next().substring(0,1).toUpperCase();
			String lname = readFile.next();
			double Grade = readFile.nextDouble();
			int Level = readFile.nextInt();
			System.out.println(i+".\t"+ID+"\t"+Level(ID)+"\t"+fname+"."+lname+"\t"+Grade+"\t"+Status(Grade));
			i++;
			
		}
		readFile.close();

	}
	
	public static String Level(String id) {
		int yearLevel = 22 - Integer.parseInt(id.substring(0,2));
		return yearLevel+"th";
	}
	
	public static String Status(double grade) {
		if(grade>2.00) return "Pass";
		else if(grade>=1.00 && grade<=2.00) return "Critical";
		else return "Retired";
	}

	public static void Head() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("****************************************************************");
	}
}
