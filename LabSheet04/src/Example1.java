import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		//create object for input data from a console(keyboard)
		Scanner scan = new Scanner(System.in);
		int currentNumber,previousNumber;
		
		System.out.print("Input number : ");
		previousNumber = scan.nextInt();
		
		while(true) {
			System.out.print("Input number : ");
			currentNumber = scan.nextInt();
			if(currentNumber<previousNumber){
				break;
			}
			previousNumber = currentNumber;
		}
		
		
		//if currentNumber is greater than previousNumber, print BYE BYE 
		if(currentNumber<previousNumber) {
			System.out.println("");
			System.out.print("BYE BYE");
		}

	}

}
