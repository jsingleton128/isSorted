import java.util.Arrays;

public class isSorted {

	public static void main(String[] args) {

		double[] list1 = { 16.1, 12.3, 22.2, 14.4 };
		double[] list2 = { 1.5, 4.3, 7.0, 19.5, 25.1, 46.2 };
		double[] list3 = { 4.3, 1.5, 7.0, 19.5, 46.2, 25.1, 56.8 };
		double[] list4 = { 1.5, 4.3, 7.0, 19.5, 25.1, 46.2, 56.8, 97.2 };

		System.out.println("list 1 is " + isSorted(list1));
		System.out.println("list 2 is " + isSorted(list2));
		System.out.println("list 3 is " + isSorted(list3));
		System.out.println("list 4 is " + isSorted(list4));
		
	}// end of main

	public static boolean isSorted(double[] array) {
		int count = 0;
		double last = array[0];

		for (double n : array) {

			if (n >= last) {
				last = n;
				count++;
			}
		} // end of for loop

		if (count == array.length) {
			return true;
		} else {
			return false;
		}

	} // end of isSorted

}// end of class
