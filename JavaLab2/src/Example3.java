import java.text.*;
import java.util.*; //1. import library for input data form keyboard(console)
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		//2. define object for Scanner class
		Scanner console = new Scanner(System.in);
		
		//3. Display text and input data
		System.out.print("Input product name   : ");
		String productName = console.nextLine();
		System.out.print("Input product unit   : ");
		int productUnit = console.nextInt();
		System.out.print("input price per unit : ");
		float productPrice = console.nextFloat();
		System.out.println("");
		
		float totalPrice = productUnit*productPrice;
		float serviceCharge = totalPrice+(totalPrice*7/100);
		System.out.println("Total Price is "+frm.format(totalPrice)+" baht.");
		System.out.println("Add VAT 7%  is "+frm.format(serviceCharge)+" baht.");
		
	}

}
