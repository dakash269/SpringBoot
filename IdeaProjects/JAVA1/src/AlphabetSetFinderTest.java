import org.junit.Test;
import static org.junit.Assert.*;
public class AlphabetSetFinderTest {
    AlphabetSetFinder alphabetSetFinder = new AlphabetSetFinder();
    @Test
    public void printMessage() {
        assertEquals("yes, all 26 alphabets are in input string. ",alphabetSetFinder.printMessage("abcdefghijklmnopPqrstuvwxyz"));
        assertEquals("yes, all 26 alphabets are in input string. ",alphabetSetFinder.printMessage("ABCDEFGHIJKLMN OPQRSTUVWXYZ"));
        assertEquals("yes, all 26 alphabets are in input string. ",alphabetSetFinder.printMessage("abcdefghijklmnopqrstuvwxyzMNOPQRSTUVWXYZ"));
        assertEquals("no, all 26 alphabets are not in input string. ",alphabetSetFinder.printMessage("abcdefghijklmnopqrstuvw"));
        assertEquals("no, all 26 alphabets are not in input string. ",alphabetSetFinder.printMessage("abcdefghijkl+678mnopqrstuvabcdef"));
        assertEquals("no, all 26 alphabets are not in input string. ",alphabetSetFinder.printMessage(""));
        assertEquals("String can not be null.",alphabetSetFinder.printMessage(null));
    }

}