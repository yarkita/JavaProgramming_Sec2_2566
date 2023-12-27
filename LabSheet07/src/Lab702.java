import java.util.Scanner;
public class Lab702 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] score = new double[5];
		double Ave =0;
		
		for(int i = 0 ; i<score.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			score[i] = scan.nextDouble();
			Ave += score[i];
		}
		
		Ave = Ave/score.length;
		
		System.out.println();
		System.out.println("Average of "+score.length+" is "+String.format("%.2f",Ave));
		
		int i = 0;
		
		for(double _score:score) {
			if(_score>Ave) {
				System.out.println("> Student "+(i+1)+" ("+String.format("%.2f",_score)+")");
			}
		}
		
	}

}
