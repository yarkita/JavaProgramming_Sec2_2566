import java.util.Scanner;
public class Lab701 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[7];
		int oddNumCount = 0;
		
		for(int i = 0 ; i<num.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			num[i] = scan.nextInt();
			if(num[i]%2!=0) {
				oddNumCount++;
			}
		}

		System.out.println();
		System.out.println("There are "+oddNumCount+" of odd number.");
		System.out.print("List of odd number : ");
		for(int _num:num) {
			if(_num%2!=0) {
				System.out.print(_num+" ");
			}
		}
		
	}//end of main()
}
