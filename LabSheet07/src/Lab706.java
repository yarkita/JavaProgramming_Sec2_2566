import javax.swing.*;
public class Lab706 {

	public static void main(String[] args) {
		int[] nums = {25,78,41,22,36,85,37};

		int indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		
		while(checkIndex(nums,indexNumb)) {
			indexNumb = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again: "));
		}
		
		int currentValue = currentData(nums,indexNumb);//method return value
		int previousValue = prevData(nums,indexNumb);
		int nextValue = nextData(nums,indexNumb);
		JOptionPane.showMessageDialog(null, "Current data,nums["+indexNumb+"] is "+currentValue+
				"\n"+((indexNumb-1<0)?"No Previous Data":("Previous data,nums["+(indexNumb-1)+"] is "+nums[previousValue]))+
				"\n"+((indexNumb+1<=nums.length)?"No Next Data":("Next data,nums["+(indexNumb+1)+"] is "+nums[nextValue])));
	}//end of main()
	
	public static boolean checkIndex(int[] nums, int index) {
	/*	if (index>=nums.length||(index<0)) {
			return true;
		}
		else {
			return false;
		}*/
		
		return ((index>=nums.length)||(index<0))?true:false;
		
	}//end of checkIndex()
	
	public static int currentData(int[] nums, int index) {
		return nums[index];
	}//end of currentData()
	
	public static int prevData(int[] nums, int index) {
		return index-1;
	}//end of prevData()
	
	public static int nextData(int[] nums, int index) {
		return index+1;
	}//end of nextData()

}
