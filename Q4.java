import java.util.Scanner;
import java.lang.Exception;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;
import java.util.GregorianCalendar;
class Q4
{
	public static void main (String[] args) throws java.lang.Exception {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();                   //number of test cases as input
	  for(int j = 0;j < n; j++) {
		String signUp = sc.next();          //taking signup-date as input
		String current = sc.next();          //taking current-date as input
	        SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
	        Date signUpDate = f.parse(signUp);   //convert signup-date into date-format
		Date currentDate = f.parse(current);   //convert current-date into date-format
	        Calendar currentDateInstance = new GregorianCalendar();
		currentDateInstance.setTime(currentDate);
	        int currentDateYear = currentDateInstance.get(Calendar.YEAR);    //calculating year of current-date
	        Calendar signUpDateInstance = new GregorianCalendar();
		signUpDateInstance.setTime(signUpDate);
		int signUpDateYear = signUpDateInstance.get(Calendar.YEAR);   //calculating year of signup-date
		if(currentDateYear>=signUpDateYear) {
	                signUpDateInstance.add(GregorianCalendar.YEAR,currentDateYear - signUpDateYear);  //changing signup-date to its anniversary
		}
	        String s3 = f.format( signUpDateInstance.getTime());
	        Date date3 = f.parse(s3);                 //convert signup-anniversary into date-format
	        Calendar beforeSignUpDateInstance = GregorianCalendar.getInstance();
		beforeSignUpDateInstance.setTime(date3);
		beforeSignUpDateInstance.add( GregorianCalendar.DATE, -30 );   //calculating -30 days ahead date of signup-anniversary    
		Calendar afterSignUpDateInstance = GregorianCalendar.getInstance();
		afterSignUpDateInstance.setTime(date3);
		afterSignUpDateInstance.add( GregorianCalendar.DATE, 30 );    //calculating +30 days ahead date of signup-anniversary
		String beforeSignUp = f.format( beforeSignUpDateInstance.getTime());
		Date beforeSignUpDate = f.parse(beforeSignUp);              //convert signupdate-30 into date-format
	        String afterSignUp = f.format( afterSignUpDateInstance.getTime());
	        Date afterSignUpDate = f.parse(afterSignUp);              //convert signupdate+30 into date-format
                if(currentDateYear >= signUpDateYear) {
			  if(currentDate.compareTo(beforeSignUpDate) >= 0 && currentDate.compareTo(afterSignUpDate) >= 0) { 
			  	System.out.println(beforeSignUp + " " + afterSignUp);
			  }
				//if current-date is after that 60 days window
			  if(currentDate.compareTo(beforeSignUpDate) > 0 && currentDate.compareTo(afterSignUpDate) < 0) { 
			  	System.out.println(beforeSignUp + " " + current);
			  }
				//if current-date is between that 60 days window
			  if(currentDate.compareTo(beforeSignUpDate) <= 0 && currentDate.compareTo(afterSignUpDate) <= 0) { 
			  	System.out.println("No range");
			  }
				//if current-date is before that 60 days window
	        }
	        else {
	                    System.out.println("Signup date is in Future");
	        }
	  }
	}
}
