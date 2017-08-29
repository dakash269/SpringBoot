import java.io.*;
import java.util.*;
class Q1 
{
   public static void main(String[] args) 
    {
        Q1 obj = new Q1();
        Scanner scan = new Scanner(System.in);
        String name = scan.next();                      //taking filename as input from keyboard
        String directory = "/home";
        obj.findFile(name,new File(directory));          //calling findFile method
    }
    public void findFile(String name,File file)
    {
        File[] list = file.listFiles();
        if(list!=null)                                           
        for (File fil : list) {
            if (fil.isDirectory()) {                             //going inside directory  
                 findFile(name,fil); 
               }
            else if (name.equalsIgnoreCase(fil.getName())) {      //ignoring cases in file name while searching
                 System.out.println(fil.getAbsolutePath());       //printing absolute path of file
               }
        }
    }
}
/*
Test cases will depend on your laptop/dekktop 
My test cases are:
1.
input: hi
output:
/home/zemoso/Pictures/hi
/home/zemoso/Downloads/hi
2.
input:E07
output:
/home/zemoso/Downloads/E07

3.
input:e07
output:/home/zemoso/Downloads/E07
*/
//we can use any regular expression pattern like only jpg file should be searched
