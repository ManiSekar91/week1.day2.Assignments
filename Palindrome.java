package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
String pal = "madam";
String rev = "";
int len = pal.length();
for (int i = pal.length()-1; i >=0; i--) {
	rev = rev+pal.charAt(i);
	
}
if (pal.equals(rev)) {
	System.out.println("The String is a Palindrome");
}
else {
	System.out.println("The String is not a Palindrome");
}
}
}