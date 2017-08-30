import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class AlphabetSetFinder {
	public static String printMessage(String string){
		   try {
			   Set<Integer> alphabetSet = new HashSet<>();                //Creating new hashset
			   for (int i = 0; i < string.length(); i++) {
				   int ascii = (int) string.charAt(i);
				   // ascii value of 'a' is 65 and 'z' is 90. other alphabets have ascii value between 65 and 90 in alphabetic order
				   if (ascii >= 65 && ascii <= 90) {
					   alphabetSet.add(ascii);
				   }
				   // ascii value of 'A' is 97 and 'Z' is 132. other alphabets have ascii value between 65 and 90 in alphabetic order
				   if (ascii >= 97 && ascii <= 122) {
					   alphabetSet.add(ascii - 32);
				   }
			   }
			   Iterator iterator = alphabetSet.iterator();
			   int sumOfalphabetSet = 0;
			   //summing up all the entries into alphabetSet
			   while (iterator.hasNext()) {
				   sumOfalphabetSet = sumOfalphabetSet + (int) iterator.next();
			   }
			   //if sum of 65,66,....90=2015 then all alphabets are there
			   if (sumOfalphabetSet == 2015) {
				   return "yes, all 26 alphabets are in input string. ";
			   } else {
				   return "no, all 26 alphabets are not in input string. ";
			   }
		   }
		   catch (NullPointerException e){
		   	    return ("String can not be null.");
		   }
	}
}
