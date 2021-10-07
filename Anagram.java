package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "inam";
		String text2 = "mani";
		String a = "";
		String b = "";

		char[] charArray = text1.toCharArray();
		char[] charArray1 = text2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray1);
		a= String.valueOf(charArray);
		b=String.valueOf(charArray1);
		if (a.equals(b)) {
			System.out.println("The Values are Same");

		} else {
			System.out.println("The Values are different");
		}
	}
}
