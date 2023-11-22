import javax.swing.*; //import library for input data from Dialog box
import java.text.*;
public class Example1 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		
		//input and convert data from dialog box
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));
		double priceAfterDiscount , totalPrice = 0;
		//calculate total price of buffet
		totalPrice = BUFFET * numberofCustomer;
		//using show message dialog box for display totalPrice
		//JOptionPane.showMessageDialog(null, "Amount to be paid is "+ frm.format(totalPrice)+" baht.");
		//using Confirm dialog box
		int memberCard;		
		do {
			memberCard = JOptionPane.showConfirmDialog(null,"Total Price is "+frm.format(totalPrice)+" baht."
					+"\nDo you have a member card?");			
		}while(memberCard==JOptionPane.CANCEL_OPTION);
		
		if (memberCard==JOptionPane.YES_OPTION) {
			//priceAfterDiscount = totalPrice - (totalPrice*10/100);
			priceAfterDiscount = totalPrice*90/100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+ frm.format(priceAfterDiscount)+" baht.");
		}//end of if
		
		else if (memberCard==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+ frm.format(totalPrice)+" baht.");
		}//end of else if

	}

}
