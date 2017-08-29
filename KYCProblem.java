import java.util.Scanner;
import java.lang.Exception;
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;
import java.util.GregorianCalendar;
class KYCProblem {
	public static void main (String[] args) throws java.lang.Exception {
	  Scanner scanner = new Scanner(System.in);
	  if(scanner.hasNextInt()) {
	          int n = scanner.nextInt();                            //number of test cases as input
		  for(int j = 0;j < n; j++) {
			if(scanner.hasNext()) {
				String signUpString = scanner.next();           //taking signup-date as input
				String currentString = scanner.next();          //taking current-date as input
				String datePattern = "\\d{2}-\\d{2}-\\d{4}";
				Boolean isDate1 = signUpString.matches(datePattern);
				Boolean isDate2 = currentString.matches(datePattern);
				if(isDate1 && isDate2) {
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
					Date signUpDate = simpleDateFormat.parse(signUpString);     //convert signup-date into date-format
					Date currentDate = simpleDateFormat.parse(currentString);   //convert current-date into date-format
					Calendar currentDateInstance = new GregorianCalendar();
					currentDateInstance.setTime(currentDate);
					int currentDateYear = currentDateInstance.get(Calendar.YEAR);    //calculating year of current-date
					Calendar signUpDateInstance = new GregorianCalendar();
					signUpDateInstance.setTime(signUpDate);
					int signUpDateYear = signUpDateInstance.get(Calendar.YEAR);      //calculating year of signup-date
					if(currentDateYear>=signUpDateYear) {
						signUpDateInstance.add(GregorianCalendar.YEAR,currentDateYear - signUpDateYear);      //changing signup-date to its anniversary
					}
					String signUpAnniversaryString = simpleDateFormat.format( signUpDateInstance.getTime());
					Date signUpAnniversaryDate = simpleDateFormat.parse(signUpAnniversaryString);                 //convert signup-anniversary into date-format
					Calendar beforeSignUpDateInstance = GregorianCalendar.getInstance();
					beforeSignUpDateInstance.setTime(signUpAnniversaryDate);
					beforeSignUpDateInstance.add( GregorianCalendar.DATE, -30 );   //calculating -30 days ahead date of signup-anniversary    
					Calendar afterSignUpDateInstance = GregorianCalendar.getInstance();
					afterSignUpDateInstance.setTime(signUpAnniversaryDate);
					afterSignUpDateInstance.add( GregorianCalendar.DATE, 30 );     //calculating +30 days ahead date of signup-anniversary
					String beforeSignUpString = simpleDateFormat.format( beforeSignUpDateInstance.getTime());
					Date beforeSignUpDate = simpleDateFormat.parse(beforeSignUpString);              //convert signupdate-30 into date-format
					String afterSignUpString = simpleDateFormat.format( afterSignUpDateInstance.getTime());
					Date afterSignUpDate = simpleDateFormat.parse(afterSignUpString);                //convert signupdate+30 into date-format
					if(currentDateYear >= signUpDateYear) {
						  //if current-date is after that 60 days window
						  if(currentDate.compareTo(beforeSignUpDate) >= 0 && currentDate.compareTo(afterSignUpDate) >= 0) { 
							System.out.println(beforeSignUpString + " " + afterSignUpString);
						  }
						  //if current-date is between that 60 days window	
						  if(currentDate.compareTo(beforeSignUpDate) > 0 && currentDate.compareTo(afterSignUpDate) < 0) { 
							System.out.println(beforeSignUpString + " " + currentString);
						  }
						  //if current-date is before that 60 days window
						  if(currentDate.compareTo(beforeSignUpDate) <= 0 && currentDate.compareTo(afterSignUpDate) <= 0) { 
							System.out.println("No range");
						  }
					}
					else {
						    System.out.println("Signup date is in Future");
					}
				}
				else {
					System.out.println("Date format is not correct for input no." + (j+1));
				}
			}
			else {
				System.out.println("You have not given input for input no. " + (j+1) );
			}
		  }
	  }
          else {
	  System.out.println("Number of test cases should be integer");
	  }
       }
}
