import java.util.*;
import java.lang.*;
class Q2
{
	public static void main (String[] args) throws java.lang.Exception
	{
             Scanner sc = new Scanner(System.in);  
             String s = sc.next();                                //taking input from keyboard
             Set<Integer> mySet = new HashSet<>();                //Creating new hashset
             for(int i = 0; i < s.length(); i++)
	     {
	             int ascii = (int) s.charAt(i);
	             if(ascii >= 65 && ascii <= 90) { mySet.add(ascii);}      //if character is lowercase-alphabet
	             if(ascii >= 97 && ascii <= 122){ mySet.add(ascii - 32);} //if character is uppercase-alphabet
	     }
	           Iterator iter = mySet.iterator();
	           int sum = 0;
                   while (iter.hasNext()) { sum = sum + (int) iter.next();} //summing up all the entries into mySet
                   if(sum == 2015) { System.out.println("yes");}            //if sum of 65,66,....90=2015 then all alphabets are there
                   else { System.out.println("no");}
	}
}
