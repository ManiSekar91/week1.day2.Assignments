package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
int array[] = {3,2,11,4,6,7};
int len = array.length;

Arrays.sort(array);
for (int i = 0; i < array.length; i++) {
	
}
System.out.println("Second Largest Value is:" + array [len -2]);
}
}