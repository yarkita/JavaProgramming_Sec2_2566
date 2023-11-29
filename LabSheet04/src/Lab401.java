import java.util.Scanner;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y,z;
		
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		
		while(y<=x) {
			System.out.print("Input value of Y, again : ");
			y = scan.nextInt();
		}
		
		z = x;
		System.out.println("");
		
		while(x<y) {
			int sum = z+x+1;
			System.out.println(""+z+" +"+" "+(x+1)+" = "+""+sum);
			z = sum;
			x++;
		}
			
	}

}
