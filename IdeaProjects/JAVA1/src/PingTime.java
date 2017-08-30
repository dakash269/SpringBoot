import java.util.Date;
import java.util.Collections;
import java.util.ArrayList;
import java.net.InetAddress;
public class PingTime {
	public static double median (String ip,int numberOfPing) {
		String pattern =
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	    // Only if ip address is valid
	    if(ip.matches(pattern)) {
			// Only if number of times to ping is integer
				   ArrayList<Long> numArray = new ArrayList<Long>();
				   for(int i=0 ; i<numberOfPing ; i++) {
						numArray.add(getPingTime(ip)); // adding pingTime to an array
				   }
				   Collections.sort(numArray);  //Sorting pingTime array
				   double median = 0;
				   // Calculating meadian of pingTimes
				   if (numberOfPing % 2 == 0) {
						median = ((double)numArray.get(numberOfPing/2) + (double) numArray.get((numberOfPing/2 - 1)))/2;
				   }
				   else {
						median = (double) numArray.get(numberOfPing/2);
				   }
				   return median;
		}
		else {
	    	System.out.println("Ip Address " +ip + " is not valid");
			return -1;
		}
	}

	public static long getPingTime (String entryIpAddress){
		long pingtime = 0;
		try {
			 InetAddress inetAddress = InetAddress.getByName(entryIpAddress);
			 Date start = new Date();
			 // Only if ip address is reachable
			 if (inetAddress.isReachable(3000)) {
				Date stop = new Date();
				pingtime = stop.getTime() - start.getTime(); //Calculating pingTime
			 }
			 else {
				System.out.println("Ip address " +entryIpAddress + " is not reachable");
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


