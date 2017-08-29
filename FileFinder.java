import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class FileFinder {
   public static void main(String[] args) {
        FileFinder fileFinder = new FileFinder();
        Scanner scanner = new Scanner(System.in);
        String regex = scanner.next();                                       //taking filename as input from keyboard
        String directory = "/home";
        fileFinder.findFile( regex, new File(directory));                    //calling findFile method
    }
    public void findFile(String regex,File file) {
        File[] fileList = file.listFiles();
        if(fileList!= null) {                                          
           for (File fileFromList : fileList) {
		       if (fileFromList.isDirectory()) {                              //going inside directory  
		          findFile(regex,fileFromList); 
		       }
		       else if (fileFromList.getName().matches(regex)) {      //ignoring cases in file name while searching
		          System.out.println(fileFromList.getAbsolutePath());         //printing absolute path of file
		       }
           }
        }
     }
}
