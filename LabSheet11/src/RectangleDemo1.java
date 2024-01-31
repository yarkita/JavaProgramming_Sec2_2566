import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		//input width,length,color from dialog box
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width:"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length:"));
		//String colorInput = JOptionPane.showInputDialog("Input color:");
		
		//send all data to Constructor from Rectangle Class
		/*Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		
		JOptionPane.showMessageDialog(null, obj1.toString()+"\n Area of Rectangle is "+obj1.getArea()); */
		//using interface Class
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane.showMessageDialog(null, obj2.toString()+"\n Area of Rectangle is "+obj2.getArea());
		
	}

}
