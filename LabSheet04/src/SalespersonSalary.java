import java.text.DecimalFormat;
import java.util.*;
import java.text.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;

		int sales; 
		double salary;
		
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = scan.nextInt();
			if(sales == SENTINEL)
			{
				System.out.println("bye");
				break;
			}
			
			salary = 1000+(sales*COMMISSION_RATE) ;
			System.out.print("Salary is: "+frm.format(salary));
			System.out.println("");
		 }

	}

}
