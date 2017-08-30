import org.junit.Test;

import static org.junit.Assert.*;

public class KYCProblemTest {
    KYCProblem kycProblem = new KYCProblem();
    @Test
    public void main() throws Exception {
     assertEquals("16-06-2017 27-06-2017",kycProblem.KYCwindow("16-07-1998", "27-06-2017"));
     assertEquals("Date format is not correct for input",kycProblem.KYCwindow("04-02-2016", "04-2014-07"));
     assertEquals("05-01-2017 06-03-2017",kycProblem.KYCwindow("04-02-2016", "04-04-2017"));
     assertEquals("Date can not be null",kycProblem.KYCwindow(null, "04-04-2017"));
     assertEquals("No range",kycProblem.KYCwindow("04-05-2017", "04-04-2017"));
     assertEquals("05-03-2016 04-04-2016",kycProblem.KYCwindow("04-04-2015", "04-04-2016"));
     assertEquals("Signup date is in Future",kycProblem.KYCwindow("04-02-2025", "04-04-2016"));
    }
}

