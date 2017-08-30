import java.util.Date;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
import java.net.InetAddress;
import java.util.regex.Matcher;
class PingTime {
	public static void main (String[] args) {
           String pattern =
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
           Scanner scanner = new Scanner(System.in);
	   System.out.println("Please Enter Host Ip Address");
	   String ip = scanner.next();
           if(ip.matches(pattern)) {
		   System.out.println("How many times you want to ping the host ?");
		   if(scanner.hasNextInt()) {
			   int n = scanner.nextInt();
			   ArrayList<Long> numArray = new ArrayList<Long>();
			   for(int i=0 ; i<n ; i++) {
			      numArray.add(ping(ip)); 
			   }
			   Collections.sort(numArray);
			   double median = 0;
			   if (n % 2 == 0) {
				    median = ((double)numArray.get(n/2) + (double) numArray.get((n/2 - 1)))/2;
			   }
			   else {
				    median = (double) numArray.get(n/2);
			   }
			   System.out.println(median+" ms");
		    }
		    else {
			   System.out.println("Number of times to ping should be integer");
		    }
	   } 
           else {
               System.out.println("Ip Address is in not valid");
           }
	}
       	public static long ping (String entryIpAddress){
            long pingtime = 0;
	    try {    
                 InetAddress inetAddress = InetAddress.getByName(entryIpAddress);
                 Date start = new Date();
			if (inetAddress.isReachable(1000)) {
				Date stop = new Date();
                                pingtime = stop.getTime() - start.getTime();
				//System.out.println(stop.getTime() - start.getTime());
			}
                        else {
                              System.out.println("Host is not reachable");
                              pingtime = -1;
                        }
                 return pingtime;
	    }
            catch(Exception e) {
              System.out.println(e);
            }
            return 0;
         }
}


