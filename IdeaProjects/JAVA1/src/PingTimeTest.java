import org.junit.Test;
public class PingTimeTest extends PingTime {
    PingTime pingTime = new PingTime();
    @Test
    public void ping() throws Exception {
        System.out.println("Median Pingtime to 192.168.86.60 is " + pingTime.median("192.168.86.60",5) + " ms");
        System.out.println("Median Pingtime to 192.168.86.64 is " + pingTime.median("192.168.86.64",5) + " ms");
        System.out.println("Median Pingtime to 192.168.86.54 is " + pingTime.median("192.168.86.32",5) + " ms");
        System.out.println("Median Pingtime to 192.168.86.647 is " + pingTime.median("1925.16.86.647",5) + " ms");
        System.out.println("Median Pingtime to 192.168.86.36 is " + pingTime.median("192.168.86.36",5) + " ms");
    }

}