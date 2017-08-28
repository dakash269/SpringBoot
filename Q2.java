import java.util.*;
import java.lang.*;

class Q2
{
	public static void main (String[] args) throws java.lang.Exception
	{
             Scanner sc=new Scanner(System.in);  
             String s=sc.next();
             Set<Integer> my = new HashSet<>();
             for(int i=0;i<s.length();i++)
	     {
	             int ascii = (int) s.charAt(i);
	             if(ascii>=65 && ascii<=90){ my.add(ascii);}
	             if(ascii>=97 && ascii<=122){my.add(ascii-32);}
	     }
	       Iterator iter = my.iterator();
	       int sum=0;
                   while (iter.hasNext()) { sum=sum+(int)iter.next();}
                   if(sum==2015){System.out.println("yes");}
                   else{System.out.println("no");}
	}
}
