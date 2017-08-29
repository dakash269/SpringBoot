import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.lang.Exception;
class Q2 {
	public static void main (String[] args) throws java.lang.Exception {
             Scanner scanner = new Scanner(System.in);  
             String string = scanner.next();                                //taking input from keyboard
             Set<Integer> alphabetSet = new HashSet<>();                //Creating new hashset
             for(int i = 0; i < string.length(); i++) {
	             int ascii = (int) string.charAt(i);
	             if(ascii >= 65 && ascii <= 90) {  // ascii value of 'a' is 65 and 'z' is 90. other alphabets have ascii value between 65 and 90 in alphabetic order
			     alphabetSet.add(ascii);
		     }      //if character is lowercase-alphabet
	             if(ascii >= 97 && ascii <= 122) { // ascii value of 'A' is 97 and 'Z' is 132. other alphabets have ascii value between 65 and 90 in alphabetic order
			     alphabetSet.add(ascii - 32);
		     } //if character is uppercase-alphabet
	     }
	     Iterator iterator = alphabetSet.iterator();
	     int sumOfalphabetSet = 0;
	     while (iterator.hasNext()) { 
		     sumOfalphabetSet = sumOfalphabetSet + (int) iterator.next();
	     }               //summing up all the entries into alphabetSet
	     if(sumOfalphabetSet == 2015) { 
		   System.out.println("yes, all 26 alphabets are in input string. ");
	     }            //if sum of 65,66,....90=2015 then all alphabets are there
	     else { 
		   System.out.println("no, all 26 alphabets are not in input string. ");
	     }
	}
}
