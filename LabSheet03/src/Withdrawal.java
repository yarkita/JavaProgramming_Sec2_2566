import javax.swing.*;
import java.text.*;
import java.util.*; //use library for Random class
public class Withdrawal {

	public static void main(String[] args) {
		//using class Random for random money
		Random rdmoney = new Random();
		int balance = rdmoney.nextInt(9) * 100000;
		DecimalFormat frm = new DecimalFormat("#,###");
		
		int moneytoWithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+frm.format(balance)+"\nInput money to withdraw :"));
		int money1000 = moneytoWithdraw/1000;
		int money500 = ((moneytoWithdraw%1000)/500);
		int money100 = (moneytoWithdraw%500)/100;
		
		if (moneytoWithdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}// end of if
		else if (moneytoWithdraw > 20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}//end of else if
		else if (moneytoWithdraw%100!=0 ) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+moneytoWithdraw%100+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdraw "+frm.format(moneytoWithdraw)+" baht."+"\n1,000 = "+money1000+"\n500 = "+money500+"\n100 = "+money100);
		}
	}

}
