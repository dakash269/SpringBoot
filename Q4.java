import java.util.*;
import java.lang.*;
import java.io.*;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;
class Q4
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();                   //number of test cases as input
	for(int j = 0;j < n; j++){
		String s1 = sc.next();          //taking signup-date as input
		String s2 = sc.next();          //taking current-date as input
	            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
	            Date date1 = f.parse(s1);   //convert signup-date into date-format
		    Date date2 = f.parse(s2);   //convert current-date into date-format
	            Calendar calendar2 = new GregorianCalendar();
		    calendar2.setTime(date2);
		    int year2 = calendar2.get(Calendar.YEAR);    //calculating year of current-date
	            Calendar calendar1 = new GregorianCalendar();
		    calendar1.setTime(date1);
		    int year1 = calendar1.get(Calendar.YEAR);   //calculating year of signup-date
		 if(year2>=year1) 
	            calendar1.add(GregorianCalendar.YEAR,year2-year1);  //changing signup-date to its anniversary
	         String s3 = f.format( calendar1.getTime());
		    Date date3 = f.parse(s3);                 //convert signup-anniversary into date-format
		    Calendar cal1 = GregorianCalendar.getInstance();
		    cal1.setTime(date3);
		    cal1.add( GregorianCalendar.DATE, -30 );   //calculating -30 days ahead date of signup-anniversary    
		    Calendar cal2 = GregorianCalendar.getInstance();
		    cal2.setTime(date3);
		    cal2.add( GregorianCalendar.DATE, 30 );    //calculating +30 days ahead date of signup-anniversary
		    String s4 = f.format( cal1.getTime());
		    Date date4 = f.parse(s4);              //convert signupdate-30 into date-format
		    String s5 = f.format( cal2.getTime());
		    Date date5 = f.parse(s5);              //convert signupdate+30 into date-format
           if(year2>=year1){
		  if(date2.compareTo(date4) >= 0 && date2.compareTo(date5) >= 0) System.out.println(s4 + " " + s5);
			//if current-date is after that 60 days window
		  if(date2.compareTo(date4) > 0 && date2.compareTo(date5) < 0) System.out.println(s4 + " " + s2);
			//if current-date is between that 60 days window
		  if(date2.compareTo(date4) <= 0 && date2.compareTo(date5) <= 0) System.out.println("No range");
			//if current-date is before that 60 days window
	     }
	   else
		   System.out.println("Signup date is in Future");
	  }
	}
}
/*
input:
7
16-07-2001 27-06-2017
24-02-2016 24-04-2017
16-05-2011 16-04-2017
11-09-2001 11-04-2016
04-04-2015 04-04-2016
06-04-2012 15-03-2016
25-01-2067 26-03-2017
 

output:
16-06-2017 27-06-2017
25-01-2017 26-03-2017
No range
No range
05-03-2016 04-04-2016
07-03-2015 15-03-2015
Signup date is inFuture
 
*/

