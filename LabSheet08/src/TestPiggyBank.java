import java.util.*;
public class TestPiggyBank {
		static PiggyBank pb = new PiggyBank();
		static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addTwo(34);
		System.out.println("Add 2 Baht Money : "+34);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addTen(13);
		System.out.println("Add 10 Baht Money : "+13);
		System.out.println("Money Total : "+pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
		
	}
	
	public static void inputCoin() {
		System.out.println("Money Total : " +pb.getTotal());
		System.out.print("Please define size of PiggyBank : ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("Size of your PiggyBank : "+pb.getPiggyBank());
		System.out.println();
		MainMenu();
	}
	
	public static void MainMenu() {
		while(true) {
			System.out.println("=======================");
			System.out.println("Menu of PiggyBank");
			System.out.println("=======================");
			System.out.println("[1] one baht.");
			System.out.println("[2] two baht.");
			System.out.println("[3] five baht.");
			System.out.println("[4] ten baht.");
			System.out.println("[5] Exit");
			System.out.print("Please Select Menu[1-5] : ");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.print("Insert 1 Baht Money : ");
				int OneBaht = scan.nextInt();
				pb.addOne(OneBaht);
				System.out.println("Money Total : " +pb.getTotal());
				System.out.println();
			}
			else if(choice == 2) {
				System.out.print("Insert 2 Baht Money : ");
				int TwoBaht = scan.nextInt();
				pb.addTwo(TwoBaht);
				System.out.println("Money Total : " +pb.getTotal());
				System.out.println();
			}
			else if(choice == 3) {
				System.out.print("Insert 5 Baht Money : ");
				int FiveBaht = scan.nextInt();
				pb.addFive(FiveBaht);
				System.out.println("Money Total : " +pb.getTotal());
				System.out.println();
			}
			else if(choice == 4) {
				System.out.print("Insert 10 Baht Money : ");
				int TenBaht = scan.nextInt();
				pb.addTen(TenBaht);
				System.out.println("Money Total : " +pb.getTotal());
				System.out.println();
			}
			else if(choice == 5) {
				System.out.println("Bye Bye");
				break;
			}
		}
	}
	
}
