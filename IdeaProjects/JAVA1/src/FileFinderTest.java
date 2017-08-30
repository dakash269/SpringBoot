import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FileFinderTest {
    FileFinder fileFinder = new FileFinder();
    @Test
    public void Findthefiles() throws Exception {
        fileFinder.findFile( "hi", new File("/home"));                    //calling findFile method
        fileFinder.findFile( "fghbjnk", new File("/home"));                    //calling findFile method
        fileFinder.findFile( "^.*\\.(jpg)$", new File("/home"));                    //calling findFile method
        fileFinder.findFile( "E07", new File("/home"));                    //calling findFile method
    }

}