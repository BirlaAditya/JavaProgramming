package Unit_01;

import java.util.Scanner;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	 void palindromeOrNot(String s) {
		String a,b="";
		Scanner s1= new Scanner (System.in);
		System.out.println("Enter The String YouWant TO Check:");
		a=s1.nextLine():
			int n= a.length();
		for(int i= n- 1 ; i >= 0;i--)
		{
			b= b+a.charAt(i);
		}
		if (a.equalsIgnoreCase)

	}

	void reverseOfAString(String s) {
		// Write Logic Here!

	}
	
	void stringEqualOrNot(String s1,String s2) {
		// Write Logic Here!
		
	}
}