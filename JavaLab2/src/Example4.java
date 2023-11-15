import java.text.*;
import javax.swing.*; //1. import library for input data from dialog box
public class Example4 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		//2. Display and input data from dialog box
		String productName = JOptionPane.showInputDialog("Input Product name: ");
		
		/*String strUnit = JOptionPane.showInputDialog("Input product unit: ");
		//convert string to int
		int unitPrice = Integer.parseInt(strUnit);*/
		
		int unitPrice = Integer.parseInt(JOptionPane.showInputDialog("Input Product unit: "));
		float pricePerUnit = Float.parseFloat(JOptionPane.showInputDialog("Input Price per unit: "));
		
		double totalPrice = unitPrice*pricePerUnit;
		double vat = totalPrice+(totalPrice*7/100);
		
		//show message from dialog box
		JOptionPane.showMessageDialog(null, "Total Price   is "+frm.format(totalPrice)+" baht."+
				"\nAdd VAT 7% is "+frm.format(vat)+" baht.");
	}
}
